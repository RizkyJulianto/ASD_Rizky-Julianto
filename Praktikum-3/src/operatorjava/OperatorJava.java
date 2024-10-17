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
public class OperatorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
// Operator Aritmatika
        int bilangan1 = 10;
        int bilangan2 = 20;
        
        System.out.println("Penjumlahan Bilangan = " + (bilangan1+bilangan2));
        System.out.println("Pengurangan Bilangan = " + (bilangan2-bilangan1));
        System.out.println("Perkalian Bilangan = " + (bilangan1*bilangan2));
        System.out.println("Pembagian Bilangan = " + (bilangan2/bilangan1));
        System.out.println("Modulus Bilangan = " + (bilangan2%bilangan1));
        System.out.println("Penambahan Bilangan dengan 1 = " + (++ bilangan1));
        System.out.println("Pengurangan Bilangan dengan 1 = " + (-- bilangan1));
//        
//        
////  Operator Penugasan 
        int c = 10;
        System.out.println("Nilai c = " + c);
        
        System.out.println("Nilai a setelah ditambah = " + (c+=2));
        System.out.println("Nilai a setelah dikali = " + (c*=5));
        System.out.println("Nilai a setelah dikurangi = " + (c-=2));
        
        
//        Operator pembanding
        int a = 10;
        int b = 12;
        System.out.println("Nilai a sama dengan nilai b "  + (a == b));
        System.out.println("Nilai a tidak sama dengan nilai b "  + (a != b));
        System.out.println("Nilai a sama dengan nilai b "  + (a == b));
        System.out.println("Nilai a lebih besar dari nilai b "  + (a > b));
        System.out.println("Nilai a lebih kecil dari nilai b "  + (a < b));
        System.out.println("Nilai a lebih besar sama dengan nilai b "  + (a >= b));
        System.out.println("Nilai a lebih kecil sama dengan nilai b "  + (a <= b));
       

    }
    
}
