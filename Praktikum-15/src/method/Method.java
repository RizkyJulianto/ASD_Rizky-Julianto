/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author HP
 */


public class Method {
static ArrayList listbuah = new ArrayList();
static boolean isRunning = true;
static InputStreamReader  inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);

  static void showMenu() throws IOException {
            System.out.println("====== Menu ======");
            System.out.println("[1] Lihat Semua Buah");
            System.out.println("[2] Tambah Buah");
            System.out.println("[3] Edit Buah");
            System.out.println("[4] Hapus Buah");
            System.out.println("[5] Keluar");
            
            System.out.print("Pilih Menu : ");
            
            int selectedMenu = Integer.valueOf(input.readLine());
            if(selectedMenu == 1) {
                showAllBuah();
            } else if(selectedMenu == 2) {
                insertBuah();
            } else if(selectedMenu == 3) {
                updateBuah();
            } else if(selectedMenu == 4) {
                deleteBuah();
            } else if(selectedMenu == 5) {
                System.exit(0);
            } else {
                System.out.println("Pilihan Salah");
            }
        }
  
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        do {
            showMenu();
        } while (isRunning);
    }

    private static void showAllBuah() {
       if(listbuah.isEmpty()) {
           System.out.println("Buah lagi kosong nich");
       } else {
           for(int i = 0; i< listbuah.size(); i++) {
               System.out.println(String.format("[%d] %s",i,listbuah.get(i)));
           }
       }
    }

    private static void insertBuah() throws IOException {
        System.out.print("Masukan nama buah : ");
        String namaBuah = input.readLine();
        listbuah.add(namaBuah);
    }

    private static void updateBuah() throws IOException {
       showAllBuah();
       System.out.print("Pilih mau ubah buah nomer berapa : ");
       int buah = Integer.valueOf(input.readLine());
       
       System.out.print("Nama baru : ");
       String namaBaru = input.readLine();
       listbuah.set(buah,namaBaru);
    }

    private static void deleteBuah() throws IOException {
       showAllBuah();
       
        System.out.println("Pilih mau hapus buah nomer berapa : ");
        int buah = Integer.valueOf(input.readLine());
        
        listbuah.remove(buah);
    }
    
}
