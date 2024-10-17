/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorjava;

/**
 *
 * @author HP
 */
public class OpeatorLogika {
    public static void main(String[] args) {
        boolean x =  true;
        boolean y = false;
        
        System.out.println("x && y" +(x && y)); //Logika AND
        System.out.println("x && y" +(x || y)); //Logika OR
        System.out.println("x && y" +(!x)); //Logika NOT
    }
    
}
