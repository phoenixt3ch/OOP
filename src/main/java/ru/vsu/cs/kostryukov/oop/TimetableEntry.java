package ru.vsu.cs.kostryukov.oop;

public class TimetableEntry {
    private String time;
    private Subject subject;
    private Teacher teacher;
    private int roomNumber;

    public TimetableEntry(String time, Subject subject, Teacher teacher, int roomNumber) {
        this.time = time;
        this.subject = subject;
        this.teacher = teacher;
        this.roomNumber = roomNumber;
    }
}
