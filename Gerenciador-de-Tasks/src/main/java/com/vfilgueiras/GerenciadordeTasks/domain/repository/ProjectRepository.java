package com.vfilgueiras.GerenciadordeTasks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vfilgueiras.GerenciadordeTasks.domain.entity.ProjectEntity;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, String>{}
