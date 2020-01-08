package com.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfiguration //启动dubbo,完成配置
@SpringBootApplication
@MapperScan("com.dubbo.*")
public class DubboProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProvideApplication.class, args);
	}

}
