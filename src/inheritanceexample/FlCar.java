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
public class FlCar extends Car{
    
    public FlCar(int topSpeed){
        super(topSpeed);
    }
    
    @Override
    public void printDescription(){
        System.out.println("Fl Car");
    
    }
    
}
