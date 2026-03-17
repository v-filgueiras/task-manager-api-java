package com.vfilgueiras.GerenciadordeTasks.infrastructure.dto;

import java.time.LocalDate;
import com.vfilgueiras.GerenciadordeTasks.domain.model.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UpdateProjectDataDTO {
    public String name;
    public String description;
    public LocalDate finalDate;
    public ProjectStatus projectStatus;

    public UpdateProjectDataDTO(String name, String description, LocalDate finalDate, ProjectStatus projectStatus) {
        this.name = name;
        this.description = description;
        this.finalDate = finalDate;
        this.projectStatus = projectStatus;
    }

    public UpdateProjectDataDTO() {}
}
