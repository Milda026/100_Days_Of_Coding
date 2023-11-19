package Coding;

import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int batas_awal;
        int batas_akhir;
  
        System.out.print("Masukkan batas atas: ");
        batas_awal= m.nextInt();
        System.out.print("Masukkan batas akhir: ");
        batas_akhir= m.nextInt();
       
        for (int i = batas_awal; i >= batas_akhir; i--) {
            if (i % 2 == 0) {
                System.out.println(i +" adalah bilangan genap");
                
            } else {
                System.out.println(i+ " adalah bilangan ganjil");
                
            }
            
        }
    
    }
    
}
