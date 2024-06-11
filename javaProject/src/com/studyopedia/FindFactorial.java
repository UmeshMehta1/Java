package com.studyopedia;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        int copyNum = num;
        int fac =1;

        while(num>0){
            fac = num*fac;
            num--;
        }

        System.out.print("The factriol of "+ copyNum +" is: "+fac);

    }
}
