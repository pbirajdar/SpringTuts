/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut1.ioc;

/**
 *
 * @author Prashant-PC
 */
public class CricketCoach implements Coach{

    @Override
    public String getMyTaskFromCoach() {
        return "run for getting 50 wickets in 15 over!";
    }
    
}
