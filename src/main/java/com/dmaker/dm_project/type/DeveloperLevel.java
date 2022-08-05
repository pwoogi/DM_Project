package com.dmaker.dm_project.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeveloperLevel {
    NEW("신입 개발자"),
    JUNIOR("주니어 개발자"),
    JUNGIOR("중니어 개발자"),
    SENIOR("시니어 개발자");

    private final String description;
}
