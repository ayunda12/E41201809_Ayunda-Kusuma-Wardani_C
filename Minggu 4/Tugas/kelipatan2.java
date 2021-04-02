/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smt2minggu4;

public class kelipatan2 {

    public static void main(String args[]) {
        System.out.println("         Do__While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        int a = 1;
        do {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        } while (a < 100);

    }
}
