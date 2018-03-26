package org.demo.sbh.persist;

import org.demo.sbh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface UserDao extends JpaRepository<User, Long> {
}
