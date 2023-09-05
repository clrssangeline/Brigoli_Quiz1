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
public class NewClass3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter an array of integers: ");
        int el = scn.nextInt();
        int [] arr = new int [el];
        for (int i = 0; i < el; i++) {
            arr[i]=scn.nextInt(); 
            
            printArray(arr);
      bubbleSort(arr);
        
            System.out.println("sorted array: ");
            printArray(arr);
            
            
    }
    }
        
    public static void bubbleSort (int arr[]){
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int m = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=m;
                }
            }
   
        }
            
        }
        public static void printArray(int arr[]){
        for (int num: arr){
            System.out.println(num+",");
    }
        }

}
