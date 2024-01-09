import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("inserisci un valore");
        int a = scan.nextInt();
      boolean result = 0 <= a && a<= 3;
      if(result) {
          switch (a) {
              case 0:
                  System.out.println("zero");
                  break;
              case 1:
                  System.out.println("uno");
                  break;
              case 2:
                  System.out.println("due");
                  break;
              case 3:
                  System.out.println("tre");
                  break;


          }
      } else {
          System.out.println("error");
      }
        scan.close();


    }
}