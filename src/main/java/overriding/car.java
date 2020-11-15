/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author EugeneUgaev
 */
public class car {
    
    private String model; 
    
    public car (String model){
        
        this.model = model;
    
    }
    
    public void show(){
            
        System.out.print("Model: " + model);
    
    }
    
    @Override
    public String toString(){
        return model; 
    }    
   
}


