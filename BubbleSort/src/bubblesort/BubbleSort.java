/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.*;
/**
 *
 * @author ccr
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] num = new int[10];
        int temp;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++) {
            num[i] = input.nextInt();
        }
        
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++) {
                if(num[j] < num[i]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        
        System.out.println("In Ascending Order:");
        for(int i=0;i<10;i++) {
            System.out.print(num[i]+ " ");
        }
        
    }
    
}
