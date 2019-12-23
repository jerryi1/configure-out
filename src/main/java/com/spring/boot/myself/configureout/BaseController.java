package com.spring.boot.myself.configureout;

import com.spring.boot.myself.configureout.random.BaseService;
import com.spring.boot.myself.configureout.random.BindProperties;
import com.spring.boot.myself.configureout.random.OtherProperties;
import com.spring.boot.myself.configureout.random.RandomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 创建基础的控制层
 *
 * @author lihuaqing
 * @date 2019-12-18
 * */
@RestController
@RequestMapping("/base")
public class BaseController {
    @Autowired
    private BaseService baseService;

    @Autowired
    private RandomProperties randomProperties;

    @Autowired
    private OtherProperties otherProperties;

    @Autowired(required = false)
    private BindProperties bindProperties;

    @GetMapping("/info")
    public ResponseEntity<?> getUserInfo() {
        return ResponseEntity.ok(baseService.getUserInfo());
    }

    @GetMapping("/random/properties")
    public ResponseEntity<?> getRandom() {
        System.out.println("绑定的属性:" + bindProperties);

        System.out.println("绑定的随机数:" + randomProperties);

        System.out.println("其他配置文件的配置信息：" + otherProperties);

        return ResponseEntity.ok(bindProperties);
    }
}
