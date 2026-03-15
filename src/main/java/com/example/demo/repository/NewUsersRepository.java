package com.example.demo.repository;

import com.example.demo.model.NewUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewUsersRepository extends JpaRepository<NewUsers,Integer> {
  /*  Optional<NewUsers> findByEmail(String email);

    @Query("SELECT u from NewUsers u WHERE " +
            "LOWER(u.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(u.email) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<NewUsers> searchUsers(String keyword);*/
}
