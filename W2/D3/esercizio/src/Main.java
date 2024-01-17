import it.epicode.be.Product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1=new Product("11","Elsa","Books",20.0);
        Product product2=new Product("22","Anna","Books",21.0);
        Product product3=new Product("33","Olaf","Books",110.0);
        Product product4=new Product("44","Sven","Books",23.0);
        Product product5=new Product("11","pants","Baby",20.0);
        Product product6 = new Product("22", "giochi", "Baby", 21.0);
        Product product7 = new Product("33", "latte in polvere", "Baby", 110.0);
        Product product8 = new Product("44", "termometro", "Baby", 23.0);
        Product product9 = new Product("33", "sword", "Boys", 110.0);
        Product product10 = new Product("44", "cars", "Boys", 23.0);
        List<Product> product = new ArrayList<>();
        product.addAll(Arrays.asList(product1, product2, product3, product4, product5, product6, product7, product8,product9,product10));

        Predicate<Double> morethan100 = price -> price > 100;

        for (int i = 0; i < product.size(); i++) {
            Product current = product.get(i);
            System.out.println("product" + i + " costa più di 100?: " + morethan100.test(current.getPrice()));

        }


        //per far stampare il foreach è necassario un override con un toString
        product.stream().filter(category -> "Baby".equals(category.getCategory())).forEach(System.out::println);

        product.stream().filter(category->"Boys".equals(category.getCategory())).forEach(products->{
            double discount= products.sconto(products.getPrice());
            products.setPrice(products.getPrice()-discount);
            System.out.println(products);
        });



    }
}