package com.nit.sj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sj.config.AppConfig;
import com.nit.sj.stone.Printer;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("App.main()");
        
        try(
        	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
        	Printer printer1 = ctx.getBean("p1",Printer.class);
        	Printer printer2 = ctx.getBean("p1",Printer.class);
        	
        	System.out.println("Printer 1 "+ printer1.hashCode());
        	printer1.printMessage("Printer 1");

        	System.out.println("Printer 2 "+ printer2.hashCode());
        	printer2.printMessage("Printer 2");
        	System.out.println("=============App.main()==================");
        	Printer printer3 = ctx.getBean("p2",Printer.class);
        	Printer printer4 = ctx.getBean("p2",Printer.class);
        	
        	System.out.println("Printer 3 "+ printer3.hashCode());
        	printer1.printMessage("Printer 3");
        	
        	System.out.println("Printer 4 "+ printer4.hashCode());
        	printer2.printMessage("Printer 4");
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
