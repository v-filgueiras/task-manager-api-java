package com.vfilgueiras.GerenciadordeTasks.infrastructure.dto;

import java.time.LocalDate;
import com.vfilgueiras.GerenciadordeTasks.domain.model.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProjectDataDTO {
    public String name;
    public String description;
    public LocalDate initialDate;
    public LocalDate finalDate;
    public ProjectStatus projectStatus;

    public ProjectDataDTO(String name, String description, LocalDate initialDate, LocalDate finalDate, ProjectStatus projectStatus) {
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.projectStatus = projectStatus;
    }
}

