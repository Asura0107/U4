package it.epicode.be.Order;

import it.epicode.be.Costumer.Costumer;
import it.epicode.be.Product.Product;

import java.time.LocalDate;
import java.util.List;

public class Order {
    public Long id;
    public String status;
    public LocalDate orderdate;
    public LocalDate deliverydate;
    public List<Product> products;
    public Costumer costumer;

    public Order(Long id, String status, List<Product> products, Costumer costumer) {
        this.id = id;
        this.status = status;
        this.orderdate = LocalDate.now();
        this.deliverydate = orderdate.plusDays(5);
        this.products = products;
        this.costumer = costumer;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderdate() {
        return orderdate;
    }

    public LocalDate getDeliverydate() {
        return deliverydate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Costumer getCostumer() {
        return costumer;
    }
}
