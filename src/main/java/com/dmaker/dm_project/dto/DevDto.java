package com.dmaker.dm_project.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Getter
@Setter
@Slf4j
@Builder
public class DevDto {
    String name;
    Integer age;
    LocalDateTime startAt;

}
