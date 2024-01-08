import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

       int result = Moltiplica(3, 5);
        System.out.println(result);

        String frase= Concat("mirco", "orosio");
        System.out.println(frase);

        String[] newarray= Insertarray(new String[]{"a","b","c","d","e"}, "ciao");
        System.out.println(Arrays.toString(newarray));


    }
    public static int  Moltiplica(int a, int b){
        return a*b;
    };

    public static String Concat(String a, String b){
        return a+" "+b;
    }

    public static String[] Insertarray(String[] arraystring, String b){
        String[] array = new String[6];
        for(int i=1; i<arraystring.length +1; i++){
            if(i < 2){
                array[i]=arraystring[i];
            }else if ( i == 3 ) {
                array[i]=b;

            }else {
                array[i]=arraystring[i - 1];
            }
        }
        return array;

    }
}