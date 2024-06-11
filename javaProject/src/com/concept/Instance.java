package com.concept;


class ins{
    int a; String name;
    ins(){
        a=5;
        name="umesh";
        System.out.println("Name Is "+name+" Number is "+a);
    }

    //Instance block in java
    // Instance black ma vako content constructor vanta xito run hunxal.
    {
        a=21;
        name="hello";
        System.out.println("Name Is "+name+" Number is "+a);
    }
}
public class Instance {
    public static void main(String[] args){
        ins res= new ins();
    }
}
