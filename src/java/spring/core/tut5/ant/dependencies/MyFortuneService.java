/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.core.tut5.ant.dependencies;

import org.springframework.stereotype.Component;

/**
 *
 * @author Prashant-PC
 */
@Component("myFortuneService")
public class MyFortuneService implements FortuneService{

    @Override
    public String getFortuneService() {
        return "Its your luckey day!!";
    }
    
}
