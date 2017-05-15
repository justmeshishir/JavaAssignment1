/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
/**
 *
 * @author ccr
 */
public class Stack {
    private int max;
    private int top;
    private int[] stackNum;
    
    public Stack() {
        max = 10;
        top = -1;
        stackNum = new int[10];
    }
   
    public boolean is_full() {
        return (top == max - 1);
    }
    
    public boolean is_empty() {
        return (top == -1);
    }
    
    public void push(int num) {
        if(!is_full()) {
            top++;
            stackNum[top] = num;
        }
        else {
            System.out.println("Stack is full!!");
        }
    }
    
    public int pop() {
        if(!is_empty()) {
            int x = stackNum[top];
            top--;
            return x;
        }
        else {
            System.out.println("Stack is empty!!");
            return 0;
        }
    }
    public static void main(String[] args) {
       Stack s = new Stack();
       s.push(5);
       s.push(6);
       s.push(4);
       System.out.println(s.pop());
    }
    
}
