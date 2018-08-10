package com.zhengcq.datasercher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhengcq.datasercher.dao")
public class DatasercherApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasercherApplication.class, args);
	}

	public void test3(){
		System.out.println("test3");
	}
}
