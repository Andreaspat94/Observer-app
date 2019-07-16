/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 *  
 */
public abstract class Observer {
    
    protected Product product;
    public abstract void update();
}