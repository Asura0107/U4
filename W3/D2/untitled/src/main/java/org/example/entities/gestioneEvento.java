package org.example.entities;

import org.example.EventType;

import javax.persistence.*;

@Entity
@Table(name="eventi")
public class gestioneEvento {
    @Id
    @GeneratedValue
    private long id; //chiave primaria

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "dataevento")
    private String data;

    @Column(name = "descrizione")
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name="maxpartecipanti")
    private int maxpartecipanti;

    public gestioneEvento(){

    }

    public gestioneEvento(String titolo, String data, String descrizione, EventType eventType, int maxpartecipanti) {
        this.titolo = titolo;
        this.data = data;
        this.descrizione = descrizione;
        this.eventType = eventType;
        this.maxpartecipanti = maxpartecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getData() {
        return data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public EventType getEventType() {
        return eventType;
    }

    public int getMaxpartecipanti() {
        return maxpartecipanti;
    }
}
