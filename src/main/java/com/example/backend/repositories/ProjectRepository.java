package com.example.backend.repositories;

import com.example.backend.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByServicesId(Long servicesId);
    List<Project> findTop7ByOrderByIdDesc();
}