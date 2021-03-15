/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smt2minggu2;

/**
 *
 * @author acer
 */
public class Person {

    String fName = "Lisa";
    String lName = "Palombo";
    int stuId = 123456789;
    String stuStatus = "Active";

    public Person() {
        System.out.println("Student Name: " + fName + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }

    public static void main(String[] args) {
        Person data = new Person();

    }
}
