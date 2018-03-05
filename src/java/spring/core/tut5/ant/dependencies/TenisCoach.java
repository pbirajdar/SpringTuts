/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut5.ant.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Prashant-PC
 */
@Component("teniseCoachAntMethodSetter")
public class TenisCoach implements Coach{

    FortuneService fortuneService;
    
    @Autowired
    public void doCrazyStuff(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyTasks() {
        return "Score 45 points!";
    }

    @Override
    public String getDailyFortune() {
       return fortuneService.getFortuneService()+":From Tenise Coach";
    }
    
}
