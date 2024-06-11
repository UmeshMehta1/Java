package com.concept;

class StaticJava{
    int num; String name;
    StaticJava(){
        num=32;
        name="umesh";
        System.out.println("num is: "+num+ " Name is: "+ name);
    }

    static {
        int num=12;
        String name="hello";
        System.out.println("num is: "+num+ " Name is: "+ name);
    }

    {
        num=11;
        name= "Instance";
        System.out.println("num is: "+num+ " Name is: "+ name);
    }
}

public class StaticInJava {
    public static void main(String[] args){
        StaticJava res = new StaticJava();
    }

}
