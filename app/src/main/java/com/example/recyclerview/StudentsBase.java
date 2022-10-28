package com.example.recyclerview;

import java.util.ArrayList;

public class StudentsBase implements DataProvider{

    @Override
    public ArrayList<Students> getAllStudents() {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Levan",33));
        students.add(new Students("Levan",33));
        students.add(new Students("GIorgi",39));
        students.add(new Students("JOni",35));
        students.add(new Students("NINI",33));
        students.add(new Students("Ako",41));
        students.add(new Students("Mari",13));
        students.add(new Students("goga",5));
        students.add(new Students("Levan",20));
        students.add(new Students("Levan",11));

        return students;
    }
}
