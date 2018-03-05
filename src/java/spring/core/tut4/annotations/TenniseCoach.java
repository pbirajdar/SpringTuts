/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut4.annotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author Prashant-PC
 */
@Component("teniseCoachAnt")
public class TenniseCoach implements Coach{

    @Override
    public String getDailyWorkout() {
       return "get your backhand volley!"; 
    }
    
}
