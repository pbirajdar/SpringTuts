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
@Component("crickCoach")
public class CricketCoach implements Coach{

    FortuneService myFortuneService;
    @Autowired
    public CricketCoach(FortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    
    @Override
    public String getDailyTasks() {
        return "get 15 wickets in 15 overs!!";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortuneService();
    }
    
}
