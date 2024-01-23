package org.example.dao;

import org.example.entities.gestioneEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private final EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save(gestioneEvento ev){
        EntityTransaction transaction= em.getTransaction();// mi da inizio alla transazione con il db
        transaction.begin();
        em.persist(ev);
        transaction.commit();
        System.out.println("evento" + ev.getTitolo() +"aggiunto");
    }

    public gestioneEvento findiId(long id){
        return em.find(gestioneEvento.class,id);
    }

    public void delete(long id){
        gestioneEvento found=this.findiId(id);
        if (found!=null){
            EntityTransaction transaction= em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("eliminato id: "+id);
        }else {
            System.out.println("non trovato");
        }
    }
}
