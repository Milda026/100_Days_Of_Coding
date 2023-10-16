package Coding;
import java.util.Scanner;

public class day7 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia;

        System.out.print("Masukkan usia Anda: ");
        usia = input.nextInt();

        if (usia <= 5) {
            System.out.println("Anda masih bayi");
        } else if (usia <= 12) {
            System.out.println("Anda masih anak-anak");
        } else if (usia <= 17) {
            System.out.println("Anda masih remaja");
        } else if (usia <= 25) {
            System.out.println("Anda masih dewasa awal");
        } else {
            System.out.println("Anda sudah dewasa");
        }
     }   
}