package com.archifyai.backend.dto.auth;

public record AuthUserDto(String id, String username, String email) {
}
// This record class represents a Data Transfer Object (DTO) for an authenticated user in the Archify AI backend. It contains fields for the user's ID, username, and email address. This DTO is used to transfer user information in the authentication response and other related operations.
