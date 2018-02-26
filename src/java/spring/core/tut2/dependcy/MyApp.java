/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut2.dependcy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Prashant-PC
 */
public class MyApp {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:D:\\CodeXs\\SpringDemos\\SpringCore\\web\\WEB-INF\\applicationContext.xml");
        Coach baseballCoach = context.getBean("baseballCoach",Coach.class);
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(baseballCoach.getDailyTask());
        
        //Using Setter Injection
        Coach cricketCoach = context.getBean("cricketCoachSetter", Coach.class);
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyTask());
        
        //Using literal injection
        CricketCoach cricketCoachLiteral = context.getBean("cricketCoachSetter", CricketCoach.class);
        System.out.println("Email id: "+cricketCoachLiteral.getEmailId());
        System.out.println("Team Name: "+cricketCoachLiteral.getTeamName());
        System.out.println("Fortune: "+cricketCoachLiteral.getDailyFortune());
        System.out.println("Task: "+cricketCoachLiteral.getDailyTask());
    }
}
