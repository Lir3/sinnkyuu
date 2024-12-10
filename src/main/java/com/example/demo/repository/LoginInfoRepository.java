package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoginInfo;

public interface LoginInfoRepository extends JpaRepository<LoginInfo, Integer> {
    Optional<LoginInfo> findByUserId(String userId);
}
