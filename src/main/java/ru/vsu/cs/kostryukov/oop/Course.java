package ru.vsu.cs.kostryukov.oop;

import java.util.List;

public class Course {
    private int number;
    private List<Group> groups;

    public Course(int number, List<Group> groups) {
        this.number = number;
        this.groups = groups;
    }
}
