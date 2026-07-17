package com.archifyai.backend.dto.auth;

public record AuthResponse(String token, AuthUserDto user) {
}

// This record class represents the response returned by the authentication endpoint in the Archify AI backend. It contains a token field, which is a string representing the authentication token, and a user field, which is an instance of AuthUserDto containing information about the authenticated user.