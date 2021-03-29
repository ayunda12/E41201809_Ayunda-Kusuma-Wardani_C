/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smt2minggu4;

import java.util.Scanner;

public class bilangan_genap {

    public static void main(String[] args) {
        Scanner batas = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int batasawal = batas.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasakhir = batas.nextInt();

        System.out.print("Deretan bilangan genap : ");
        for (int i = batasawal; i <= batasakhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
