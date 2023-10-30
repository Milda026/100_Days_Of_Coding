package Coding;

import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b, hasil;
        while (true) {            
        System.out.println("Masukkan nilai a :");
        a = sc.nextInt();
        System.out.println("Masukkan nilai b :");
        b = sc.nextInt();
        
        hasil = a + b;
        if (hasil % 2 == 0) {
            hasil += 1;
            
        }else{
            hasil += 2;
        }
        System.out.println("Hasil akhir :" + hasil);
                
        }
        
    }
    
}
