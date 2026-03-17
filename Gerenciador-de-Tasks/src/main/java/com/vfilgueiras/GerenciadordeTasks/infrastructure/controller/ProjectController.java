package com.vfilgueiras.GerenciadordeTasks.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vfilgueiras.GerenciadordeTasks.domain.entity.ProjectEntity;
import com.vfilgueiras.GerenciadordeTasks.domain.service.ProjectService;
import com.vfilgueiras.GerenciadordeTasks.infrastructure.dto.ProjectDataDTO;
import com.vfilgueiras.GerenciadordeTasks.infrastructure.dto.UpdateProjectDataDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor

public class ProjectController {

    private final ProjectService projectService;
    @PostMapping
    public ResponseEntity<ProjectEntity> createProject(@RequestBody ProjectDataDTO projectDataDTO) {
        ProjectEntity newProject = projectService.createProject(projectDataDTO);
        return ResponseEntity.status(201).body(newProject);
    }


    @GetMapping("/{projectID}")
    public ResponseEntity<ProjectEntity> getUserByID(@PathVariable String projectID) {
        ProjectEntity getProject = projectService.getProjectByID(projectID);
        return ResponseEntity.ok(getProject);
    }

    @DeleteMapping("/{projectID}")
    public ResponseEntity<ProjectEntity> deleteUserByID(@PathVariable String projectID) {
        ProjectEntity deleteProject = projectService.deleteProjectByID(projectID);
        return ResponseEntity.ok(deleteProject);
    }

    @PutMapping("/{projectID}")
    public ResponseEntity<ProjectEntity> updateProjectByID(
            @PathVariable String projectID, 
            @RequestBody UpdateProjectDataDTO updateDataDTO) {

        ProjectEntity updateProject = projectService.updateProjectByID(projectID, updateDataDTO);
        return ResponseEntity.ok(updateProject);
    }
}
