/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Rudi Erwanto
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        double celcius = 78.0;
        System.out.println("Suhu dalam Celcius = " +celcius);
        
        double reamur = Double.valueOf(celcius * 0.8);
        System.out.println("Suhu dalam Reamur = " +reamur);
        
        double fahrenheit = Double.valueOf(celcius * 1.8 + 32);
        System.out.println("Suhu dalam Fahrenheit = " +fahrenheit);
        
        double kelvin = Double.valueOf(celcius + 273.15);
        System.out.println("Suhu dalam Kelvin = " +kelvin);
    }
}
