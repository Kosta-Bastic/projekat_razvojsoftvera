package com.project.controller;

import com.project.model.entities.HighSchool;
import com.project.repository.HighSchoolRepository;
import com.project.shared.dtos.SrednjaSkolaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/srednja-skola")
public class HighSchoolController {

    @Autowired
    private HighSchoolRepository highSchoolRepository;

    @PostMapping(path = "/add")
    public Long addSrednjaSkola(@RequestBody SrednjaSkolaDTO dto) {
        HighSchool h = new HighSchool();
        h.setNaziv(dto.getNaziv());
        h.setMesto(dto.getMesto());
        h.setVrsta(dto.getVrstaSkole());
        HighSchool saved = highSchoolRepository.save(h);
        return saved.getId();
    }

    @GetMapping(path = "/all")
    public List<SrednjaSkolaDTO> getAll() {
        List<SrednjaSkolaDTO> ret = new ArrayList<>();
        List<HighSchool> all = highSchoolRepository.findAll();
        for (HighSchool h : all) {
            SrednjaSkolaDTO dto = new SrednjaSkolaDTO();
            dto.setId(h.getId());
            dto.setNaziv(h.getNaziv());
            dto.setMesto(h.getMesto());
            dto.setVrstaSkole(h.getVrsta());
            ret.add(dto);
        }
        return ret;
    }
}