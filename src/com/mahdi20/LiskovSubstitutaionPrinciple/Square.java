package com.mahdi20.LiskovSubstitutaionPrinciple;

// in sample bara naghz kardane asl liskov hastesh
public class Square extends Rectangle {

    private int width;
    private int height;


    @Override
    public void setHeight(int height) {

        this.width = height;
        this.height = height;

        // inja type pedar ro beham rikhtim va dg az in method nemishe
        // mese mothod pedar estefade kard
        // in hamon naghz kardane
        // ke bayad hasemon bashe

//        super.setHeight(height);

    }

    @Override
    public void setWidth(int width) {

        // inam hamchenin

        this.width = width;
        this.height = width;

//        super.setWidth(width);
    }

}
// liskov mighe bayad beshe ba mothod haye class farzand mese method haye pedar raftar kard
