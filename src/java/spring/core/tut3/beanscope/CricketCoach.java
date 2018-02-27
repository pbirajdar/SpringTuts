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
public class CricketCoach implements Coach{

    @Override
    public String getDailyTask() {
        return "Get 50 wickets in 15 over!";
    }
    
    public void doInitProcess()
    {
        System.out.println("initializing the object...");
    }
    
    public void doDestroyProcess()
    {
        System.out.println("Destroying the object...");
    }
    
}
