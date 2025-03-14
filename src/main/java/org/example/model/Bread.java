package org.example.model;

public class Bread extends ProductForSale{
    private boolean isGlutenFree;

    public Bread(String type, double price, String description){
        super(type,price,description);
        this.isGlutenFree = true;
    }

    public void showDetails(){
        System.out.println(
                "Type: " + getType() + "Price" + getPrice() + "Description" + getDescription() + "Gluten Free" + isGlutenFree
        );
    }
}
