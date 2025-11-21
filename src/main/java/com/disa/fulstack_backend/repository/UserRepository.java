package com.disa.fulstack_backend.repository;

import com.disa.fulstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
