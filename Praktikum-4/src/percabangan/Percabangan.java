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
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cek = new Scanner(System.in);
        
        int nilai;
        System.out.print("Masukan nilai anda : ");
        nilai = cek.nextInt();
        
        String hasil = (nilai > 80) ? "Lulus" : "Tidak Lulus"; 
        System.out.println(hasil);
    }
    
}
