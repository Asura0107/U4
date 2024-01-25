package org.example.dao;

import org.example.entities.persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class personaDAO {
    private final EntityManager em;

    public personaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(persona ev){
        EntityTransaction transaction= em.getTransaction();// mi da inizio alla transazione con il db
        transaction.begin();
        em.persist(ev);
        transaction.commit();
        System.out.println("persona" + ev.getNome() +"aggiunta");
    }

    public persona findiId(long id){
        return em.find(persona.class,id);
    }

    public void delete(long id){
        persona found=this.findiId(id);
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
