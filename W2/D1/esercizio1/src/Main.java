import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static int[] cas;
    public static void main(String[] args) {
        //il logger vuole la classe di appartenenza come parametro
        final Logger logger= LoggerFactory.getLogger(Main.class);

        Scanner scan = new Scanner(System.in);

        arrcas();
        System.out.println("Inserisci una posizione dell'array: ");
        int a = scan.nextInt();
        try {

            if (a != 0) {

                System.out.println("Inserisci un numero: ");
                int b = scan.nextInt();

                cas[a - 1] = b;

                System.out.println("Stampa dell'array dopo la modifica:");

                for (int i = 0; i < cas.length; i++) {
                    System.out.print(cas[i] + ", ");
                    logger.info(Integer.toString(cas[i]));



                }
            } else {
                System.out.println("ok");
                scan.close();

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posizione invalida");

        }


    }

    public static void arrcas() {
        cas = new int[5];
        Random random = new Random();
        for (int i = 0; i < cas.length; i++) {
            cas[i] = random.nextInt(1, 11);
            System.out.println(cas[i]);


        }
    }

}