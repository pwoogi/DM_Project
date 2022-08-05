package com.dmaker.dm_project.repository;

import com.dmaker.dm_project.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
