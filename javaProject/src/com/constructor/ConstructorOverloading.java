package com.constructor;

class OverLoad{
    int a; int b; String name;
    OverLoad(){
        a=33;
        b=54; name="umesh";
    }

    OverLoad(int x){
        b=x;
    }

    OverLoad(int p, String q){
        a=p;
        name=q;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args){
        OverLoad res= new OverLoad();
        OverLoad res2= new OverLoad(24);

        OverLoad res3 = new OverLoad(43, "umesh");

        System.out.println("first Result "+ res.a+" "+res.b+" "+ res.name);
        System.out.println("Second Result "+res.b);
        System.out.println("Third Result "+ res.a+" "+ res.name);
    }

}
