package com.studyopedia;

public class Box {
    private int length;
    private int breadth;
    private int height;

    void Setdata(int l, int b, int h){
        length =l;
        breadth =b;
        height=h;
    }

    int FindArea(){
        return 2*(length*breadth*height);
    }

    int FindVolum(){
        return (length*breadth*height);
    }
}

class MainBox{
    public static void main(String[] args){
        Box BoxObj= new Box();
        Box BoxObj1 = new Box();

        BoxObj.Setdata(2, 3,5);
        BoxObj1.Setdata(3,6,2);

        System.out.println("======fIND aREA");
        System.out.println(BoxObj.FindArea());
        System.out.println(BoxObj1.FindVolum());
    }
}
