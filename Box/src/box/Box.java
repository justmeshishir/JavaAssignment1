/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author ccr
 */
public class Box {
    protected int width;
    protected int height;
    protected int depth;
    
    public Box() {
        width = height = depth = -1;
    }
    
    public Box(int w, int h , int d) {
        width = w;
        height = h;
        depth = d;
    }
    
    public Box(int w) {
        width = height = depth = w;
    }
    
    public int getVolume() {
        return width*height*depth;
    }
    
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(4,5,6);
        Box b3 = new Box(5);
        
        int volume;
        volume = b1.getVolume();
        System.out.println("Volume of Box B1 is "+volume);
        
        volume = b2.getVolume();
        System.out.println("Volume of Box B2 is "+volume);
        
        volume = b3.getVolume();
        System.out.println("Volume of Box B3 is "+volume);
    }
    
}
