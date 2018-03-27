package org.demo.sbh.persist;

import org.demo.sbh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    List<User> findByNickname(String nickname);

    List<User> findByUsernameAndNickname(String username, String nickname);

}
