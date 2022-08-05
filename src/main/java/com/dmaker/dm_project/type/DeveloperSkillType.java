package com.dmaker.dm_project.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeveloperSkillType {
    BACK_END("백엔드 개발자"),
    FRONT_END("프론트 개발자"),
    FULL_STACK("풀스텍 개발자");

    private final String description;
}
