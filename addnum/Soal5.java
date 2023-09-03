/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addnum;
import java.util.Scanner;
/**
 *
 * @author Fikri
 */
public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        // 1. Sum the lengths of A and B.
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        // 2. Determine if A is lexicographically larger than B
        if (A.compareTo(B) < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        // 3. Capitalize the first letter in A and B and print them on a single line.
        A = capitalizeFirstLetter(A);
        B = capitalizeFirstLetter(B);
        System.out.println(A + " " + B);
        System.out.println("PRAKTIKUM PBO - 2021 8");
        scanner.close();
    }
    // Helper function to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
