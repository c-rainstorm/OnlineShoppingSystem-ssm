package com.github.crainstorm.oss.user.action;

import com.github.crainstorm.oss.user.entity.User;
import com.github.crainstorm.oss.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chen on 4/17/17.
 */
@Controller
@RequestMapping("/user")
public class UserAction {

    private static Logger logger = LogManager.getLogger(UserAction.class);
    @Autowired
    private UserService service;

    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    @ResponseBody
    public String checkLogin(@RequestBody User user) {
        logger.trace("enter checkLogin...");
        if (logger.isDebugEnabled()) {
            logger.debug(user);
        }
        return Boolean.TRUE.toString();
//        if (service.loginSuccess(user)) {
//            logger.info("login success...");
//            return "redirect:/index.jsp";
//        } else {
//            logger.info("login failed...");
//            return "login/user";
//        }
    }

    @RequestMapping("testTransaction")
    public String testTransaction() {
        if (AopUtils.isAopProxy(service)) {
            logger.debug("service is aop proxy..");
        } else {
            logger.debug("service isn't aop proxy...");
        }
        service.testTransaction();

        return "redirect:/index.jsp";
    }
}
