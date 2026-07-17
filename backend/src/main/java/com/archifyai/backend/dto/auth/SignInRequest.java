package com.archifyai.backend.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class SignInRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

    // This class represents a request to sign in to the Archify AI backend. It contains fields for the user's email and password, both of which are marked as @NotBlank, indicating that they are required and cannot be empty. The email field is also marked with @Email, which validates that the input is in a valid email format. The class includes getter and setter methods for each field to allow for easy access and modification of the data when processing the sign-in request.