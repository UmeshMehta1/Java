package com.constructor;

class PrivateConstructor{
    int a; int b;
    private PrivateConstructor(){
        a=33;
        b=55;
        System.out.print("Sum is "+ Integer.sum(a,b));
    }

        public static void main(String[] args){
            PrivateConstructor res= new PrivateConstructor();
        }


}

