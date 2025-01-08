/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class SequentialSearch {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan berapa data yang diinginkan : ");
        int panjangData = masuk.nextInt();
        int data[] = new int[panjangData];
        
        for(int i=0; i<panjangData; i++) {
            System.out.print("data [" + (i+1)+"] = ");
            data[i] = masuk.nextInt();
        }
        
        System.out.println("---------------------");
        System.out.print("data array = ");
        for(int a=0; a<=panjangData-1; a++) {
            System.out.println(data[a] + " ");
        }
        
        System.out.println("");
        System.out.println("-----------------------");
        System.out.print("Masukan data yang ingin dicari = ");
        
        int cari = masuk.nextInt();
        
        int x =0;
        boolean ketemu = false;
        for(int j = x; j<panjangData; j++) {
            if(cari == data[j]) {
                ketemu = true;
                x=j;
            }
        }
        
        if(ketemu == true) {
            System.out.println("Data berada pada urutan ke = " + (x+1)+ ", indeks ke-"+x);
        } else {
            System.out.println("Data tidak ada");
        }
    }
}
