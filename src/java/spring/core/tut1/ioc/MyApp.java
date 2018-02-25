/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut1.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Prashant-PC
 */
public class MyApp {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("file:D:\\CodeXs\\SpringDemos\\SpringCore\\web\\WEB-INF\\applicationContext.xml");
        
        Coach cricketCoach = context.getBean("cricketCoach",Coach.class);
        Coach footballCoach = context.getBean("footballCoach",Coach.class);
        Coach hockeyCoach = context.getBean("hockeyCoach",Coach.class);
        
        System.out.println("Cricket Coach: "+cricketCoach.getMyTaskFromCoach());
        System.out.println("Football Coach: "+footballCoach.getMyTaskFromCoach());
        System.out.println("Hockey Coach: "+hockeyCoach.getMyTaskFromCoach());
        
    }
}
