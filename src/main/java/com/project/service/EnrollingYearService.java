package com.project.service;

import com.project.mapper.EnrollingYearMapper;
import com.project.model.dtos.EnrollingYearDTO;
import com.project.model.entities.EnrollingYear;
import com.project.repository.EnrollingYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnrollingYearService {
    @Autowired
    private EnrollingYearRepository enrollingYearRepository;

    public List<EnrollingYearDTO> getRetriedYears(Long indexID) {
        List<EnrollingYearDTO> retriedYearsDTO = new ArrayList<>();
        List<EnrollingYear> retriedYears = enrollingYearRepository.findRetriedYears(indexID);
        for(EnrollingYear e : retriedYears) {
            retriedYearsDTO.add(EnrollingYearMapper.toDTO(e));
        }
        return retriedYearsDTO;
    }
}
