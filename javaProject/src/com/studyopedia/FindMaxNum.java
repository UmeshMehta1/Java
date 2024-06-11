package com.studyopedia;
import java.util.Scanner;

public class FindMaxNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        if(num1>num2&& num1>num3){
            System.out.println("Number 1 is gratest: "+ num1);
        } else if (num2>num3 && num2>num1) {
            System.out.println("Number 2 is gratest: "+ num2);
        }else{
            System.out.println("Number 3 is gratest: "+ num3);
        }

    }
}
