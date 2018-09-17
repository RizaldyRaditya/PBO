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
public class KonversiNilai {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nnilai WEB = ");
            int nilai = input.nextInt();
            if ( nilai >= 90)
                System.out.println("NILAI A");
            else if ( nilai >= 75)
                System.out.println("NILAI B");
            else if ( nilai >= 50)
                System.out.println("NILAI C");
            else if ( nilai >= 35)
                System.out.println("NILAI D");
            else 
                System.out.println("NILAI E");
    }
}
