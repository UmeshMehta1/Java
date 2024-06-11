package com.inheritance;

class Student{
    int age;
    String name;

}

class Umesh extends Student{
    void Dis(){
        age=21;
        name="umesh";
        System.out.println("My Name is "+name+" and Age is "+ age);
    }

        public static void main(String[] args){
            Umesh res = new Umesh();
            res.Dis();
        }

}
