package org.example.dao;

import org.example.entities.location;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class locationDAO {
    private final EntityManager em;

    public locationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(location ev){
        EntityTransaction transaction= em.getTransaction();// mi da inizio alla transazione con il db
        transaction.begin();
        em.persist(ev);
        transaction.commit();
        System.out.println("location" + ev.getCitta() +"aggiunta");
    }

    public location findiId(long id){
        return em.find(location.class,id);
    }

    public void delete(long id) {
        location found = this.findiId(id);
        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("eliminato id: " + id);
        } else {
            System.out.println("non trovato");
        }
    }
}
