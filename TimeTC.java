package ua.kpi.comsys.iv8228;

import java.time.LocalTime;
import java.util.*;
import java.util.Date;
public class TimeTC {
    public static LocalTime supp(String h1, String m1, String s1, String h2, String m2, String s2) {
        LocalTime Firsttime = LocalTime.of(Integer.parseInt(h1), Integer.parseInt(m1), Integer.parseInt(s1));
        LocalTime Secondtime = LocalTime.of(Integer.parseInt(h2), Integer.parseInt(m2), Integer.parseInt(s2));
        LocalTime Finaltime1 = Firsttime.plusHours(Long.parseLong(h2));
        LocalTime Finaltime2 = Finaltime1.plusMinutes(Long.parseLong(m2));
        LocalTime Finaltime3 = Finaltime2.plusSeconds(Long.parseLong(s2));
        return Finaltime3;
    }
    public static LocalTime sub(String h1, String m1, String s1, String h2, String m2, String s2) {
        LocalTime Firsttime = LocalTime.of(Integer.parseInt(h1), Integer.parseInt(m1), Integer.parseInt(s1));
        LocalTime Secondtime = LocalTime.of(Integer.parseInt(h2), Integer.parseInt(m2), Integer.parseInt(s2));
        LocalTime Finaltime1 = Firsttime.minusHours(Long.parseLong(h2));
        LocalTime Finaltime2 = Finaltime1.minusMinutes(Long.parseLong(m2));
        LocalTime Finaltime3 = Finaltime2.minusSeconds(Long.parseLong(s2));
        return Finaltime3;
    }
    public static String getTime(String h, String m, String s ) {
        String data = new String();
        String h_n = new String();
        List<String> hours_list1 = Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
        List<String> hours_list2 = Arrays.asList("13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");
        if (hours_list1.contains(h)) {
            data = (h + ":" + m + ":" + s + " AM");
        }
        if (hours_list2.contains(h)) {
            if (h=="13") {
                h_n="1";
            }
            if (h=="14") {
                h_n="2";
            }
            if (h=="15") {
                h_n="3";
            }
            if (h=="16") {
                h_n="4";
            }
            if (h=="17") {
                h_n="5";
            }
            if (h=="18") {
                h_n="6";
            }
            if (h=="19") {
                h_n="7";
            }
            if (h=="20") {
                h_n="8";
            }
            if (h=="21") {
                h_n="9";
            }
            if (h=="22") {
                h_n="10";
            }
            if (h=="23") {
                h_n="11";
            }
            if (h=="24") {
                h_n="12";
            }

            data = (h_n + ":" + m + ":" + s + " PM");
        }
        return data;
    }

