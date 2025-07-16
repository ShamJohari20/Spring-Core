package com.nit.sj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sj.sbeans.A;
import com.nit.sj.sbeans.B;

public class CyclicDITest {
	
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cfg = new FileSystemXmlApplicationContext("src/com/nit/sj/cfg/ApplicationContext.xml");
		
		A a1 = (A)cfg.getBean("A1");
		System.out.println("A : " + a1);
		
		B b1 = (B)cfg.getBean("B1");
		System.out.println("B : " + b1);
		
		cfg.close();
	}
	
	
}
