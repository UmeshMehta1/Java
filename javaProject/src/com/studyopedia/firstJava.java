package com.studyopedia;

import java.util.Scanner;

public class firstJava {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you name: ");

        String name= sc.nextLine();

        System.out.println("My name is "+ name);
    }
}