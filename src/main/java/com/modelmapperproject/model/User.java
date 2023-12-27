package com.modelmapperproject.model;

import lombok.Data;

//@Entity
@Data
public class User {
    private Integer userId;

    private String firstName;

    private String LastName ;

    private String email;

    private Boolean status;
}
