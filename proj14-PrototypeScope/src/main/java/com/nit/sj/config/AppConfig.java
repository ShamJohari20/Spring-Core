package com.nit.sj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sj.sbeans.Printer;
@Configuration
@ComponentScan(basePackages = "com.nit.sj.sbeans")
public class AppConfig {
	
	@Bean(name = "p1")
	public Printer getPrinter1() {
		System.out.println("AppConfig.getPrinter1()");
		return Printer.getInstance();
	}
	
	@Bean(name = "p2")
	public Printer getPrinter2() {
		System.out.println("AppConfig.getPrinter2()");
		return Printer.getInstance();
	}
	
}
