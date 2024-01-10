package it.epicode.be.Rettangolo;

public class Rettangolo {
    private int lato1;
    private int lato2;
    public Rettangolo(int lato1, int lato2){
        this.lato1=lato1;
        this.lato2=lato2;
    }

    public int Area(){
        return lato1*lato2;
    }
    public int Perimetro(){
        return (lato1+lato2)*2;
    }
}
