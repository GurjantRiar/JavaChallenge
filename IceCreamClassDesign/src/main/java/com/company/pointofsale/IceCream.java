package com.company.pointofsale;

public class IceCream {
    String flavor;
    Double price;
    Integer quantity;


    public IceCream(String flavor, Double price, Integer quantity){
        this.flavor =flavor;
        this.price=price;
        this.quantity=quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
