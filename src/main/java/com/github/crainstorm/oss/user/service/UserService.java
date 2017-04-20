package com.github.crainstorm.oss.user.service;

import com.github.crainstorm.oss.user.entity.User;

/**
 * Created by chen on 4/17/17.
 */
public interface UserService {
    boolean loginSuccess(User user);

    void testTransaction();
}
