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
public class Beasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA : ");
        int TPA = input.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        int BahasaInggris = input.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("SISWA DAPAT BEASISWA");
        else 
            System.out.println("SISWA TIDAK DAPAT BEASISWA");
    }
 
}
