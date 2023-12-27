package com.modelmapperproject.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer userId;

    private String firstName;

    private String LastName ;

    private String email;

    private Boolean status;

    private String fullName;

}
