/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad.service;

import javax.ejb.Stateless;

/**
 *
 * @author JC
 */
@Stateless
public class HelloBean {
    
    public String hello() {
      return "Hello from HelloBean";
    }
         
    
}
