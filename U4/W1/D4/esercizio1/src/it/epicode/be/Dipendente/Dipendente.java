package it.epicode.be.Dipendente;

public class Dipendente {
    public static double stipendioBase=1000;

    private String matricola;
    private double stipendio;
    private double importoOrorarioStraordinario;

    public enum Livello {
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    }

    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }
//ho definito la variabile livello sul modello di enum Livello
    private Livello livello;
    private Dipartimento dipartimento;



    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento=dipartimento;
        stipendio=stipendioBase;
        importoOrorarioStraordinario=30;
        livello=Livello.OPERAIO;

    }

    public Dipendente(String matricola, double stipendio, double importoOrorarioStraordinario, Dipartimento dipartimento, Livello livello) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrorarioStraordinario = importoOrorarioStraordinario;

        this.dipartimento = dipartimento;
        this.livello = livello;


    }

    public void data() {
        System.out.println("Questo dipendente è matricola: " + this.matricola);
        System.out.println("Il suo dipartimento è : " + this.dipartimento);
        System.out.println("La sua posizione è : " + this.livello);
        stipendiobasecalcolato();
        System.out.println("L'importo orario straordinario è : " + this.importoOrorarioStraordinario);


    }

    public void stipendiobasecalcolato() {
        if (this.livello == Livello.OPERAIO) {
            System.out.println("lo stiprndio base è: " + stipendioBase);
        } else if (this.livello == Livello.IMPIEGATO) {
            System.out.println("lo stiprndio base è: " + (stipendioBase * 1.2));

        } else if (this.livello == Livello.QUADRO) {
            System.out.println("lo stiprndio base è: " + (stipendioBase * 1.5));

        } else if (this.livello == Livello.DIRIGENTE) {
            System.out.println("lo stiprndio base è: " + (stipendioBase * 2));

        }

    }

    public void Livelloaggiornato() {
        switch (this.livello) {
            case OPERAIO:
                livello = Livello.IMPIEGATO;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                break;
            case DIRIGENTE:
                livello = Livello.DIRIGENTE;
                break;

        }
    }




}
