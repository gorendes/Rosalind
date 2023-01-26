/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countingdnanucleotides;

import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Countingdnanucleotides {

    public static void main(String[] args) {
        System.out.println("Please enter the value");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int numberOfA=0;
        int numberOfT=0;
        int numberOfG=0;
        int numberOfC=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== 'A')
                numberOfA++;
            else if(str.charAt(i)=='T')
                numberOfT++;
            else if(str.charAt(i)== 'G')
                numberOfG++;
            else if(str.charAt(i)=='C')
                numberOfC++;
        }
        System.out.println(numberOfA+" "+numberOfC+" "+numberOfG+" "+numberOfT);
    }
}