     public static void main(String[] args) {
         String hours= "21";
         String minutes= "58";
         String seconds= "05";

         List<Integer> hours_list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23);
         List<Integer> minutes_list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59);
         List<Integer> seconds_list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59);

         Date hours_data = new Date();
         Date minutes_data = new Date();
         Date seconds_data = new Date();

         //Main Part
         System.out.println("Пункт 6.а");
         System.out.println("Вхідні данні:" + "\n" + "hours = " +hours + "\n" + "minutes = " +minutes + "\n" + "seconds = " +seconds);
         String object = (getTime(hours,minutes,seconds));
         System.out.println(object);

         System.out.println("\n" +"Пункт 6.b");
         Scanner in_h = new Scanner(System.in);
         System.out.print("Input a hours: ");
         String num_h = String.valueOf(in_h.nextInt());

         Scanner in_m = new Scanner(System.in);
         System.out.print("Input a minutes: ");
         String num_m = String.valueOf(in_m.nextInt());

         Scanner in_s = new Scanner(System.in);
         System.out.print("Input a seconds: ");
         String num_s = String.valueOf(in_s.nextInt());

         LocalTime Firsttime = LocalTime.of(Integer.parseInt(hours), Integer.parseInt(minutes), Integer.parseInt(seconds));
         LocalTime Secondtime = LocalTime.of(Integer.parseInt(num_h), Integer.parseInt(num_m), Integer.parseInt(num_s));
         System.out.println(Firsttime +" + " + Secondtime + " = " + supp(hours, minutes, seconds, num_h, num_m, num_s) );

         System.out.println("\n" +"Пункт 6.c");
         Scanner in_hc = new Scanner(System.in);
         System.out.print("Input a hours: ");
         String num_hc = String.valueOf(in_hc.nextInt());

         Scanner in_mc = new Scanner(System.in);
         System.out.print("Input a minutes: ");
         String num_mc = String.valueOf(in_mc.nextInt());

         Scanner in_sc = new Scanner(System.in);
         System.out.print("Input a seconds: ");
         String num_sc = String.valueOf(in_sc.nextInt());

         LocalTime Firsttime_c = LocalTime.of(Integer.parseInt(hours), Integer.parseInt(minutes), Integer.parseInt(seconds));
         LocalTime Secondtime_c = LocalTime.of(Integer.parseInt(num_hc), Integer.parseInt(num_mc), Integer.parseInt(num_sc));
         System.out.println(Firsttime_c +" - " + Secondtime_c + " = " + sub(hours, minutes, seconds, num_hc, num_mc, num_sc) );

         System.out.println("\n" +"Пункт 7.a");
         System.out.println("\n" +"Перший параметр:");
         Scanner in_ha_1 = new Scanner(System.in);
         System.out.print("Input a hours: ");
         String num_ha_1 = String.valueOf(in_ha_1.nextInt());

         Scanner in_ma_1 = new Scanner(System.in);
         System.out.print("Input a minutes: ");
         String num_ma_1 = String.valueOf(in_ma_1.nextInt());

         Scanner in_sa_1 = new Scanner(System.in);
         System.out.print("Input a seconds: ");
         String num_sa_1 = String.valueOf(in_sa_1.nextInt());

         System.out.println("\n" +"Другий параметр:");
         Scanner in_ha_2 = new Scanner(System.in);
         System.out.print("Input a hours: ");
         String num_ha_2 = String.valueOf(in_ha_2.nextInt());

         Scanner in_ma_2 = new Scanner(System.in);
         System.out.print("Input a minutes: ");
         String num_ma_2 = String.valueOf(in_ma_2.nextInt());

         Scanner in_sa_2 = new Scanner(System.in);
         System.out.print("Input a seconds: ");
         String num_sa_2 = String.valueOf(in_sa_2.nextInt());

         LocalTime Firsttime_a = LocalTime.of(Integer.parseInt(num_ha_1), Integer.parseInt(num_ma_1), Integer.parseInt(num_sa_1));
         LocalTime Secondtime_a = LocalTime.of(Integer.parseInt(num_ha_2), Integer.parseInt(num_ma_2), Integer.parseInt(num_sa_2));
         System.out.println(Firsttime_a +" + " + Secondtime_a + " = " + supp(num_ha_1, num_ma_1, num_sa_1, num_ha_2, num_ma_2, num_sa_2) );

         System.out.println("\n" +"Пункт 7.b");
         System.out.println("\n" +"Перший параметр:");
         Scanner in_hb_1 = new Scanner(System.in);
         System.out.print("Input a hours: ");
         String num_hb_1 = String.valueOf(in_hb_1.nextInt());

         Scanner in_mb_1 = new Scanner(System.in);
         System.out.print("Input a minutes: ");
         String num_mb_1 = String.valueOf(in_mb_1.nextInt());

         Scanner in_sb_1 = new Scanner(System.in);
         System.out.print("Input a seconds: ");
         String num_sb_1 = String.valueOf(in_sb_1.nextInt());

         System.out.println("\n" +"Другий параметр:");
         Scanner in_hb_2 = new Scanner(System.in);
         System.out.print("Input a hours: ");
         String num_hb_2 = String.valueOf(in_hb_2.nextInt());

         Scanner in_mb_2 = new Scanner(System.in);
         System.out.print("Input a minutes: ");
         String num_mb_2 = String.valueOf(in_mb_2.nextInt());

         Scanner in_sb_2 = new Scanner(System.in);
         System.out.print("Input a seconds: ");
         String num_sb_2 = String.valueOf(in_sb_2.nextInt());

         LocalTime Firsttime_b = LocalTime.of(Integer.parseInt(num_hb_1), Integer.parseInt(num_mb_1), Integer.parseInt(num_sb_1));
         LocalTime Secondtime_b = LocalTime.of(Integer.parseInt(num_hb_2), Integer.parseInt(num_mb_2), Integer.parseInt(num_sb_2));
         System.out.println(Firsttime_b +" - " + Secondtime_b + " = " + sub(num_hb_1, num_mb_1, num_sb_1, num_hb_2, num_mb_2, num_sb_2) );

         in_h.close();
         in_m.close();
         in_s.close();
         in_hc.close();
         in_mc.close();
         in_sc.close();
         in_ha_1.close();
         in_ma_1.close();
         in_sa_1.close();
         in_ha_2.close();
         in_ma_2.close();
         in_sa_2.close();
         in_hb_2.close();
         in_mb_2.close();
         in_sb_2.close();
     }

}
