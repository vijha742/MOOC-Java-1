/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikas
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String initialname, double initialPrice, int initialQuantity) {
        this.name = initialname;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", and a quantity of " + this.quantity + " pcs");
    }
}
