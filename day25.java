package Coding;

import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        while (true) { 
        System.out.println("Masukkan a : ");
        a = input.nextInt();
        System.out.println("Masukkan b : ");
        b = input.nextInt();
        
        for (int i = a; i <= b; i++) {
            System.out.print(i +" ");
        }
        for (int i = b; i <= a; i++) {
            System.out.print(i +" ");
        }
            System.out.println();
        }
                
    }
    
}
