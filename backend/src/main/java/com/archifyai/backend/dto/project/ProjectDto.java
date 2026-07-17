package com.archifyai.backend.dto.project;

public record ProjectDto(
        String id,
        String name,
        String thumbnail,
        String sourceImage,
        String renderedImage,
        String renderedPath,
        String ownerId,
        long timestamp,
        boolean isPublic
) {
}

// This record class represents a Data Transfer Object (DTO) for a project in the Archify AI backend. It contains fields for the project's ID, name, thumbnail, source image, rendered image, rendered path, owner ID, timestamp, and whether the project is public or not.     