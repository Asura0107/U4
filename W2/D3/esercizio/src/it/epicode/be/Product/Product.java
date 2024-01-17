package it.epicode.be.Product;

public class Product {
    public String id;
    public String name;
    public String category;
    public Double price;

    public Product(String id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

   @Override
   public String toString(){
        return name + " " + id + " " + category + " "+ price;
   }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double sconto(Double price){
        return price *10/100;
   }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
}
