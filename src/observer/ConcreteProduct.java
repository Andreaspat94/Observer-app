/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * thelei setState, attached detached, notify
 */
public class ConcreteProduct {

    public ConcreteProduct() {
        customers = new ArrayList<ConcreteObserver>();
    }
        
    List<ConcreteObserver> customers;
    private boolean state ;

    //constructor
    public ConcreteProduct(boolean state) {
        customers = new ArrayList();
        updateState(state);
    }
    
   public void attach(ConcreteObserver o) {
        customers.add(o);
    }
   public void dettach(ConcreteObserver o) {
       customers.remove(o);
   }
    public boolean getState() {
        return state;
    }
    //setState  
    public void updateState(boolean state) {
        this.state = state;
        System.out.println("\nCurrent State: " + state + "\n");
        notifyObservers();
    }

    public void notifyObservers() {
        for (ConcreteObserver o : customers) {
            o.update();
        }
    }

    }


