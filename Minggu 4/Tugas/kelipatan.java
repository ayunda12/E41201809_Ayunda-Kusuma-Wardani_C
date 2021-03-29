/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smt2minggu4;

/**
 *
 * @author acer
 */
public class kelipatan {

    public static void main(String[] args) {
        int nilai = 1;
        System.out.println("         Do__While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        do {
            System.out.print("  " + nilai);
            nilai = nilai * 2;
        } while (nilai < 100);
        System.out.println("");
    }
}
