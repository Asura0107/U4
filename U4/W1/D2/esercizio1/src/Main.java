import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("inserisce una stringa:");
        String str = scan.nextLine();

        String result= paridispari(str);
        System.out.println("la lunghezza è pari? "+result );

        System.out.println("inserisce un anno:");
        int anno= scan.nextInt();

        int maybe= bisestile(anno);
        System.out.println(anno + "è un anno bisestile?" + maybe);



        scan.close();
    }
    public static String paridispari(String a){
        if(a.length()%2==0){
            return "true";
        }else {
            return "false";
        }
    }

    public static int bisestile(int b){
        if( b % 4 == 0 || b % 100 == 0 && b % 400 == 0 ){
            return 0;
        }else{
            return 1;
        }
    }
}