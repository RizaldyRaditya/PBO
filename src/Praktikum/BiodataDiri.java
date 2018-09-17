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
public class BiodataDiri {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String Nama, Tempatlahir, AlamatMalang, Mottohidup, Jeniskelamin;
            int NIS, Tanggallahir;
            
            System.out.print("Masukkan Nama anda : ");
            Nama = input.nextLine();
            
            System.out.print("Masukkan NIS anda : ");
            NIS = input.nextInt();
            
            System.out.print("Masukkan Tempat Lahir anda : ");
            Tempatlahir = input.next();
            
            System.out.print("Masukkan Tanggal Lahir anda : ");
            Tanggallahir = input.nextInt();
            
            System.out.print("Masukkan Jenis Kelaminn anda : ");
            Jeniskelamin = input.next();
            
            System.out.print("Masukkan Motto Hidup anda : ");
            Mottohidup = input.next();
            
            System.out.print("Masukkan Alamat anda di Malang :");
            AlamatMalang = input.next();
            
            
            System.out.println("Nama             : "+Nama);
            System.out.println("NIS              : "+NIS);
            System.out.println("Tempat Lahir     : "+Tempatlahir);
            System.out.println("Tanggal Lahir    : "+Tanggallahir);
            System.out.println("Jenis Kelamin    : "+Jeniskelamin);
            System.out.println("Alamat di Malang : "+AlamatMalang);
            System.out.println("Motto Hidup      : "+Mottohidup);
            
            
    }
}
