package com.example.poststudy.domain.user.domain.repository;


import com.example.poststudy.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByAccountId(String accountId);
    boolean existsByAccountId(String accountId);
}
