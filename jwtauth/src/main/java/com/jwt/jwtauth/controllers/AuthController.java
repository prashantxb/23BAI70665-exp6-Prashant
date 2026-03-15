package com.jwt.jwtauth.controllers;

import com.jwt.jwtauth.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")

public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {

        String username = user.get("username");
        String password = user.get("password");

        if ("user123".equals(username) && "password123".equals(password)) {

            String token = jwtUtil.generateToken(username);

            Map<String, String> response = new HashMap<>();
            response.put("token", token);

            return response;
        }

        throw new RuntimeException("Invalid credentials");
    }

    @GetMapping("/protected")
    public String protectedRoute() {
        return "JWT Authentication successful!";
    }
}