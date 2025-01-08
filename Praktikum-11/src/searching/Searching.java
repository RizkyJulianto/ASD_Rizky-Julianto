/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;
import java.io.*;
/**
 *
 * @author HP
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int data[] = {8,10,6,-2,11,7,1,100};
        
        int cari;
        int flag = 0;
        
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.print("Masukan data yang ingin dicari : ");
        cari = Integer.parseInt(baca.readLine());
        
        for(int i = 0; i<8; i++) {
            if(data[i] == cari) {
                flag=1;
            }
        }
        if(flag == 1) {
            System.out.println("Data ditemukan ");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
