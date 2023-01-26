/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mendel;

import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Mendel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter your values:");
        double say1 = sc.nextDouble();
        double say2 = sc.nextDouble();
        double say3 = sc.nextDouble();
        double toplam = say1+say2+say3;
        double a1 = say1/toplam;
        double a2 = say2/toplam;
        double a3 = say3/toplam;
        double b11 = (say1-1)/(toplam-1);
        double b12 = (say2)/(toplam-1);
        double b13 = (say3)/(toplam-1);
        double b21 = (say1)/(toplam-1);
        double b22 = (say2-1)/(toplam-1);
        double b23 = (say3)/(toplam-1);
        double b31 = (say1)/(toplam-1);
        double b32 = (say2)/(toplam-1);
        double b33 = (say3-1)/(toplam-1);
        double kk1 = a1*b11;
        double kk2 = a1*b12;
        double kk3 = a1*b13;
        double kk4 = a2*b21;
        double kk5 = a2*b22;
        double kk6 = a2*b23;
        double kk7 = a3*b31;
        double kk8 = a3*b32;
        double kk9 = a3*b33;
        double[] aq = new double[9];
        aq[0]=kk1*1;
        aq[1]=kk2*1;
        aq[2]=kk3*1;
        aq[3]=kk4*1;
        aq[4]=kk5*3/4;
        aq[5]=kk6*2/4;
        aq[6]=kk7*1;
        aq[7]=kk8*2/4;
        aq[8]=kk9*0;
        double toplam2=0; 
        for (int i = 0; i < aq.length; i++) {
            toplam2 = toplam2 + aq[i];
        }
        System.out.println(toplam2);
        
    }
}
