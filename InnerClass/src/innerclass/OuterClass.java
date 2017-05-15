/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author ccr
 */
public class OuterClass {
    private int num1;
    private int num2;
    
    public OuterClass(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    
    public void display() {
        Inner in = new Inner();
        int x = in.multiply();
        System.out.println(num1+" * "+num2+" = "+x);
    }
    public class Inner {
        public int multiply() {
            return num1*num2;
        }
    }
    
}
