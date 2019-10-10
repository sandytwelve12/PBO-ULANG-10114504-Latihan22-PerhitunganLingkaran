/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan22.perhitunganlingkaran;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program perhitungan lingkaran 
 */

import java.util.Scanner;

public class PBOULANG10114504Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int diameter = 0, jari;
        double luas, keliling, phi = 3.14;
        boolean cek = true;
        Scanner scan = new Scanner (System.in);
        //input
                
        System.out.println("==========Perhitungan Lingkaran==========");
       do 
        try
        {    
        System.out.print("Masukan Nilai Diameter Lingkaran = ");
        diameter = scan.nextInt();
        break;
        }
        catch (Exception e)
        {
            cek = false;
            System.out.println("Nilai Diameter tidak Sesusai");
           break;
        }
        while (cek = false);
         
    
           
        //Proses
        jari = diameter/2;
        luas = phi * (jari*jari);
        keliling = 2*phi*jari;
        //output
        
        System.out.println("Jari Jari Lingkaran = "+jari+" cm");
        System.out.println("Luas Lingkaran      = "+luas+" cm");
        System.out.println("Keliling Lingkaran  = "+keliling+" cm");
    }
    
}
