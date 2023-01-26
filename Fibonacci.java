/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author mert
 */
public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = sc.nextInt();
        System.out.println("Please enter k");
        int k = sc.nextInt();
        long ak = fibb(n,k);
        System.out.println(ak);
        
    }
    public static long fibb(int z,int k){
        Small sm = new Small();
        Big bg = new Big();
        if ((z == 1)){
            sm.smallNum=1;
        }
        else if(z ==2){
            sm.smallNum=0;
            bg.bigNum=1;
        }
        else {
            sm.smallNum=0;
            bg.bigNum=1;
            for (int i = 3; i <= z; i++) {
                long temp = bg.bigNum*k;
                long temp2 = sm.smallNum;
                bg.bigNum = bg.bigNum+temp2;
                sm.smallNum= temp;
            }
        }
        long sum = bg.bigNum+sm.smallNum;
        return sum;
    }
   
}
