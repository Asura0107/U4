package org.example.entities;

import javax.persistence.*;
@Entity
@Table(name="partecipazione")
public class partecipazione {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "personaa_id")
    private persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private gestioneEvento event;
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public partecipazione() {
    }

    public partecipazione(persona persona, gestioneEvento event) {
        this.persona = persona;
        this.event = event;
        this.stato = Stato.DA_CONFERMARE;
    }

    public long getId() {
        return id;
    }


    public persona getpersonaa() {
        return persona;
    }

    public void setpersona(persona persona) {
        this.persona = persona;
    }


    public gestioneEvento getEvento() {
        return event;
    }

    public void setEvento(gestioneEvento event) {
        this.event= event;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", personaa=" + persona +
                ", gestioneEventoo=" + event +
                ", stato=" + stato +
                '}';
    }
}
