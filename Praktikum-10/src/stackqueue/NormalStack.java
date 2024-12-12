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
public class NormalStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       StackArray stack = new StackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top of the stack : " + stack.peek());
        
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println("Is the stack empty ?" + stack.isEmpty());
    }
    
    
    
}
