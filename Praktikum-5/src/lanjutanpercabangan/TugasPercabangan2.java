/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanjutanpercabangan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TugasPercabangan2 {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);
        
        int age;
        System.out.print("Masukan Umur Anda : ");
        age = cek.nextInt();
        
        if(age < 13) {
            System.out.println("You are a child");
        } else if( age >= 13 && age < 20) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are an adult");
        }
    }
    
}
