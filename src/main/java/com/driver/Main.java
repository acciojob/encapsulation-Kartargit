package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly obj = new RWOnly();
//        System.out.println(obj.name("ganpat"));
//        java: cannot find symbol
//        symbol:   method name(java.lang.String)
//            location: variable obj of type com.driver.RWOnly
        obj.setName("ganpat");
        obj.getName();
//        System.out.println(obj.getName());
    }
  
}