package com.spring.boot.myself.configureout.random;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 其他配置的配置(读取出来的数据是不正确的,这里面的yml文件是不顶用的)
 *
 * @author lihuaqing
 * @date 2019-12-23
 */
@Data
@PropertySource(value = "classpath:other.properties")
@ConfigurationProperties(prefix = "other")
@Component
public class OtherProperties {
    private String shifu;

    private List<String> friends;
}
