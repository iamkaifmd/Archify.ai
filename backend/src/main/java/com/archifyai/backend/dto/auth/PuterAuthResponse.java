package com.archifyai.backend.dto.auth;

public class PuterAuthResponse {

    private final String userId;
    private final String username;
    private final String puterUuid;

    public PuterAuthResponse(String userId, String username, String puterUuid) {
        this.userId = userId;
        this.username = username;
        this.puterUuid = puterUuid;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPuterUuid() {
        return puterUuid;
    }
}
        // This class represents the response returned by the authentication endpoint when a user logs in using their Puter account. It contains fields for the user's ID, username, and Puter UUID. This response is used to transfer authentication information back to the client after a successful login.