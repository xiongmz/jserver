package com.jamininfo.modules;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 本应用统一的SpringBoot启动器入口
 * @author xiongmz
 *
 */
@SpringBootApplication
@MapperScan("cn.com.whty")
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
