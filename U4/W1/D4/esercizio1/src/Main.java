import it.epicode.be.Dipendente.Dipendente;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1= new Dipendente("333333",1200, 40, Dipendente.Dipartimento.AMMINISTRAZIONE, Dipendente.Livello.OPERAIO);
        dipendente1.data();


    }
}