import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int first = scan.nextInt();
        for(int i=first; i>= 0 ; i--){
            System.out.println(i);
        };
        scan.close();
    }


}