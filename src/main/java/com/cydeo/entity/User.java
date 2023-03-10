package com.cydeo.entity;

import com.cydeo.enums.Gender;

import java.time.LocalDateTime;

public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String passWord;
    private boolean enabled;
    private Role role;
    private Gender gender;
    private String phone;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String passWord, boolean enabled, Role role, Gender gender, String phone) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
        this.phone = phone;
    }
}
