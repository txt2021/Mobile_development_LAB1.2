package ua.kpi.comsys.iv8228;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Lab2_tasks {
    private static int randomValue(int maxValue) {
        Random rand = new Random();
        switch (rand.nextInt(6)) {
            case 1:
                return (int) (maxValue * 0.7);
            case 2:
                return (int) (maxValue * 0.9);
            case 3:
            case 4:
            case 5:
                return maxValue;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        String studentsStr = "Дмитренко Олександр - ІП-84;" +
                " Матвійчук Андрій - ІВ-83;" +
                " Лесик Сергій - ІО-82;" +
                " Ткаченко Ярослав - ІВ-83; " +
                "Аверкова Анастасія - ІО-83;" +
                " Соловйов Даніїл - ІО-83; " +
                "Рахуба Вероніка - ІО-81;" +
                " Кочерук Давид - ІВ-83;" +
                " Лихацька Юлія- ІВ-82; " +
                "Головенець Руслан - ІВ-83; " +
                "Ющенко Андрій - ІО-82;" +
                " Мінченко Володимир - ІП-83;" +
                " Мартинюк Назар - ІО-82;" +
                " Базова Лідія - ІВ-81;" +
                " Снігурець Олег - ІВ-81; " +
                "Роман Олександр - ІО-82;" +
                " Дудка Максим - ІО-81; " +
                "Кулініч Віталій - ІВ-81;" +
                " Жуков Михайло - ІП-83;" +
                " Грабко Михайло - ІВ-81; " +
                "Іванов Володимир - ІО-81; " +
                "Востриков Нікіта - ІО-82; " +
                "Бондаренко Максим - ІВ-83; " +
                "Скрипченко Володимир - ІВ-82; " +
                "Кобук Назар - ІО-81;" +
                " Дровнін Павло - ІВ-83; " +
                "Тарасенко Юлія - ІО-82; " +
                "Дрозд Світлана - ІВ-81; " +
                "Фещенко Кирил - ІО-82;" +
                " Крамар Віктор - ІО-83;" +
                " Іванов Дмитро - ІВ-82";
        // Завдання 1
        System.out.println("Завдання 1");
        HashMap<String, ArrayList<String>> studentsGroups = new HashMap<>();
        for (String st_gr :
                studentsStr.split("; ?")) {
            String[] st_gr_arr = st_gr.split(" ?- ");
            if (!studentsGroups.containsKey(st_gr_arr[1]))
                studentsGroups.put(st_gr_arr[1], new ArrayList<>());
            studentsGroups.get(st_gr_arr[1]).add(st_gr_arr[0]);
        }
        for (String group :
                studentsGroups.keySet()) {
            Collections.sort(studentsGroups.get(group), String.CASE_INSENSITIVE_ORDER);
        }
        System.out.println(studentsGroups);

        int[] points = {12, 12, 12, 12, 12, 12, 12, 16};
        // Завдання 2
        System.out.println("Завдання 2");
        HashMap<String, HashMap<String, ArrayList<Integer>>> studentPoints = new HashMap<>();
        for (String group :
                studentsGroups.keySet()) {
            if (!studentPoints.containsKey(group))
                studentPoints.put(group, new HashMap<>());
            for (String student :
                    studentsGroups.get(group)) {
                studentPoints.get(group).put(student, new ArrayList<>());
                for (int point :
                        points) {
                    studentPoints.get(group).get(student).add(randomValue(point));
                }
            }
        }
        System.out.println(studentPoints);
        // Завдання 3
        System.out.println("Завдання 3");
        HashMap<String, HashMap<String, Integer>> sumPoints = new HashMap<>();
        for (String group :
                studentsGroups.keySet()) {
            if (!sumPoints.containsKey(group))
                sumPoints.put(group, new HashMap<>());
            for (String student :
                    studentsGroups.get(group)) {
                int sum = 0;
                for (int point :
                        studentPoints.get(group).get(student)) {
                    sum += point;
                }
                sumPoints.get(group).put(student, sum);
            }
        }
        System.out.println(sumPoints);
        // Завдання 4
        System.out.println("Завдання 4");
        HashMap<String, Float> groupAvg = new HashMap<>();
        for (String group :
                studentsGroups.keySet()) {
            int sum = 0, num = 0;
            for (String student :
                    sumPoints.get(group).keySet()) {
                num++;
                sum += sumPoints.get(group).get(student);
            }
            groupAvg.put(group, (float) sum / num);
        }
        System.out.println(groupAvg);
        // Завдання 5
        System.out.println("Завдання 5");
        HashMap<String, ArrayList<String>> passedPerGroup = new HashMap<>();
        for (String group :
                studentsGroups.keySet()) {
            if (!passedPerGroup.containsKey(group))
                passedPerGroup.put(group, new ArrayList<>());
            for (String student :
                    studentsGroups.get(group)) {
                if (sumPoints.get(group).get(student) >= 60) {
                    passedPerGroup.get(group).add(student);
                }
            }
        }
        System.out.println(passedPerGroup);

    }
}
