package it.epicode.be.Costumer;

public class Costumer {
   public Integer tier;
    public String name;
    public Long id;

    public Costumer(Integer tier, String name, Long id) {
        this.tier = tier;
        this.name = name;
        this.id = id;
    }

    public Integer getTier() {
        return tier;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
