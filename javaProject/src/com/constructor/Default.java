package com.constructor;


 class xyz {
    int a; int b;
    xyz(){
        a=55; b=33;
    }

    void Dis(){
        System.out.print(a+b);
    }
}

 public class Default{
    public static void main(String[] args){
         xyz ref= new xyz();
         ref.Dis();
    }

 }
