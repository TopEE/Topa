/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad.util;

import org.junit.Ignore;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

@Ignore
public abstract class JPABaseTest extends BaseTest {

    /**
     * Executes a unit of work.
     * <p/>
     * The unit of work will be executed inside a new transaction with a newly
     * created entity manager.
     *
     * @param unitOfWork The unit of work that needs to be executed
     * @throws Exception If an exception happens we roolback the transaction and re-throw
     *                   the exception.
     */
    public void perform(UnitOfWork unitOfWork) {
        EntityTransaction tx;
        try {
            unitOfWork.em = PersistenceHelper.getEntityManagerFactory().createEntityManager();
            tx = unitOfWork.em.getTransaction();
            tx.begin();
            unitOfWork.work();
            tx.commit();
        } catch (PersistenceException e) {
            e.printStackTrace();
            throw e;
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

}