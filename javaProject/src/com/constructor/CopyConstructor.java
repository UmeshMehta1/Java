package com.constructor;

class cpy{
    int num; String name;
    cpy(int x, String y){
        num=x;
        name=y;
    }

    cpy(cpy ref){  // Copy constructor
        num= ref.num;
        name=ref.name;
       System.out.println("Name is "+ name+ " Age is "+num);
    }

    void Display(){
        System.out.println("My name is "+name +" Age is "+num);
    }
}
public class CopyConstructor {
    public static void main(String[] args){
        cpy ref=new cpy(21, "Umesh Mehta");
        ref.Display();
        cpy ref2 = new cpy(ref);
    }
}
