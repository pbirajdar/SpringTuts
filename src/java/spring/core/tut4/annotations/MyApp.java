/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut4.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Prashant-PC
 */
public class MyApp {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:D:\\CodeXs\\SpringDemos\\SpringCore\\web\\WEB-INF\\applicationContext.xml");
        
        Coach teniseCoach = context.getBean("teniseCoachAnt",Coach.class);
        
        System.out.println(teniseCoach.getDailyWorkout());
    }
}
