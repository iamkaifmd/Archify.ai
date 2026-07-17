package com.archifyai.backend.dto.project;

import jakarta.validation.constraints.NotBlank;
// This class represents a request to create a new project in the Archify AI backend. It contains fields for the project's name, source image, thumbnail, and whether the project is public or not. The source image field is marked as @NotBlank, indicating that it is required and cannot be empty. The class includes getter and setter methods for each field to allow for easy access and modification of the data when processing the request.
public class CreateProjectRequest {

    private String name;

    @NotBlank
    private String sourceImage;

    private String thumbnail;

    private Boolean isPublic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(String sourceImage) {
        this.sourceImage = sourceImage;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }
}

// This class represents a request to create a new project in the Archify AI backend. It contains fields for the project's name, source image, thumbnail, and whether the project is public or not. The source image field is marked as @NotBlank, indicating that it is required and cannot be empty. The class includes getter and setter methods for each field to allow for easy access and modification of the data when processing the request.