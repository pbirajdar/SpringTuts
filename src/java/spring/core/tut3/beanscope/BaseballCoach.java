/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut3.beanscope;

/**
 *
 * @author Prashant-PC
 */
public class BaseballCoach implements Coach{

    @Override
    public String getDailyTask() {
        return "get 10 goals in 45 minutes!";
    }
    
}
