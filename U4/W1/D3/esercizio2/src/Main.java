import it.epicode.be.SIM.Chiamata;
import it.epicode.be.SIM.Sim;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sim sim1=new Sim("+312345678");
        sim1.Aggiungicredito(10);

        Chiamata[] listachiamata= new Chiamata[5];
        listachiamata[0] = new Chiamata("+39 3494278805", 20);
        listachiamata[1] = new Chiamata("+39 3494278805", 1);
        listachiamata[2] = new Chiamata("+39 3494275405", 7);
        listachiamata[3] = new Chiamata("+39 3494278876", 1);
        listachiamata[4] = new Chiamata("+39 3494272358", 13);
        sim1.setLista(listachiamata);
        sim1.data();
        


    }
}