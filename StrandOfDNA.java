/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strandofdna;

import java.util.Scanner;

/**
 *
 * @author mert
 */
public class StrandOfDNA {

    public static void main(String[] args) {
        System.out.println("Please enter the text:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i)=='A')
                strr = strr+"T";
            else if(str.charAt(i)=='T')
                strr = strr+"A";
            else if(str.charAt(i)=='G')
                strr = strr+"C";
            else if(str.charAt(i)=='C')
                strr = strr+"G";
        }
        System.out.println(strr);
    }
}
