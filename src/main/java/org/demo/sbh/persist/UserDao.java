package org.demo.sbh.persist;

import org.demo.sbh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
