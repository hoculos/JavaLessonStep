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
public class BMW extends car {
    
    public BMW (String model){
        
        super(model);
   
    }
    
    @Override
    public void show(){
            
        System.out.print("Model: " + toString());
    }
    
}
