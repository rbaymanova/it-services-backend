package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeProjectsDTO {
    private Long id;
    private String title;
    private String thumbnail;
    private String description;
    private Long servicesId;

}
