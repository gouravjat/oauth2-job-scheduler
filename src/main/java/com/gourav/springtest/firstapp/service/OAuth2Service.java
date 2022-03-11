package com.gourav.springtest.firstapp.service;

public class OAuth2Service {

    private final long id;
    private final String content;

    public OAuth2Service(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
