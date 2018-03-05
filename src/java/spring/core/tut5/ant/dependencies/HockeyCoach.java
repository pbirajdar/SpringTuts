/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut5.ant.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Prashant-PC
 */
@Component("hockeyCoachAntFieldInj")
public class HockeyCoach implements Coach{
    @Autowired
    @Qualifier("myFortuneService")
    FortuneService fortuneService;
    
    
    @Override
    public String getDailyTasks() {
        return "do 50 goals!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService()+":From Hockey Coach";
    }
    
}
