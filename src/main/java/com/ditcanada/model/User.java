package com.ditcanada.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class User implements Serializable {

    private long id;
    private String lastname;
    private String firstname;
    private String username;
    private String password;
    private Timestamp createdTS;
    private Timestamp lastLoginTS;
}
