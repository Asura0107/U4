import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String[] arr= new String[3];
        System.out.println("Insert first string then Enter");
        arr[0]= scan.nextLine();
        System.out.println("Insert second string then Enter");
        arr[1]= scan.nextLine();
        System.out.println("Insert third string then Enter");
        arr[2]= scan.nextLine();

        System.out.println(arr[0]+ arr[1]+ arr[2]);
        System.out.println(arr[2]+ arr[1]+ arr[0]);
        scan.close();


    }
}