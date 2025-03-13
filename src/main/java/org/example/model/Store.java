package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();
        ProductForSale[] list = {
                new Chocolate("white",100,"çikolata"),
                new Coke("white",100,"coke"),
                new Bread("white",100,"bread")};

        listProducts(list);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i=0; i< products.length; i++){
            products[i].showDetails();
        }
    }
}