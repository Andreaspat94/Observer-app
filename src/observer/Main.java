/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Ανδρέας
 */
public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Shirt", 2, "red","large");
        System.out.println("Product " + p1 + "has created");
        ConcreteObserver co = new ConcreteObserver(p1,"Maria Lorens ");
        p1.attach(co);
        p1.setColor("blue");
        System.out.println("New color has been set: blue\n "
                + "Updated product: " + p1.toString());
        
    }
    
}
