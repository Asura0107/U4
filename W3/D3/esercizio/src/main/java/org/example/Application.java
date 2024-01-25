package org.example;

import com.github.javafaker.Faker;
import org.example.dao.EventDAO;
import org.example.dao.locationDAO;
import org.example.dao.partecipazioneDAO;
import org.example.dao.personaDAO;
import org.example.entities.gestioneEvento;
import org.example.entities.location;
import org.example.entities.partecipazione;
import org.example.entities.persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Application {
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("test2");

    public static void main(String[] args) {

        EntityManager em=emf.createEntityManager();

        EventDAO ed= new EventDAO(em);
        locationDAO ld=new locationDAO(em);
        partecipazioneDAO pd=new partecipazioneDAO(em);
        personaDAO prd=new personaDAO(em);
        Faker faker= new Faker(Locale.CHINA);

        location location1=new location(faker.address().city(), faker.address().cityName());
//        ld.save(location1);

        location location2=new location(faker.address().city(), faker.address().cityName());
//        ld.save(location2);
        Random r=new Random();

        persona persona=new persona(faker.leagueOfLegends().champion(), faker.harryPotter().character(), faker.internet().emailAddress(),
                    LocalDate.now(), r.nextInt(2)==0?'M':'F');
//        prd.save(persona);



//        for (int i=0; i<10;i++){
//            ed.save(new gestioneEvento(faker.dragonBall().character(), LocalDate.now(),faker.elderScrolls().quote(),
//                    r.nextInt(2)==0? EventType.PRIVATO:EventType.PUBBLICO,r.nextInt(15,200),r.nextInt(2)==0?location1:location2));
//        }
        persona pers1=prd.findiId(3);
        gestioneEvento event=ed.findiId(8);

        partecipazione partecipazione=new partecipazione(pers1,event);
        pd.save(partecipazione);





//        gestioneEvento evento1= new gestioneEvento("matrimonio", LocalDate.now(), "evento su spiaggia", EventType.PRIVATO,50 );
//        gestioneEvento evento2= new gestioneEvento("compleanno",LocalDate.now().minusMonths(3), "evento con gonfiabili", EventType.PRIVATO,20 );
//        gestioneEvento evento3= new gestioneEvento("festa camposcuola",LocalDate.now().plusMonths(4), "evento con musica e acqua", EventType.PUBBLICO,200 );
//
//        ed.save(evento1);
//        ed.save(evento2);
//        ed.save(evento3);



        em.close();
        emf.close();



    }
}
