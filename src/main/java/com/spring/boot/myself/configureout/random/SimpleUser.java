package com.spring.boot.myself.configureout.random;

import lombok.Data;

@Data
class SimpleUser {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 爱好
     */
    private String hobbit;
}
