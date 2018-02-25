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
public class FootballCoach implements Coach{

    @Override
    public String getMyTaskFromCoach() {
        return "run 50 rounds of ground to kick 50 goals!";
    }
    
}
