/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut2.dependcy;

/**
 *
 * @author Prashant-PC
 */
public class BaseballCoach implements Coach{

    private FortuneService myFortuneService;
    
    public BaseballCoach(FortuneService theFortuneService)
    {
        myFortuneService = theFortuneService;
    }
    @Override
    public String getDailyTask() {
        return "Run 50 rounds of ground!";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }
    
}
