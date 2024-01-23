package org.example;

import org.example.dao.EventDAO;
import org.example.entities.gestioneEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("prova");

    public static void main(String[] args) {

        EntityManager em=emf.createEntityManager();

        EventDAO ed= new EventDAO(em);

        gestioneEvento evento1= new gestioneEvento("matrimonio","2024-1-1", "evento su spiaggia", EventType.PRIVATO,50 );
        gestioneEvento evento2= new gestioneEvento("compleanno","2023-11-12", "evento con gonfiabili", EventType.PRIVATO,20 );
        gestioneEvento evento3= new gestioneEvento("festa camposcuola","2023-10-1", "evento con musica e acqua", EventType.PUBBLICO,200 );

        ed.save(evento1);
        ed.save(evento2);
        ed.save(evento3);

//        long id=2;
//        gestioneEvento compl=ed.findiId(id);
//        if(compl!=null){
//            System.out.println(compl);
//        }else {
//            System.out.println("ops");
//        }

        em.close();
        emf.close();



    }
}
