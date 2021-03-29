/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smt2minggu4;

import java.util.Scanner;

public class minmax {

    public static void main(String[] args) {
        //membuat variable
        int nilai[], banyakdata, rata_rata;
        int total = 0;
        Scanner data = new Scanner(System.in);
        //banyak data
        System.out.print("Masukan banyaknya data nilai = ");
        banyakdata = data.nextInt();
        nilai = new int[banyakdata];
        
        for (int a = 0; a < banyakdata; a++) {
            System.out.print("Masukan data nilai ke-" + (a + 1) + " = ");
            nilai[a] = data.nextInt();
            //rumus total nilai
            total += nilai[a];
        }
        //membuat variable minimum dan maksimum
        int max = nilai[0];
        int min = nilai[0];

        //mencari nilai maksimum
        for (int b = 0; b < banyakdata; b++) {
            if (nilai[b] > max) {
                max = nilai[b];
            }
        }
        //mencari nilai minimum
        for (int c = 0; c < banyakdata; c++) {
            if (nilai[c] < min) {
                min = nilai[c];
            }
        }
        //rumus mencari rata"
        rata_rata = total / banyakdata;
        System.out.println("");
        //tampilkan nilai maksimum,minimum,rata rata
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai rata ratanya adalah = " + rata_rata);

    }
}
