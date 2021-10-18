package com.dio.accesscontrol.repository;

import com.dio.accesscontrol.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
