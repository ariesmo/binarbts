package com.binar.bts;

import java.util.Random;
import java.util.Scanner;

public class Janken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "Masukkan nama kamu : ";
        System.out.println(nama);
        nama = input.next();
        Integer[] number = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int scorePemain = 0;
        int scoreComputer = 0;

        for(int i = 1; i <= 3; ++i) {
            System.out.println("Ronde ke : " + i);
            System.out.println("Silahkan masukkan tebakanmu :");
            int angka = input.nextInt();

            Random rand = new Random();
            int random = rand.nextInt(angka);

            if (angka == random) {
                scorePemain += 5;
                System.out.println("Tebakanmu BENAR");
                System.out.println("angka yang muncul adalah : " + random);
                System.out.println();
            } else {
                scoreComputer += 5;
                System.out.println("Tebakanmu SALAH");
                System.out.println("angka yang muncul adalah : " + random);
                System.out.println();
            }
        }
        System.out.println("Permainan selesai!");
        System.out.println("==================================");
        System.out.println("Total score " + nama + " adalah : " + scorePemain);
        System.out.println("Total score Computer adalah : " + scoreComputer);
        System.out.println("==================================");
        System.out.println("Terima kasih");
    }
}
