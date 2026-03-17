package com.vfilgueiras.GerenciadordeTasks.domain.entity;

import java.time.LocalDate;
import com.vfilgueiras.GerenciadordeTasks.domain.model.ProjectStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
public class ProjectEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "project_id", nullable = false)
    private String id;

    @Column(name = "project_name", nullable = false, length = 56)
    public String name;

    @Column(name = "project_description", nullable = false ,length = 256)
    public String description;

    @Column(name = "initial_date", nullable = false)
    public LocalDate initialDate;

    @Column(name = "final_date", nullable = false)
    public LocalDate finalDate;

    @Column(name = "project_status", nullable = false)
    @Enumerated(EnumType.STRING)
    public ProjectStatus projectStatus;

    public ProjectEntity(String id, String name, String description, LocalDate initialDate, LocalDate finalDate, ProjectStatus projectStatus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.projectStatus = projectStatus;
    }

    public ProjectEntity() {}
}
