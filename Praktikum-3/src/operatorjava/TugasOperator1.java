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
public class TugasOperator1 {
    public static void main(String[] args) {
        double c,f,r,k;
        Scanner konversi = new Scanner(System.in);
     
        System.out.print("Masukan suhu celcius : ");
        c = konversi.nextDouble();
        f = c*9/5+32;
        r = c*4/5;
        k = c+273.15;
        System.out.println("========================");
        
        System.out.println("Hasil konversi Celcius ke Fahrenheit");
        System.out.println("--> " + c + "celcius = " + f + "Fahrenheit");
        
        System.out.println("Hasil konversi Celcius ke Reamur");
        System.out.println("--> " + c + "celcius = " + r + "Reamur");
        
        System.out.println("Hasil konversi Celcius ke Kelvin");
        System.out.println("--> " + c + "celcius = " + k + "Kelvin");
        
    }
    
        
    
}
