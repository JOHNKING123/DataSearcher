package com.zhengcq.datasercher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatasercherApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasercherApplication.class, args);
	}

	public void test1(){
		System.out.println("test1");
	}

	public void test2(){
		System.out.println("test2");
	}
}
