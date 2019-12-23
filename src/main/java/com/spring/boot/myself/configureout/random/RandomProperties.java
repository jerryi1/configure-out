package com.spring.boot.myself.configureout.random;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置文件的随机数(我们总结出来的配置文件读取数据，是一次性读取数据。后面在进行刷新获取数据，应该都是从内存中获取的。)
 *
 * @author lihuaqing
 * @date 2019-12-23
 */
@ConfigurationProperties(prefix = "my")
@Data
@Component
public class RandomProperties {
    //随机数值
    private String secret;

    //随机int值，并且设置了最大值
    @Value("${my.number.in.range}")
    private Integer numInRange;

    //随机long
    private Long bignumber;

    //随机字符串(uuid)
    private String uuid;

    //设置最大值
    @Value("${my.number.less.than.ten}")
    private Integer numberLessThanTen;

}
