package org.example.entities;

import org.example.EventType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="eventi")
public class gestioneEvento {
    @Id
    @GeneratedValue
    private long id;

    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private EventType tipoEvento;
    private int numeroMassimoPartecipanti;

    @ManyToOne
    @JoinColumn(name = "luogo_evento_id")
    private location luogoEvento;

    @OneToMany(mappedBy = "event")
    private List<partecipazione> listaPartecipazioni;

    public gestioneEvento() {
    }

    public gestioneEvento(String titolo, LocalDate dataEvento, String descrizione,EventType tipoEvento, int numeroMassimoPartecipanti, location location) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.luogoEvento = location;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EventType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public location getLuogoEvento() {
        return luogoEvento;
    }

    public void setLuogoEvento(location luogoEvento) {
        this.luogoEvento = luogoEvento;
    }

    public List<partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                ", location=" + luogoEvento +
                '}';
    }
}
