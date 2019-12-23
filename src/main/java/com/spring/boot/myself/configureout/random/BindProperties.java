package com.spring.boot.myself.configureout.random;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 数据绑定的配置类(这个绑定只能绑定主配置的信息)
 *
 * @author lihuaqing
 * @date 2019-12-23
 */
@Component
@Data
@ConfigurationProperties(prefix = "environments")
@ConditionalOnProperty(prefix = "environments", value = "enable")
public class BindProperties {
    //绑定map对象
    private Map<String, String> dev;

    private Map<String, String> prod;

    //绑定list
    private List<String> server;

    //测试宽松绑定（yml版本）
    private String firstName;

    private String secondName;

    private String thirdName;

    //测试绑定对象(这里面的绑定对象，刚才采用的内部类的方法是不能用的)
    private InnerBind innerClass;

}
