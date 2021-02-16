package ua.kpi.comsys.iv8228;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
public class Lab2_tasks {
    public static ArrayList<Integer> nums(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(16));
        }
        return list;
    }
    public static float summa(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }
    public static float avg(ArrayList<Float> array) {
       int sum = 0;
       for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
       return sum/ array.size();
    }


   static List<String> getKey(HashMap<String, Float> map, Integer value) {
       List<String> key = new ArrayList<String>();
       for(Map.Entry<String, Float> entry : map.entrySet()) {
           if((value >= 60)){
               key.add(entry.getKey());
               break;
           }
       }
       return key;
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
       /// System.out.println(studentsStr);

        /// Завдання 1
        System.out.println("Завдання 1");
        ArrayList<String> task_ip84 = new ArrayList<String>();
        task_ip84.add("Дмитренко Олександр");

        ArrayList<String> task_iv83 = new ArrayList<String>();
        task_iv83.add("Матвійчук Андрій");
        task_iv83.add("Ткаченко Ярослав");
        task_iv83.add("Кочерук Давид");
        task_iv83.add("Головенець Руслан");
        task_iv83.add("Бондаренко Максим");
        task_iv83.add("Дровнін Павло");
        Collections.sort(task_iv83);

        ArrayList<String> task_io82 = new ArrayList<String>();
        task_io82.add("Лесик Сергій");
        task_io82.add("Ющенко Андрій");
        task_io82.add("Мартинюк Назар");
        task_io82.add("Роман Олександр");
        task_io82.add("Востриков Нікіта");
        task_io82.add("Тарасенко Юлія");
        task_io82.add("Фещенко Кирил");
        Collections.sort(task_io82);

        ArrayList<String> task_io83 = new ArrayList<String>();
        task_io83.add("Аверкова Анастасія");
        task_io83.add("Соловйов Даніїл");
        task_io83.add("Крамар Віктор");
        Collections.sort(task_io83);

        ArrayList<String> task_io81 = new ArrayList<String>();
        task_io81.add("Рахуба Вероніка");
        task_io81.add("Дудка Максим");
        task_io81.add("Іванов Володимир");
        task_io81.add("Кобук Назар");
        Collections.sort(task_io81);

        ArrayList<String> task_iv82 = new ArrayList<String>();
        task_iv82.add("Лихацька Юлія");
        task_iv82.add("Скрипченко Володимир");
        task_iv82.add("Іванов Дмитро");
        Collections.sort(task_iv82);

        ArrayList<String> task_iv81 = new ArrayList<String>();
        task_iv81.add("Базова Лідія");
        task_iv81.add("Снігурець Олег");
        task_iv81.add("Кулініч Віталій");
        task_iv81.add("Грабко Михайло");
        task_iv81.add("Дрозд Світлана");
        Collections.sort(task_iv81);

        ArrayList<String> task_ip83 = new ArrayList<String>();
        task_ip83.add("Мінченко Володимир");
        task_ip83.add("Жуков Михайло");
        Collections.sort(task_ip83);

        HashMap<String, String> studentsGroups = new HashMap<>();
        studentsGroups.put("ІП-83", String.valueOf(task_ip83));
        studentsGroups.put("ІП-84", String.valueOf(task_ip84));
        studentsGroups.put("ІВ-81", String.valueOf(task_iv81));
        studentsGroups.put("ІВ-82", String.valueOf(task_iv82));
        studentsGroups.put("ІВ-83", String.valueOf(task_iv83));
        studentsGroups.put("ІО-81", String.valueOf(task_io81));
        studentsGroups.put("ІО-82", String.valueOf(task_io82));
        studentsGroups.put("ІО-83", String.valueOf(task_io83));
        System.out.println(studentsGroups);

        ///Завдання 2
        System.out.println("\n"+"Завдання 2");
        int[] points = new int[] {12, 12, 12, 12, 12, 12, 12, 16};
        ///System.out.println(points);


        //for (int v : nums)
        //    System.out.println(v);
        HashMap<String, List> map_ip83 = new HashMap<>();
        map_ip83.put("Мінченко Володимир", ((nums(9))));
        map_ip83.put("Жуков Михайло", ((nums(9))));

        HashMap<String, List> map_ip84 = new HashMap<>();
        map_ip84.put("Дмитренко Олександр", ((nums(9))));

        HashMap<String, List> map_iv81 = new HashMap<>();
        map_iv81.put("Базова Лідія", ((nums(9))));
        map_iv81.put("Снігурець Олег", ((nums(9))));
        map_iv81.put("Кулініч Віталій", ((nums(9))));
        map_iv81.put("Грабко Михайло", ((nums(9))));
        map_iv81.put("Дрозд Світлана", ((nums(9))));

        HashMap<String, List> map_iv82 = new HashMap<>();
        map_iv82.put("Лихацька Юлія", ((nums(9))));
        map_iv82.put("Скрипченко Володимир", ((nums(9))));
        map_iv82.put("Іванов Дмитро", ((nums(9))));

        HashMap<String, List> map_iv83 = new HashMap<>();
        map_iv83.put("Матвійчук Андрій", ((nums(9))));
        map_iv83.put("Ткаченко Ярослав", ((nums(9))));
        map_iv83.put("Кочерук Давид", ((nums(9))));
        map_iv83.put("Головенець Руслан",((nums(9))));
        map_iv83.put("Бондаренко Максим", ((nums(9))));
        map_iv83.put("Дровнін Павло", ((nums(9))));

        HashMap<String, List> map_io81 = new HashMap<>();
        map_io81.put("Рахуба Вероніка", ((nums(9))));
        map_io81.put("Дудка Максим", ((nums(9))));
        map_io81.put("Іванов Володимир",((nums(9))));
        map_io81.put("Кобук Назар", ((nums(9))));

        HashMap<String, List> map_io82 = new HashMap<>();
        map_io82.put("Лесик Сергій", ((nums(9))));
        map_io82.put("Ющенко Андрій", ((nums(9))));
        map_io82.put("Мартинюк Назар", ((nums(9))));
        map_io82.put("Роман Олександр", ((nums(9))));
        map_io82.put("Востриков Нікіта", ((nums(9))));
        map_io82.put("Тарасенко Юлія", ((nums(9))));
        map_io82.put("Фещенко Кирил", ((nums(9))));

        HashMap<String, List> map_io83 = new HashMap<>();
        map_io83.put("Аверкова Анастасія",((nums(9))));
        map_io83.put("Соловйов Даніїл", ((nums(9))));
        map_io83.put("Крамар Віктор", ((nums(9))));

        HashMap<String, String> studentPoints = new HashMap<>();
        studentPoints.put("ІП-83", String.valueOf(map_ip83));
        studentPoints.put("ІП-84", String.valueOf(map_ip84));
        studentPoints.put("ІВ-81", String.valueOf(map_iv81));
        studentPoints.put("ІВ-82", String.valueOf(map_iv82));
        studentPoints.put("ІВ-83", String.valueOf(map_iv83));
        studentPoints.put("ІО-81", String.valueOf(map_io81));
        studentPoints.put("ІО-82", String.valueOf(map_io82));
        studentPoints.put("ІО-83", String.valueOf(map_io83));
        System.out.println(studentPoints);

        ///Завдання 3
        System.out.println("\n"+"Завдання 3");

        HashMap<String, Float> map3_ip83 = new HashMap<>();
        map3_ip83.put("Жуков Михайло", (summa((ArrayList<Integer>) map_ip83.get("Жуков Михайло"))));
        map3_ip83.put("Мінченко Володимир", (summa((ArrayList<Integer>) map_ip83.get("Мінченко Володимир"))));

        HashMap<String, Float> map3_ip84 = new HashMap<>();
        map3_ip84.put("Дмитренко Олександр",(summa((ArrayList<Integer>) map_ip84.get("Дмитренко Олександр"))));

        HashMap<String, Float> map3_iv81 = new HashMap<>();
        map3_iv81.put("Базова Лідія", (summa((ArrayList<Integer>) map_iv81.get("Базова Лідія"))));
        map3_iv81.put("Снігурець Олег", (summa((ArrayList<Integer>) map_iv81.get("Снігурець Олег"))));
        map3_iv81.put("Кулініч Віталій", (summa((ArrayList<Integer>) map_iv81.get("Кулініч Віталій"))));
        map3_iv81.put("Грабко Михайло", (summa((ArrayList<Integer>) map_iv81.get("Грабко Михайло"))));
        map3_iv81.put("Дрозд Світлана", (summa((ArrayList<Integer>) map_iv81.get("Дрозд Світлана"))));

        HashMap<String, Float> map3_iv82 = new HashMap<>();
        map3_iv82.put("Лихацька Юлія", (summa((ArrayList<Integer>) map_iv82.get("Лихацька Юлія"))));
        map3_iv82.put("Скрипченко Володимир", (summa((ArrayList<Integer>) map_iv82.get("Скрипченко Володимир"))));
        map3_iv82.put("Іванов Дмитро", (summa((ArrayList<Integer>) map_iv82.get("Іванов Дмитро"))));

        HashMap<String, Float> map3_iv83 = new HashMap<>();
        map3_iv83.put("Матвійчук Андрій", (summa((ArrayList<Integer>) map_iv83.get("Матвійчук Андрій"))));
        map3_iv83.put("Ткаченко Ярослав", (summa((ArrayList<Integer>) map_iv83.get("Ткаченко Ярослав"))));
        map3_iv83.put("Кочерук Давид", (summa((ArrayList<Integer>) map_iv83.get("Кочерук Давид"))));
        map3_iv83.put("Головенець Руслан", (summa((ArrayList<Integer>) map_iv83.get("Головенець Руслан"))));
        map3_iv83.put("Бондаренко Максим", (summa((ArrayList<Integer>) map_iv83.get("Бондаренко Максим"))));
        map3_iv83.put("Дровнін Павло", (summa((ArrayList<Integer>) map_iv83.get("Дровнін Павло"))));

        HashMap<String, Float> map3_io81 = new HashMap<>();
        map3_io81.put("Рахуба Вероніка", (summa((ArrayList<Integer>) map_io81.get("Рахуба Вероніка"))));
        map3_io81.put("Дудка Максим", (summa((ArrayList<Integer>) map_io81.get("Дудка Максим"))));
        map3_io81.put("Іванов Володимир", (summa((ArrayList<Integer>) map_io81.get("Іванов Володимир"))));
        map3_io81.put("Кобук Назар", (summa((ArrayList<Integer>) map_io81.get("Кобук Назар"))));

        HashMap<String, Float> map3_io82 = new HashMap<>();
        map3_io82.put("Лесик Сергій", (summa((ArrayList<Integer>) map_io82.get("Лесик Сергій"))));
        map3_io82.put("Ющенко Андрій", (summa((ArrayList<Integer>) map_io82.get("Ющенко Андрій"))));
        map3_io82.put("Мартинюк Назар", (summa((ArrayList<Integer>) map_io82.get("Мартинюк Назар"))));
        map3_io82.put("Роман Олександр", (summa((ArrayList<Integer>) map_io82.get("Роман Олександр"))));
        map3_io82.put("Востриков Нікіта", (summa((ArrayList<Integer>) map_io82.get("Востриков Нікіта"))));
        map3_io82.put("Тарасенко Юлія", (summa((ArrayList<Integer>) map_io82.get("Тарасенко Юлія"))));
        map3_io82.put("Фещенко Кирил", (summa((ArrayList<Integer>) map_io82.get("Фещенко Кирил"))));

        HashMap<String, Float> map3_io83 = new HashMap<>();
        map3_io83.put("Аверкова Анастасія", (summa((ArrayList<Integer>) map_io83.get("Аверкова Анастасія"))));
        map3_io83.put("Соловйов Даніїл", (summa((ArrayList<Integer>) map_io83.get("Соловйов Даніїл"))));
        map3_io83.put("Крамар Віктор", (summa((ArrayList<Integer>) map_io83.get("Крамар Віктор"))));


        HashMap<String, String> sumPoints = new HashMap<>();
        sumPoints.put("ІП-83", String.valueOf(map3_ip83));
        sumPoints.put("ІП-84", String.valueOf(map3_ip84));
        sumPoints.put("ІВ-81", String.valueOf(map3_iv81));
        sumPoints.put("ІВ-82", String.valueOf(map3_iv82));
        sumPoints.put("ІВ-83", String.valueOf(map3_iv83));
        sumPoints.put("ІО-81", String.valueOf(map3_io81));
        sumPoints.put("ІО-82", String.valueOf(map3_io82));
        sumPoints.put("ІО-83", String.valueOf(map3_io83));
        System.out.println(sumPoints);

        ///Завдання 4
        System.out.println("\n"+"Завдання 4");

        ArrayList<Float> task4_ip83 = new ArrayList<>();
        task4_ip83.add(map3_ip83.get("Жуков Михайло"));
        task4_ip83.add(map3_ip83.get("Мінченко Володимир"));

        ArrayList<Float> task4_ip84 = new ArrayList<>();
        task4_ip84.add(map3_ip84.get("Дмитренко Олександр"));

        ArrayList<Float> task4_iv81 = new ArrayList<>();
        task4_iv81.add(map3_iv81.get("Базова Лідія"));
        task4_iv81.add(map3_iv81.get("Снігурець Олег"));
        task4_iv81.add(map3_iv81.get("Кулініч Віталій"));
        task4_iv81.add(map3_iv81.get("Грабко Михайло"));
        task4_iv81.add(map3_iv81.get("Дрозд Світлана"));

        ArrayList<Float> task4_iv82 = new ArrayList<>();
        task4_iv82.add(map3_iv82.get("Лихацька Юлія"));
        task4_iv82.add(map3_iv82.get("Скрипченко Володимир"));
        task4_iv82.add(map3_iv82.get("Іванов Дмитро"));

        ArrayList<Float> task4_iv83 = new ArrayList<>();
        task4_iv83.add(map3_iv83.get("Матвійчук Андрій"));
        task4_iv83.add(map3_iv83.get("Ткаченко Ярослав"));
        task4_iv83.add(map3_iv83.get("Кочерук Давид"));
        task4_iv83.add(map3_iv83.get("Головенець Руслан"));
        task4_iv83.add(map3_iv83.get("Бондаренко Максим"));
        task4_iv83.add(map3_iv83.get("Дровнін Павло"));

        ArrayList<Float> task4_io81 = new ArrayList<>();
        task4_io81.add(map3_io81.get("Рахуба Вероніка"));
        task4_io81.add(map3_io81.get("Дудка Максим"));
        task4_io81.add(map3_io81.get("Іванов Володимир"));
        task4_io81.add(map3_io81.get("Кобук Назар"));

        ArrayList<Float> task4_io82 = new ArrayList<>();
        task4_io82.add(map3_io82.get("Лесик Сергій"));
        task4_io82.add(map3_io82.get("Ющенко Андрій"));
        task4_io82.add(map3_io82.get("Мартинюк Назар"));
        task4_io82.add(map3_io82.get("Роман Олександр"));
        task4_io82.add(map3_io82.get("Востриков Нікіта"));
        task4_io82.add(map3_io82.get("Тарасенко Юлія"));
        task4_io82.add(map3_io82.get("Фещенко Кирил"));

        ArrayList<Float> task4_io83 = new ArrayList<>();
        task4_io83.add(map3_io83.get("Аверкова Анастасія"));
        task4_io83.add(map3_io83.get("Соловйов Даніїл"));
        task4_io83.add(map3_io83.get("Крамар Віктор"));

        HashMap<String, Float> groupAvg = new HashMap<>();
        groupAvg.put("ІП-83", avg(task4_ip83));
        groupAvg.put("ІП-84", avg(task4_ip84));
        groupAvg.put("ІВ-81", avg(task4_iv81));
        groupAvg.put("ІВ-82", avg(task4_iv82));
        groupAvg.put("ІВ-83", avg(task4_iv83));
        groupAvg.put("ІО-81", avg(task4_io81));
        groupAvg.put("ІО-82", avg(task4_io82));
        groupAvg.put("ІО-83", avg(task4_io83));
        System.out.println(groupAvg);


        ///Завдання 5
        System.out.println("\n"+"Завдання 5");
        //System.out.println(map3_ip83.keySet());
        //System.out.println(map3_ip83.values());
        //System.out.println(getKey(map3_ip83,61));

        HashMap<String, String> passedPerGroup = new HashMap<>();
        passedPerGroup.put("ІП-83", String.valueOf(getKey(map3_ip83,60)));
        passedPerGroup.put("ІП-84", String.valueOf(getKey(map3_ip84,60)));
        passedPerGroup.put("ІВ-81", String.valueOf(getKey(map3_iv81,60)));
        passedPerGroup.put("ІВ-82", String.valueOf(getKey(map3_iv82,60)));
        passedPerGroup.put("ІВ-83", String.valueOf(getKey(map3_iv83,60)));
        passedPerGroup.put("ІО-81", String.valueOf(getKey(map3_io81,60)));
        passedPerGroup.put("ІО-82", String.valueOf(getKey(map3_io82,60)));
        passedPerGroup.put("ІО-83", String.valueOf(getKey(map3_io83,60)));
        System.out.println(passedPerGroup);



    }
}
