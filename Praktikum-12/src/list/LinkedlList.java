/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class LinkedlList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> buah = new LinkedList<>();
        
//      Menambah elemen pada linkedlist menggunakan add , addFirst dan addLast
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        
        buah.addFirst("Nanas");
        buah.addLast("Semangka");
        
        System.out.println("Saya suka makan buah" + buah);
        
//        Mengambil element pada LinkedList mengguanakan get,getFirst,getLast
        System.out.println("Dirumah saya ada buah " + buah.get(2));
        System.out.println("Buah Pertama " + buah.getFirst());
        System.out.println("Buah Terakhir " + buah.getLast());
        
//      Menghapus elemen pada Linkedlist menggunakan remove,removeFirst,removeLast
        buah.remove(2);
        buah.removeFirst();
        buah.removeLast();
        System.out.println("Hasil setelah dihapus" + buah);
        
        
//        Melaukan check kondisi LinkedList
        if(buah.isEmpty()) {
            System.out.println("Buah kosong nih");
        } else {
            System.out.println("Buah ada kok");
        }
        
    }
    
}
