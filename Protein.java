/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.protein;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Protein {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter your codon:");
        String codon = sc.nextLine();
        int lng = codon.length()/3;
        String[] sr = new String[lng];
        for (int i = 0; i < lng; i++) {
            sr[i]=codon.substring(i, i+3);
        }
        String[][] table = new String[64][2];
        FileReader fr = new FileReader("/home/mert/Downloads/rosalind_dna.txt");
        BufferedReader reader = new BufferedReader(fr);
        String codons = reader.readLine();
        for (int i = 0; i < 61; i++) {
            table[i][0] = codons.substring(3*i, 3*i+3);
        }
        FileReader fr2 = new FileReader("/home/mert/Downloads/rosalind_rna.txt");
        BufferedReader reader2 = new BufferedReader(fr2);
        String harf = reader2.readLine();
        for (int i = 0; i < 61; i++) {
            if(i== 60)
                table[i][1]=harf.substring(i);
            else
                table[i][1]=harf.substring(i, i+1);
        }
        table[61][1]="";
        table[62][1]="";
        table[63][1]="";
        String encoded ="";
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < 64; j++) {
                if(codon.substring(3*i, 3*i+3) == null ? table[j][0] == null : codon.substring(3*i, 3*i+3).equals(table[j][0]))
                    encoded = encoded + table[j][1];
            }
        }
        System.out.println(encoded);
    }
}
