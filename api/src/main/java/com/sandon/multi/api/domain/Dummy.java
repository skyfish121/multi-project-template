package com.sandon.multi.api.domain;

public class Dummy {

    private Long id;

    private String value;

    public Dummy() {
        // Default constructor is required for JPA
    }

    public Dummy(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
