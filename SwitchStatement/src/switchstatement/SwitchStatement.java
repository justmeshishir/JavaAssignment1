/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;
import java.util.*;
/**
 *
 * @author ccr
 */
public class SwitchStatement {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Who is the preseident of USA?");
        System.out.println("1.Barack Obama\n2.Donald Trump\n3.Charlie Sheen\n4.Dawyne Johnson");
        System.out.println("Pick your answer:");
        choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Wrong Answer!!! The correct answer is Donald Trump.");
                break;
            
            case 2:
                System.out.println("Congratulation!!! You won.");
                break;
            
            case 3:
                System.out.println("Wrong Answer!!! The correct answer is Donald Trump.");
                break;
            
            case 4:
                System.out.println("Wrong Answer!!! The correct answer is Donald Trump.");
                break;
            
            default:
                System.out.println("Pick a number from 1 to 4.");
        }
    }
    
}
