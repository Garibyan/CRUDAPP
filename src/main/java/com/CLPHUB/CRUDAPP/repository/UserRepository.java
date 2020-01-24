package com.CLPHUB.CRUDAPP.repository;

import com.CLPHUB.CRUDAPP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
