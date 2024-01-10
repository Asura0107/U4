package it.epicode.be.SIM;

public class Sim {
    private String numero;
    private double credito;
    private Chiamata[] lista;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.lista = new Chiamata[5];

    }



    public void Aggiungicredito(double newcredito) {
        this.credito+=newcredito;
    }

    public void setLista(Chiamata[] lista) {
        this.lista = lista;
    }

    public void data() {
        System.out.println("Sim: "+ this.numero);
        System.out.println("Credito: "+ this.credito);
        if (lista[0] != null) {
            System.out.println("- Chiamata 1: " + lista[0].getNumeroChiamato() + " - Durata minuti: "
                    + lista[0].getDurata());
        }
        if (lista[1] != null) {
            System.out.println("- Chiamata 2: " + lista[1].getNumeroChiamato() + " - Durata minuti: "
                    + lista[1].getDurata());
        }
        if (lista[2] != null) {
            System.out.println("- Chiamata 3: " + lista[2].getNumeroChiamato() + " - Durata minuti: "
                    + lista[2].getDurata());
        }
        if (lista[3] != null) {
            System.out.println("- Chiamata 4: " + lista[3].getNumeroChiamato() + " - Durata minuti: "
                    + lista[3].getDurata());
        }
        if (lista[4] != null) {
            System.out.println("- Chiamata 5: " + lista[4].getNumeroChiamato() + " - Durata minuti: "
                    + lista[4].getDurata());
        }

    }

}
