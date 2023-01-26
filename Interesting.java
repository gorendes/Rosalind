/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interesting;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mert
 */
public class Interesting {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the path of fasta text:");
        String str = sc.nextLine();
        
        FileReader freader = new FileReader(str);  
        BufferedReader reader = new BufferedReader(freader);
        String line;
        String abc ="";
        
        int tane=0;
        while ((line = reader.readLine()) != null) {
            abc = abc+line;
            
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < abc.length(); i++) {
            if(abc.charAt(i)=='>'){
               tane++;
               arr.add(i);
            }
        }
        String array[] =  new String[tane];
        for (int i = 0; i < tane; i++) {
            if(i!=(tane-1))
                array[i]=abc.substring(arr.get(i), (arr.get(i+1)));
            else
                array[i]=abc.substring((arr.get(i)));
        }
        String arrayOfArray[]= new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfArray[i] = array[i].substring(14);
        }
        float[] ratio = new float[tane];
        for (int i = 0; i < tane; i++) {
            float z = 0;
            for (int j = 0; j < arrayOfArray[i].length(); j++) {
                if(arrayOfArray[i].charAt(j)=='G' || arrayOfArray[i].charAt(j)=='C'){
                   z++;
                   
                }
            }
            ratio[i]= (z / arrayOfArray[i].trim().length()*100);
        }
        float temp = 0;
        int tempValue=0;
        for (int i = 0; i < tane; i++) {
            
            if(ratio[i]>temp){
                temp = ratio[i];
                tempValue = i;
            }
        }
        
        System.out.println(array[tempValue].substring(1,14));
        System.out.println(temp);
        
    }
}
