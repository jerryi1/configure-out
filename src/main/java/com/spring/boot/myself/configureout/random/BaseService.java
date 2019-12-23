package com.spring.boot.myself.configureout.random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * 基础的控制层
 *
 * @author lihuaqing
 * @date 2019-12-18
 */
@Service
@EnableConfigurationProperties(value = UserProperties.class)
public class BaseService {

    @Value(value = "${user.hobbit}")
    private String hobbit;

    private final UserProperties userProperties;

    public BaseService(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public SimpleUser getUserInfo() {
        SimpleUser user = new SimpleUser();
        BeanUtils.copyProperties(userProperties, user);
        user.setHobbit(hobbit);
        return user;
    }
}
