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
public class TugasPercabangan5 {
    public static void main(String[] args) {
        Scanner hitung = new Scanner(System.in);
        
        double harga_produk,diskon;
        int jumlah_pembelian;
        
        System.out.print("Masukan Jumlah Pembelian : " );
        jumlah_pembelian = hitung.nextInt();
        System.out.print("Masukan Harga Produk : " );
        harga_produk = hitung.nextDouble();
        
        if(jumlah_pembelian > 10) {
            if(harga_produk > 10000) {
                diskon = harga_produk * 15/100;
            } else {
                diskon = harga_produk * 10/100;
            }
        } else if(harga_produk > 5000) {
            diskon = harga_produk * 5/100;
           } else {
            diskon = harga_produk * 2/100;
        }
        
        double total_harga = harga_produk * jumlah_pembelian - diskon;
        System.out.println(total_harga);
    }
}
