package ru.vsu.cs.kostryukov.oop;

public class TimetableEntry {
    private Day day;
    private String time;
    private Subject subject;
    private Teacher teacher;
    private int roomNumber;

    public TimetableEntry(Day day, String time, Subject subject, Teacher teacher, int roomNumber) {
        this.day = day;
        this.time = time;
        this.subject = subject;
        this.teacher = teacher;
        this.roomNumber = roomNumber;
    }

    public Day getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
