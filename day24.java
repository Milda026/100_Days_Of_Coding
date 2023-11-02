package Coding;

import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int penghasilan;
        int pajak = 0;
        String jenisPekerjaan;
        while (true){
        System.out.print("Masukkan penghasilan per bulan: ");
        penghasilan = Integer.parseInt(input.next());
        System.out.print("Masukkan jenis pekerjaan: ");
        jenisPekerjaan = input.next();
        
        if (jenisPekerjaan == "PNS") {
            pajak = (int) (penghasilan * 0.05);
        } else  {
            pajak = (int) (penghasilan * 0.1);
        }

        int penghasilanBersih = penghasilan - pajak;
        System.out.println("Penghasilan bersih per bulan: Rp" + penghasilanBersih);
    }
    }
}
