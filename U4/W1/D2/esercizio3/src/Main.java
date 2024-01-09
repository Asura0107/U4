import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        do {
            System.out.println("inserisci una stringa");
            input = scan.nextLine();
            String[] lettere = input.split("");
            System.out.println(String.join(",", lettere));

        } while (!input.equals(":q") );
        scan.close();

    }
}