/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class LuasPermukaanBola {
    public static void main(String[] args){
        Double phi = 3.14;    
        int jarijari;
        
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Input jarijari:");
        jarijari = baca.nextInt();
        
        Double luaspermukaanbola = Double.valueOf(4*phi*jarijari);
        
        System.out.println("Luas Permukaan Bola = " + luaspermukaanbola);
    }
}
