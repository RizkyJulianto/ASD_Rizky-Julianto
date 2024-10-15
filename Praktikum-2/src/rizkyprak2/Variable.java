/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizkyprak2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Variable {
    public static void main(String[] args) {
        String nama,nim;
        int a,b;
        
        Scanner coba = new Scanner(System.in);
        System.out.print("Nim : ");
        nim = coba.nextLine();
        System.out.print("nama : ");
        nama = coba.nextLine();
        
        System.out.println("Hasil Program No 2");
        System.out.println("==================");
        
        System.out.println("==================");
        System.out.println("PERSEGI PANJANG");
        System.out.println("==================");
        
        System.out.print("Panjang = ");
        a = coba.nextInt();
        System.out.print("Lebar = ");
        b = coba.nextInt();
        
        System.out.println("Luas = " + a*b);
        System.out.println("==================");
        System.out.println("Selesai");
        System.out.println("==================");
        
        
    }
    
}
