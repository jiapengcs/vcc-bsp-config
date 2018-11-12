package com.jiapengcs.vcc.bsp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/11
 */
// 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class VccBspConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(VccBspConfigApplication.class, args);
    }
}
