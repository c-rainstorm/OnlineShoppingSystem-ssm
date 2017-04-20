package com.github.crainstorm.oss.user.dao;

import com.github.crainstorm.oss.user.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by chen on 4/17/17.
 */

@Repository
public interface UserDao {
    int checkLogin(User user);

    int insertUser(User user);
}
