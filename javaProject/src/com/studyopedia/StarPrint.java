package com.studyopedia;
import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=rows; j>i; j--){
                System.out.print(" ");
            }

            for(int k=1; k<=i;k++ ){
                System.out.print("* ");

            }
            System.out.print("\n");

        }



    }
}