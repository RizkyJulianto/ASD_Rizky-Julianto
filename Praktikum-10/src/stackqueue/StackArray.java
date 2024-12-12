/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueue;
import java.util.Stack;
/**
 *
 * @author HP
 */
public class StackArray {

    public static void main(String[] args) {
    }    
    
    private final int maxSize;
    private int top;
    private final int[] stackArray;
    
    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    
    public void push(int value) {
        if(top < maxSize -1) {
            stackArray[++top] = value;
            System.out.println("Pushed : " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }
    
     public int pop() {
         if(top >= 0) {
            int poppedValue = stackArray[top--];
             System.out.println("Popped : " + poppedValue);
             return poppedValue;
         } else {
             System.out.println("Stack is empty . Cannot pop"); 
         }   return -1;
     } 
     
     public int peek() {
         if(top >= 0) {
             return stackArray[top];
         } else {
             System.out.println("Stack is empty.Cannot peek");
             return -1;
         }
     }
     
     public boolean isEmpty() {
         return (top == -1);
     }
}
