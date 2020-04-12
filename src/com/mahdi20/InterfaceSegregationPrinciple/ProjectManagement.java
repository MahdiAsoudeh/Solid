package com.mahdi20.InterfaceSegregationPrinciple;


class ProjectManagement {

    public void processCode(Codeable codeable) {
        codeable.code();
    }

    public void processTest(Testable testable) {
        testable.test();
    }

}