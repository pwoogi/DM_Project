package com.dmaker.dm_project.service;

import com.dmaker.dm_project.dto.CreateDeveloper;
import com.dmaker.dm_project.model.Developer;
import com.dmaker.dm_project.type.DeveloperSkillType;
import com.dmaker.dm_project.repository.DeveloperRepository;
import com.dmaker.dm_project.type.DeveloperLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DMakerService {

    private final DeveloperRepository developerRepository;


    @Transactional
    public void createDeveloper(CreateDeveloper.Request request){
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();

        developerRepository.save(developer);
    }
}
