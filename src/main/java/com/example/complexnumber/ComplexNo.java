package com.example.complexnumber;

public class ComplexNo {
    int real;
    int img;
    public  ComplexNo(){

    }
    public ComplexNo(int real,int img){
        this.real=real;
        this.img=img;
    }
    ComplexNo add(ComplexNo C){
       ComplexNo temp=new ComplexNo();
       temp.real=this.real+ C.real;
       temp.img=this.img+C.img;
       return  temp;
    }
    ComplexNo Sub(ComplexNo C){
        ComplexNo temp=new ComplexNo();
        temp.real=this.real- C.real;
        temp.img=this.img-C.img;
        return  temp;
    }

    @Override
    public String toString() {
        return "Complex No: "+real +"+"+img+"i";
    }
}
