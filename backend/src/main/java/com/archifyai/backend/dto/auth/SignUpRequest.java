package com.archifyai.backend.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignUpRequest {

    @NotBlank
    @Size(min = 2, max = 60)
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 120)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

// This class represents a request to sign up for an account in the Archify AI backend. It contains fields for the user's username, email, and password, all of which are marked as @NotBlank, indicating that they are required and cannot be empty. The username field has a size constraint of 2 to 60 characters, while the password field has a size constraint of 6 to 120 characters. The email field is also marked with @Email, which validates that the input is in a valid email format. The class includes getter and setter methods for each field to allow for easy access and modification of the data when processing the sign-up request.