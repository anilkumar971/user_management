package com.example.demo.service;

import com.example.demo.dto.RequestResponse;

public interface EmailUserService {

    RequestResponse register(RequestResponse registerRequest);
    RequestResponse verifyOtp(String email, String otp);

}
