package com.mahdi20.InterfaceSegregationPrinciple;

// ejade interface haye bishtar behtar ast az dashtane ye
// interface hame kare ke onam hameye method hash dar har classi estefade nemishe ya null mishe

class Programmer implements Codeable, Testable {

    public void code() {
        System.out.println("coding...");
    }

    public void test() {
        System.out.println("testing...");
    }
}