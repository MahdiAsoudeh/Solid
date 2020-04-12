package com.mahdi20.SingleResponsibilityPrinciple;

// this is fake example
/// the task of this class is work with database
public class DatabaseHelper {

    public void create() {
        System.out.println("add record to tbl");
    }

    public void delete() {
        System.out.println("delete record from tbl");
    }

    public void read() {
        System.out.println("read record from tbl");
    }

    public void update() {
        System.out.println("update tbl records");
    }

}
