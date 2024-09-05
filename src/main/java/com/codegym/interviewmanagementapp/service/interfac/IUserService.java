package com.codegym.interviewmanagementapp.service.interfac;

import com.codegym.interviewmanagementapp.dto.LoginRequest;
import com.codegym.interviewmanagementapp.dto.Response;
import com.codegym.interviewmanagementapp.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response deleteUser(String userId);

    Response getUserById(String userId);

}
