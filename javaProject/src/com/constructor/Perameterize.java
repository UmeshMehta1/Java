package com.constructor;

class A{
    int num;
    String name;
    A(int x,String y){
        num=x;
        name=y;
    }

    void Display(){
        System.out.print("My Name is "+ name + "and feb Number is "+ num);
    }
}
public class Perameterize {
    public static void main(String[] args){
        A res= new A(7,"Umesh Mehta");
        res.Display();
    }


}
