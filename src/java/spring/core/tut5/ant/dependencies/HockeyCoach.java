/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut5.ant.dependencies;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Prashant-PC
 */
@Component("hockeyCoachAntFieldInj")
@Scope("singleton")
public class HockeyCoach implements Coach{
    @Autowired
    @Qualifier("myFortuneService")
    FortuneService fortuneService;
    
    @PostConstruct
    public void doInitStuff()
    {
        System.out.println("Initilizing HockeyCoach Object...");
    }
    @PreDestroy
    public void doDestroyStuff()
    {
        System.out.println("Destroying Hockey Object...");
    }
    @Override
    public String getDailyTasks() {
        return "do 50 goals!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService()+":From Hockey Coach";
    }
    
}
