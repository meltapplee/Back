package com.example.poststudy.domain.user.domain.repository;

import com.example.poststudy.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
