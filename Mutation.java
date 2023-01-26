/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mutation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Mutation {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter path:");
        String str = sc.nextLine();
        FileReader freader = new FileReader(str);  
        BufferedReader reader = new BufferedReader(freader);
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        int mistakes = 0;
        for (int i = 0; i < str1.length(); i++) {
            if((str1.charAt(i)== str2.charAt(i)))
                continue;
            else
                mistakes++;
        }
        System.out.println(mistakes);
        System.out.println(str1);
        System.out.println(str2);
    }
}
