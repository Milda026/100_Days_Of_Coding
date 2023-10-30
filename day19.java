package Coding;

import java.util.Scanner;
public class day19 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int total = 0;
    int batas_atas;
    System.out.print("Masukkan batas atas: ");
    batas_atas = scanner.nextInt();
    
    for (int i = 1; i <= batas_atas; i++) {
      total += i;
    }
    
    System.out.println("Penjumlahan dari 1 hingga " + batas_atas + " adalah:");
    for (int i = 1; i <= batas_atas; i++) {
      System.out.print(i + " + ");
    }
    System.out.println("= " + total);
  }
}

    
