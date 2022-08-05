package com.dmaker.dm_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmProjectApplication.class, args);
    }

}
