/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class PengecekanBilanganGenap {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);
        
        int bilangan;
        System.out.print("Masukan Bilangan : ");
        bilangan = cek.nextInt();
        
        if(bilangan % 2 == 0){
            System.out.println(bilangan + " Merupakan Bilangan Genap");
        } else {
            System.out.println(bilangan + " Merupakan Bilangan Ganjil");
        }
        
    }
}
