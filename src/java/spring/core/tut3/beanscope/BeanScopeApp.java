/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut3.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Prashant-PC
 */
public class BeanScopeApp {
    
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("file:D:\\CodeXs\\SpringDemos\\SpringCore\\web\\WEB-INF\\applicationContext.xml");
        //We also testing the init method and destroy method of the singleton bean.
        //Singleton object-1
        Coach cricketCoach1 = context.getBean("cricketCoachScope", Coach.class);
        //Singleton Object-2
        Coach cricketCoach2 = context.getBean("cricketCoachScope", Coach.class);
        //ensuring that above 2 singleton object are same or not.
        boolean result = (cricketCoach1 == cricketCoach2);
        //printing the results
        System.out.println("Pointing to the same objects:\t"+result);
        System.out.println("Memory Location Of first object:\t"+cricketCoach1);
        System.out.println("Memory Location Of second object:\t"+cricketCoach2);
        
        //Now testing prototype objects.
        //Prototype beans lifecycle does not contains the destroy method. We can add only init method.
        Coach baseballCoach1 = context.getBean("baseballCoachScope", Coach.class);
        Coach baseballCoach2 = context.getBean("baseballCoachScope", Coach.class);
        
        boolean result2 = (baseballCoach1 == baseballCoach2);
        
        //printing the results
        System.out.println("Pointing to the same objects:\t"+result2);
        System.out.println("Memory Location Of first object:\t"+baseballCoach1);
        System.out.println("Memory Location Of second object:\t"+baseballCoach2);
        
        context.close();
    }
}
