package ru.vsu.cs.kostryukov.oop;

import com.google.gson.Gson;

import java.io.Reader;
import java.util.List;

public class Timetable {
    private List<Course> courses;

    public Timetable(List<Course> courses) {
        this.courses = courses;
    }

    public static Timetable fromJson(Reader reader) {
        Gson gson = new Gson();
        return gson.fromJson(reader, Timetable.class);
    }

    public void printTimetable() {
        for (Course course : courses) {
            System.out.println("Курс: " + course.getNumber());
            System.out.println("-----");
            for (Group group : course.getGroups()) {
                System.out.println("Группа: " + group.getNumber());
                System.out.println("Неделя: " + group.getWeek());

                for (TimetableEntry entry : group.getTimetableEntries()) {
                    System.out.println("День: " + entry.getDay());
                    System.out.println("Время: " + entry.getTime());
                    System.out.println("Предмет: " + entry.getSubject().getName());
                    System.out.println("Преподаватель: " + entry.getTeacher().getName());
                    System.out.println("Аудитория: " + entry.getRoomNumber());
                    System.out.println("-----");
                }
            }
            System.out.println("\n");
        }
    }
}
