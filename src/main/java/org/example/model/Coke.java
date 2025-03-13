package org.example.model;

public class Coke extends ProductForSale{
    private double litre;

    public Coke(String type, double price, String description){
        super(type,price,description);
        this.litre = 3;
    }

    public void showDetails(){
        System.out.println(
                "Type: " + getType() + "Price" + getPrice() + "Description" + getDescription() + "Litre" + litre
        );
    }
}
