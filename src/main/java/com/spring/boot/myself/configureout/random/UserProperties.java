package com.spring.boot.myself.configureout.random;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 用户的基础配置
 *
 * @author lihuaqing
 * @date 2019-12-18
 */
@Data
@ConfigurationProperties(prefix = "user")
@Component
public class UserProperties {

    private String name;

    private Integer age;
}
