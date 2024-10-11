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
public class RizkyPrak2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner biodata = new Scanner(System.in);
        System.out.print("Masukan NIM anda : ");
        String Nim = biodata.nextLine();
        System.out.print("Masukan Nama anda : ");
        String nama = biodata.nextLine();
        System.out.print("Masukan Program Studi : ");
        String ps = biodata.nextLine();
        System.out.print("Masukan Fakultas : ");
        String fakultas = biodata.nextLine();
        System.out.print("Masukan Perguruan Tinggi : ");
        String pts = biodata.nextLine();
        
        System.out.println("======================");
        System.out.println("====Data Mahasiswa====");
        System.out.println("======================");
        
        System.out.println("Nim anda adalah " + Nim);
        System.out.println("Nama anda adalah " + nama);
        System.out.println("Prodi anda adalah " + ps);
        
        
    }
    
}
