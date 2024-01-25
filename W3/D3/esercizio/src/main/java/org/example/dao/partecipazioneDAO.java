package org.example.dao;

import org.example.entities.partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class partecipazioneDAO {
    private final EntityManager em;

    public partecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(partecipazione ev){
        EntityTransaction transaction= em.getTransaction();// mi da inizio alla transazione con il db
        transaction.begin();
        em.persist(ev);
        transaction.commit();
        System.out.println("partecipazione "+ev.getpersonaa()+" all'evento: " + ev.getEvento()+"aggiunta");
    }

    public partecipazione findiId(long id){
        return em.find(partecipazione.class,id);
    }

    public void delete(long id) {
        partecipazione found = this.findiId(id);
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
