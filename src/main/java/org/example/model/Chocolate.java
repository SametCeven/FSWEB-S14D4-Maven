package org.example.model;

public class Chocolate extends ProductForSale{
    private double cacaoPercentage;

    public Chocolate(String type, double price, String description){
        super(type,price,description);
        this.cacaoPercentage = 0.5;
    }

    public void showDetails(){
        System.out.println(
                "Type: " + getType() + "Price" + getPrice() + "Description" + getDescription() + "Cacao Percentage" + cacaoPercentage
        );
    }
}
