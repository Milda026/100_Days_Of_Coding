package Coding;

import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan warna favorite kamu : ");
        String warna = input.next();

        switch (warna) {
            case "merah":
                System.out.println("ooh Warna favorite  kamu " +warna);
                break;
            case "hijau":
                System.out.println("ooh Warna favorite  kamu " +warna);
                break;
            case "biru":
                System.out.println("ooh Warna favorite  kamu " +warna);
                break;
            default:
                System.out.println("Warna tidak ditemukan");
        }
    }
}
