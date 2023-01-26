/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haystack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Haystack {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        FileReader fr = new FileReader(str);
        BufferedReader reader = new BufferedReader(fr);
        String line =  reader.readLine();
        String line2 = reader.readLine();
        String abc = "";
        for (int i = 0; i < line.length(); i++) {
            if(i < line.length()-line2.length()){
                if(line.substring(i, i+line2.length()).equals(line2))
                    abc = abc + (i+1) +" ";
            }
        }
        System.out.println(abc);
    }
}
