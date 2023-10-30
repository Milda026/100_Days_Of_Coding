package Coding;

import java.util.Scanner;

public class day22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok, jamLembur, gajiLembur;
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextInt();
        System.out.print("Masukkan lama lembur (jam): ");
        jamLembur = input.nextInt();

        gajiLembur = jamLembur * 55000;

        int gajiBersih = gajiPokok + gajiLembur;

        System.out.println("Gaji bersih: Rp. " + gajiBersih);
    }
}

    
