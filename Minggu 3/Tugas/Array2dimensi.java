/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smt2minggu3;

/**
 *
 * @author acer
 */
public class Array2dimensi {
     public static void main(String[] args) {
         int [][] nilai = {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
         for (int x=0; x<4;x++){
             for(int y=0; y<4; y++){
                 System.out.print(nilai[x][y]+" ");
             }
             System.out.println(" ");
         }
}
}
