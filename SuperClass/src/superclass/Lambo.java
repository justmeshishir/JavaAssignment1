/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclass;

/**
 *
 * @author ccr
 */
public class Lambo extends Cars{
    
    public Lambo() {
        super();
        System.out.println("Lamborghini is expensive car!!");
        System.out.println("It's colour is "+super.color);
        float speed = super.speed(342f,4.2f);
        System.out.println("It's speed is "+speed+"KM/Sec");
    }
    
}
