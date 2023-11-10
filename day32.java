package Coding;

import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
       Scanner m = new Scanner(System.in);
        int batas ;
        System.out.println("Masukkan batas " );
        batas = m.nextInt();
        
        int total = 1;
        for (int i = 1; i <= batas; i++) {
            System.out.println(i);
            total *=i;
        }
        System.out.println("Hasil : "+total);
    } 
    
}
