package com.classAss;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int i;
        int A[]= new int[5];
//        int B[]= new int[100];


//        int num1 = sc.nextInt();
//        System.out.print("Enter a Number2: ");
//        int num2 = sc.nextInt();


        for(i=0; i<A.length; i++){
            System.out.print("Enter a Number1: "+ i+":");
            A[i]= sc.nextInt();
        }

        for(i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }

    }

}
