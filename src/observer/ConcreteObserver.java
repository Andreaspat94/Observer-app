/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * THIS IS THE CUSTOMER
 */
public class ConcreteObserver extends Observer {

    private String name;

    public ConcreteObserver() {
    }

    public ConcreteObserver(Product product, String name) {
        this.product = product;
        this.name = name;
//        this.product.attach(this);
        System.out.println("Observer with name " + this.name + "has created");
    }

    @Override
    public void update() {
        System.out.println("Updated: " + product.getState());
    }

}
