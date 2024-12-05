package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginInfo;
import com.example.demo.repository.LoginInfoRepository;

@Service
public class LoginService {

    @Autowired
    private LoginInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public LoginInfo authenticate(String userId, String rawPassword) {
        return repository.findByUserId(userId)
                .filter(user -> passwordEncoder.matches(rawPassword, user.getPassword()))
                .orElseThrow(() -> new RuntimeException("ログイン失敗: ユーザーIDまたはパスワードが正しくありません。"));
    }
}

