package com.project.controller;

import com.project.model.entities.StudentInfo;
import com.project.repository.StudentInfoRepository;
import com.project.repository.StudyProgramRepository;
import com.project.shared.dtos.StudentDTO;
import com.project.service.StudentProfileService;
import com.project.service.StudentInfoService;
import com.project.service.EnrollingYearService;
import com.project.service.PaymentService;
import com.project.utils.ParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudyProgramRepository studyProgramRepository;
    @Autowired
    private StudentProfileService studentProfileService;
    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private EnrollingYearService enrollingYearService;
    @Autowired
    private StudentInfoRepository studentInfoRepository;

    @PostMapping(path = "/profile/{studentIndexID}")
    public Object getStudentProfile(@PathVariable Long studentIndexID) {
        return studentProfileService.getStudentProfile(studentIndexID);
    }

    @PostMapping(path = "/webprofile/{studenIndexID}")
    public Object getStudentWebProfile(@PathVariable Long studenIndexID) {
        return studentProfileService.getStudentWebProfile(studenIndexID);
    }

    @PostMapping(path = "/webprofile/email")
    public Object getStudentWebProfileByEmail(@RequestParam String email) {
        String[] parsedEmail = ParseUtils.ParseEmail(email);
        if (parsedEmail != null) {
            return studentProfileService.getStudentWebProfileByEmail(parsedEmail);
        }
        return null;
    }

    @PostMapping(path = "/add")
    public Long addNewStudentInfo(@RequestBody StudentDTO dto) {
        if (dto == null) return null;

        StudentInfo si = new StudentInfo();
        si.setFirstName(dto.getIme());
        si.setLastName(dto.getPrezime());
        si.setMiddleName(dto.getSrednjeIme());
        si.setJmbg(dto.getJmbg());
        Date d = dto.getDatumRodjenja();
        if (d != null) {
            LocalDate ld = Instant.ofEpochMilli(d.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
            si.setDateOfBirth(ld);
        }
        si.setPlaceOfBirth(dto.getMestoRodjenja());
        si.setPlaceOfResidence(dto.getMestoStanovanja());
        si.setCountryOfBirth(dto.getDrzavaRodjenja());
        si.setCitizenshipStatus(dto.getDrzavljanstvo());
        si.setNationality(dto.getNacionalnost());
        if (dto.getPol() != null && !dto.getPol().isEmpty()) {
            si.setGender(dto.getPol().charAt(0));
        }
        si.setAddress(dto.getAdresa());
        si.setPhoneNumber(dto.getBrojTelefona());
        si.setEmail(dto.getEmailFakultet() != null ? dto.getEmailFakultet() : dto.getEmailPrivatni());
        si.setIDCardNumber(dto.getLicnaKarta());

        StudentInfo saved = studentInfoRepository.save(si);
        return saved != null ? saved.getId() : null;
    }

    @GetMapping(path = "/all")
    public List<StudentDTO> getAllStudents() {
        List<com.project.model.entities.StudentInfo> all = studentInfoRepository.findAll();
        List<StudentDTO> ret = new ArrayList<>();
        for (com.project.model.entities.StudentInfo si : all) {
            ret.add(mapToSharedDTO(si));
        }
        return ret;
    }

    @GetMapping(path = "/pronadji")
    public List<StudentDTO> findStudentsByName(@RequestParam(name = "ime", required = false) String ime) {
        List<com.project.model.entities.StudentInfo> all = studentInfoRepository.findAll();
        List<StudentDTO> ret = new ArrayList<>();
        if (ime == null || ime.isBlank()) {
            for (com.project.model.entities.StudentInfo si : all) ret.add(mapToSharedDTO(si));
            return ret;
        }
        String lower = ime.toLowerCase();
        for (com.project.model.entities.StudentInfo si : all) {
            if (si.getFirstName() != null && si.getFirstName().toLowerCase().contains(lower)) {
                ret.add(mapToSharedDTO(si));
            } else if (si.getLastName() != null && si.getLastName().toLowerCase().contains(lower)) {
                ret.add(mapToSharedDTO(si));
            }
        }
        return ret;
    }

    @GetMapping(path = "/godina-upisa")
    public List<StudentDTO> getByGodinaUpisa(@RequestParam(name = "godinaUpisa") Integer godinaUpisa) {
        List<StudentDTO> ret = new ArrayList<>();
        for (com.project.model.entities.StudentInfo si : studentInfoRepository.findAll()) {
            ret.add(mapToSharedDTO(si));
        }
        return ret;
    }

    @GetMapping(path = "/studprogram")
    public List<StudentDTO> getByStudProgram(@RequestParam(name = "studProg") String studProg) {
        List<StudentDTO> ret = new ArrayList<>();
        for (com.project.model.entities.StudentInfo si : studentInfoRepository.findAll()) {
            if (si.getId() == null) continue;
            ret.add(mapToSharedDTO(si));
        }
        return ret;
    }

    private StudentDTO mapToSharedDTO(com.project.model.entities.StudentInfo si) {
        StudentDTO dto = new StudentDTO();
        dto.setGodinaUpisa(null);
        dto.setPol(si.getGender() != null ? si.getGender().toString() : null);
        dto.setIme(si.getFirstName());
        dto.setPrezime(si.getLastName());
        dto.setSrednjeIme(si.getMiddleName());
        dto.setJmbg(si.getJmbg());
        if (si.getDateOfBirth() != null) {
            Instant instant = si.getDateOfBirth().atStartOfDay(ZoneId.systemDefault()).toInstant();
            dto.setDatumRodjenja(new Date(instant.toEpochMilli()));
        }
        dto.setMestoRodjenja(si.getPlaceOfBirth());
        dto.setDrzavaRodjenja(si.getCountryOfBirth());
        dto.setDrzavljanstvo(si.getCitizenshipStatus());
        dto.setNacionalnost(si.getNationality());
        dto.setAdresa(si.getAddress());
        dto.setMestoStanovanja(si.getPlaceOfResidence());
        dto.setBrojTelefona(si.getPhoneNumber());
        dto.setEmailFakultet(si.getEmail());
        dto.setEmailPrivatni(null);
        dto.setLicnaKarta(si.getIDCardNumber());
        if (si.getHighSchool() != null) {
            dto.setSrednjaSkola(si.getHighSchool().getNaziv());
        }
        return dto;
    }
}