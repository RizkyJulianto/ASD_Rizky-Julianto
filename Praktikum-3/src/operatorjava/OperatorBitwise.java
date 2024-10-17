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
public class OperatorBitwise {
    public static void main(String[] args) {
        int a  = 5;
        int b = 3;
        
        System.out.println("a & b : " + (a & b)); // 1 -> 0001 dalam bentuk biner
        System.out.println("a | b : " + (a | b)); // 7 -> 0111 dalam bentuk biner
        System.out.println("a ^ b : " + (a ^ b)); // 6-> 0110 dalam bentuk biner
    }
}
