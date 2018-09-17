/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class PilihanMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 9;
        do{
            System.out.println("\n MENU LUAS BANGUN \n");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            switch(pilihan) {
                case 1 : luasPersegi(); break;
                case 2 : luasPersegiPanjang();break;
            }
        }while(pilihan != 3);
    }
    private static void luasPersegi() {
        Scanner input = new Scanner(System.in);
        float sisi, luas;
        System.out.print("Masukkan panjang sisi : ");
        sisi = input.nextFloat();
        luas = sisi * sisi;;
        System.out.println("Luas Persegi =  " +luas);
    }
    private static void luasPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.print("Masukkan nilai panjang : ");
        panjang = input.nextFloat();
        System.out.print("Masukkan nilai lebar : ");
        lebar = input.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luaas Persegi Panjang = " +luas);
    }
 
}
