package com.Mahadi;

import com.Hasan.PilotPen;

/**
 * Created by Mahadi on 2/3/2018.
 */
public class School {

    public static void main(String[] args) {

       // PilotPen pp = new PilotPen();

        PenAdapter p = new PenAdapter();

        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I am bit tired an Assignment");
    }
}
