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
public class PilihanKondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Silahkan Pilih Angka 1 - 3 = ");
        int bil = input.nextInt();
        switch (bil) {
            case 1 : System.out.println("SATU");
            break;
            case 2 : System.out.println("DUA");
            break;
            case 3 : System.out.println("TIGA");
        }
    }
}
