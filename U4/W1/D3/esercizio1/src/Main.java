import it.epicode.be.Rettangolo.Rettangolo;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("inserisci la base 1:");
        int a = scan.nextInt();

        System.out.println("inserisci l'altezza 1:");
        int b = scan.nextInt();

        Rettangolo rettangolo= new Rettangolo(a,b);


        System.out.println("l'area 1 è: "+ rettangolo.Area());
        System.out.println("il perimetro 1 è: "+ rettangolo.Perimetro());

        System.out.println("inserisci la base 2:");
        int c = scan.nextInt();

        System.out.println("inserisci l'altezza 2:");
        int d = scan.nextInt();

        Rettangolo rettangolo2= new Rettangolo(c,d);
        int totarea= rettangolo.Area()+rettangolo2.Area();
        int totper= rettangolo.Perimetro()+rettangolo2.Perimetro();

        System.out.println("l'area totale è: "+ totarea);
        System.out.println("il perimetro totale è: "+ totper);


        scan.close();





    }
}