package com.example.recyclerview;

import java.util.ArrayList;

public class StudentsBase implements DataProvider{

    @Override
    public ArrayList<Students> getAllStudents() {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Levan","33"));
        students.add(new Students("Levan","33"));
        students.add(new Students("GIorgi","39"));
        students.add(new Students("JOni","35"));


        return students;
    }
}
