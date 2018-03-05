/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut5.ant.dependencies;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Prashant-PC
 */
public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("file:D:\\CodeXs\\SpringDemos\\SpringCore\\web\\WEB-INF\\applicationContext.xml");
        
        Coach cricketCoach = context.getBean("crickCoach", Coach.class);
        
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyTasks());
        
        
        //Setter Injection
        Coach baseBallCoach = context.getBean("baseBallCoachAntSetter", Coach.class);
        System.out.println(baseBallCoach.getDailyFortune());
        System.out.println(baseBallCoach.getDailyTasks());
        
        //Method Injection
        TenisCoach tenisCoach = context.getBean("teniseCoachAntMethodSetter", TenisCoach.class);
        System.out.println(tenisCoach.getDailyTasks());
        System.out.println(tenisCoach.getDailyFortune());
        
        //Field Injection
        Coach hockeyCoach = context.getBean("hockeyCoachAntFieldInj", Coach.class);
        System.out.println(hockeyCoach.getDailyFortune());
        System.out.println(hockeyCoach.getDailyTasks());
        
        context.close();
    }
}
