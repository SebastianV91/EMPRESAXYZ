/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.dao;

import com.xyz.entities.TarjetaCredito;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sebastian
 */
@Stateless
public class TarjetaCreditoFacade extends AbstractFacade<TarjetaCredito> implements TarjetaCreditoFacadeLocal {

    @PersistenceContext(unitName = "XYZPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarjetaCreditoFacade() {
        super(TarjetaCredito.class);
    }
    
}
