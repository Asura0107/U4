import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("quanti km hai percorso: ");
            int a = scan.nextInt();
            ;

            System.out.println("quanti l di carburante hai consumato: ");
            int b = scan.nextInt();

            double c = a / b;
            System.out.println("hai consumato " + c + " l al km");

        } catch (ArithmeticException e) {
            System.out.println("non è possibile dividere per 0");
        }


    }
}