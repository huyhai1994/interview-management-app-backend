package com.codegym.interviewmanagementapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private int statusCode;
    private String expirationTime;
    private String message;
    private String token;
    private String role;
    private UserDTO user;

}
