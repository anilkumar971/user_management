package com.example.demo.repository;

import com.example.demo.model.NewUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<NewUsers,Long> {
    //NewUsers findByEmail(String email);
}
