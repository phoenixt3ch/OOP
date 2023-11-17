package ru.vsu.cs.kostryukov.oop;

import java.util.List;

public class Group {
    private int number;
    private List<Student> students;

    public Group(int number, List<Student> students) {
        this.number = number;
        this.students = students;
    }
}
