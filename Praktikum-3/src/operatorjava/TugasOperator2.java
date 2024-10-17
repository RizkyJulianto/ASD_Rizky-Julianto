/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorjava;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TugasOperator2{
    public static void main(String[] args) {
        Scanner hitung = new Scanner(System.in);
        
        System.out.print("Masukan harga sebelum diskon Rp :");
        int hargaAwal = hitung.nextInt();
        System.out.print("Masukan diskon : %");
        int diskonPersen = hitung.nextInt();
        System.out.println("==================================");
        int diskonRupiah = hargaAwal * diskonPersen / 100;
        System.out.println("Mendapat potongan harga sebesar Rp " + diskonRupiah);
        
        int hargaAkhir = hargaAwal - diskonRupiah;
        System.out.println("Jadi harga setelah mendapat diskon adalah : " + hargaAkhir);
        
        
    }
}
