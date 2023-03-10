package com.cydeo.enums;

public enum Gender {
    MALE("Male"),Female("Female");
    private String value;

    public String getValue() {
        return value;
    }

     Gender(String value) {
        this.value = value;
    }
}

