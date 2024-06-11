package com.concept;

class StaticJava{
    int num; String name;
    StaticJava(){
        num=32;
        name="umesh";
        System.out.println("num is: "+num+ " Name is: "+ name);
    }

    // Static Block ex choti matra execute garxa..
    // constructor vanda phaila Static Block execute hunxa.

    static {
        int num=12;
        String name="hello";
        System.out.println("num is: "+num+ " Name is: "+ name);
    }
//    Note:
  //First ma static block execute hunxa, tespaxi --> instance block --> last ma constructor execute hunxa.
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
