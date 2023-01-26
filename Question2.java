/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Question2 {

    public static void main(String[] args) {
        System.out.println("PLease enter text:");
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String tt= t.replace('T', 'U');
        System.out.println(tt);
    }
}
