package ru.vsu.cs.kostryukov.oop;

import java.util.List;

public class Group {
    private int number;
    private Week week;
    private List<TimetableEntry> timetableEntries;

    public Group(int number, Week week, List<TimetableEntry> timetableEntries) {
        this.number = number;
        this.week = week;
        this.timetableEntries = timetableEntries;
    }

    public int getNumber() {
        return number;
    }

    public Week getWeek() {
        return week;
    }

    public List<TimetableEntry> getTimetableEntries() {
        return timetableEntries;
    }
}
