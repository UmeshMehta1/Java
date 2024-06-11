package com.studyopedia;
import java.util.Scanner;

public class InputInJava {
 public static void main(String[] args){

//     Scanner sc= Scanner(System.in);
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter name");
     int name= sc.nextInt();

     System.out.printf("float is: "+name);
 }
}
