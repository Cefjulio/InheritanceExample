/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author auyon.j6356
 */
public class Car {
    
    public int topSpeed;
    
    public Car(int topSpeed){
        this.topSpeed = topSpeed;
    }
    
    public int getTopSpeed(){
    
        return topSpeed;
    }
    
    public void printDescription(){
        System.out.println("Car");
    
    }
    
    
}
