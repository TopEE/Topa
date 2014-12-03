/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad.service;

import dk.morgenmad.util.JPABaseTest;
import dk.morgenmad.util.PersistenceHelper;
import dk.morgenmad.util.UnitOfWork;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JC
 */
public class BrugerTest extends JPABaseTest {
    
    public BrugerTest() {
    } 
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");        
        Bruger instance = new Bruger();
        instance.setName("Lisbeth Cappelen");
        instance.setUserId("LPP");
        perform(new UnitOfWork() {
            @Override
            public void work() {
                em.persist(instance);
            }
        });
        
        perform(new UnitOfWork() {
            @Override
            public void work() {
                Bruger u = em.find(Bruger.class, 1L);
                assertNotNull(u.getId());
            }
        });
        
    }

    /**
     * Test of setId method, of class User.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1L;
        Bruger instance = new Bruger();
        instance.setId(id);
        Long result = instance.getId();
        assertEquals(id, result);
    }

    /**
     * Test of toString method, of class User.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Bruger instance = new Bruger();
        instance.setId(1L);
        String expResult = "1";
        String result = instance.toString();
        assertEquals(expResult, result);
    
    }
    
}
