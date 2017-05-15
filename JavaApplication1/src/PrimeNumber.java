/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccr
 */

import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int flag=0, num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num = input.nextInt();
        for(int i=1;i<=num;i++) {
            if(num%i == 0) {
                flag++;
            }
        }
        if(flag<=2) {
            System.out.println(num+" is prime number");
        }
        else {
            System.out.println(num+" is not a prime number");
        }
    }
    
}
