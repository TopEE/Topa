/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Assert;

/**
 *
 * @author JC
 */
public class PersistenceHelper {
    private static EntityManagerFactory instance;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (instance == null) {
            try {
                instance = Persistence.createEntityManagerFactory("MorgenmadTest");
            } catch (Exception ex) {
                ex.printStackTrace();
                Assert.fail("Exception during JPA EntityManager instanciation.");
                throw new RuntimeException("Could not create entitymanager");
            }
        }
        return instance;
    }
    
}