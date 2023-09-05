/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Clarisse Angeline
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        
        System.out.println("Enter the number of element of the Array: ");
        int el = scn.nextInt(); 
        int [] arr = new int[el];
        
        System.out.println("Enter your elements: ");
        for (int i = 0; i < el; i++) {
        arr[i]=scn.nextInt();
        
        
    }
        
}
}