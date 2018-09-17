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
public class PernyataanWhie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int a=0, total=0, bil=7;
       while (bil != 0 ){
           a++;
           System.out.print("Masukkan bilangan ke- " +a+" : ");
           bil = input.nextInt();
           total += bil;
       }
        System.out.print("Total jumlah "+(a - 1)+" bilangan :");
        System.out.println(total);
    }
 
}
