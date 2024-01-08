//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(truefalse(5));
        System.out.println(perimetro(3.5, 4));
        System.out.println(trinagolo (3.5, 4, 7.8));

    }
    public static double perimetro(double a, double b){
        return (a + b)*2;
    }
    public static int truefalse(int a){
       return a % 2 == 0 ? 0: 1;
    }

    public static double trinagolo(double a, double b, double c){
       return a+ b+ c;
    }
}