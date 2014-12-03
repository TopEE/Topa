/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad.util;

import javax.persistence.EntityManager;

public abstract class UnitOfWork {

    protected EntityManager em;

    public abstract void work();

}
