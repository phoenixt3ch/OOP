package ru.vsu.cs.kostryukov.oop;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        String json = "timetable.json";
        try (
                Reader reader = new FileReader(json)
        ) {
            Timetable timetable = Timetable.fromJson(reader);
            timetable.printTimetable();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
