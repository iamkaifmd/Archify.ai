package com.archifyai.backend.dto.auth;

import jakarta.validation.constraints.NotBlank;

public class PuterSignInRequest {

    @NotBlank
    private String puterUuid;

    @NotBlank
    private String username;

    public String getPuterUuid() {
        return puterUuid;
    }

    public void setPuterUuid(String puterUuid) {
        this.puterUuid = puterUuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
// This class represents a request to sign in using a Puter account in the Archify AI backend. It contains fields for the Puter UUID and username, both of which are marked as @NotBlank, indicating that they are required and cannot be empty. The class includes getter and setter methods for each field to allow for easy access and modification of the data when processing the sign-in request.