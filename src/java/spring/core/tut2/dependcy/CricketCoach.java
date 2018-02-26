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
public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailId;
    private String teamName;

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getTeamName() {
        return teamName;
    }
    
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyTask() {
        return "get 50 wickets in 15 overs!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
