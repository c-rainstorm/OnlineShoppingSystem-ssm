package com.github.crainstorm.oss.user.service;

import com.github.crainstorm.oss.user.dao.UserDao;
import com.github.crainstorm.oss.user.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 4/17/17.
 */
@EnableTransactionManagement
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao dao;

    @Transactional(readOnly = true)
    public boolean loginSuccess(User user) {
        int num = dao.checkLogin(user);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("selected " + num + " records....");
        }
        return num > 0;
    }

    @Transactional
    public void testTransaction() {
        User user1 = new User();
        user1.setPhone("11111111111");
        user1.setUsername("user1");
        user1.setPassword("user1");
        user1.setBirthday("2000-01-01");

        dao.insertUser(user1);
        dao.insertUser(user1);
    }

}
