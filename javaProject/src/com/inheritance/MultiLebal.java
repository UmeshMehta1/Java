package com.inheritance;
import java.util.Scanner;

class Adding{
    int num1;
    int num2;

     Scanner sc = new Scanner(System.in);
    void add(){
        System.out.print("enter first Number: ");
        num1=sc.nextInt();

        System.out.print("enter Second Number: ");
        num2=sc.nextInt();

        System.out.print("Sum is: "+ num1+num2);
    }
}

class Subracting extends Adding{
    void sub(){
        System.out.print("enter first Number: ");
        num1=sc.nextInt();

        System.out.print("enter Second Number: ");
        num2=sc.nextInt();

        System.out.print("Sum is: "+ num1-num2);
    }
}
public class MultiLebal {
}
