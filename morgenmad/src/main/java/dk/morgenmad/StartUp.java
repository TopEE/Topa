/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad;

import dk.morgenmad.service.Bruger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JC
 */
@Singleton
@Startup
public class StartUp {
    @PersistenceContext(name = "MorgenmadTest")
    EntityManager em;
    
    @PostConstruct
    public void init() {
        Bruger u = new Bruger();
        em.persist(u);
    }
}
