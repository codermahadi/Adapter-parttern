package com.Mahadi;

/**
 * Created by Mahadi on 2/3/2018.
 */
public class AssignmentWork {

    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str){

        p.write(str);
    }
}
