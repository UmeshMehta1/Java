package com.studyopedia;
import java.util.Scanner;


public class FactUsingObj {
    int fac(int n){

        int fac=1;
        while(n>0){
            fac=n*fac;
            n--;
        }
        return fac;
    }
}

class MainFac{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int n= sc.nextInt();

        FactUsingObj fac1 = new FactUsingObj();

        System.out.println(fac1.fac(n));
    }
}