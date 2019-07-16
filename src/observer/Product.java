/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 * EShop -> Wish List Let ProductA be at Wish List of the Customers Build an
 * application that creates the ProductA as a Subject that updates its state
 * when ProductA's properties change. Build Observers that attach to ProductA in
 * order to get notified when ProductA's state changes.
 *
 * ConcreteProduct Product(name, quantity, color, size)
 *
 * ConcreteObserver Observer
 */
public class Product extends ConcreteProduct {

    private String name;
    private int quantity;
    private String color;
    private String size;
//    ConcreteProduct cp = new ConcreteProduct();

    public Product(String name, int quantity, String color, String size) {
        this.name = name;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!this.name.equals(name)) {
            this.name = name;
            updateState(true);
            notifyObservers();
            updateState(false);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (this.quantity != (quantity)) {
            this.quantity = quantity;
            updateState(true);
            notifyObservers();
            updateState(false);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!this.color.equals(color)) {
            this.color = color;
            updateState(true);
            notifyObservers();
            updateState(false);
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!this.size.equals(size)) {
            this.size = size;
            updateState(true);
            notifyObservers();
            updateState(false);
        }
    }

    @Override
    public String toString() {
        return "name=" + name + ", quantity=" + quantity + ", color=" + color + ", size=" + size ;
    }

}
