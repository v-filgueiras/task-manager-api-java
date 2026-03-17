package com.vfilgueiras.GerenciadordeTasks.domain.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import com.vfilgueiras.GerenciadordeTasks.domain.entity.ProjectEntity;
import com.vfilgueiras.GerenciadordeTasks.domain.model.ProjectStatus;
import com.vfilgueiras.GerenciadordeTasks.domain.repository.ProjectRepository;
import com.vfilgueiras.GerenciadordeTasks.infrastructure.dto.ProjectDataDTO;
import com.vfilgueiras.GerenciadordeTasks.infrastructure.dto.UpdateProjectDataDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectEntity createProject(ProjectDataDTO projectDTO) {
        ProjectEntity newProject = ProjectEntity
        .builder()
        .name(projectDTO.getName())
        .description(projectDTO.getDescription())
        .initialDate(LocalDate.now())
        .finalDate(projectDTO.getFinalDate())
        .projectStatus(ProjectStatus.PENDING)
        .build();
        
        projectRepository.save(newProject);

        return newProject;
    }


    public ProjectEntity getProjectByID(String projectID) {
        return projectRepository
                .findById(projectID)
                .orElseThrow(()-> new RuntimeException("O projeto nao foi encontrado."));
    }

    public ProjectEntity deleteProjectByID(String projectID) {
        ProjectEntity deleteProject = getProjectByID(projectID);
        projectRepository.deleteById(projectID);
        return deleteProject;
    }

    public ProjectEntity updateProjectByID(String projectID, UpdateProjectDataDTO projectDTO) {

        ProjectEntity updateProject = projectRepository
            .findById(projectID)
            .orElseThrow(() -> new RuntimeException("O projeto nao foi encontrado."));

        updateProject.setName(projectDTO.getName());
        updateProject.setDescription(projectDTO.getDescription());
        updateProject.setFinalDate(projectDTO.getFinalDate());
        updateProject.setProjectStatus(projectDTO.getProjectStatus());

        return projectRepository.save(updateProject);
    }
}
