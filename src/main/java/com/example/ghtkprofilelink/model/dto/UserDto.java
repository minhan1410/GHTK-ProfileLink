package com.example.ghtkprofilelink.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
//    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
//    private Integer role;
}
