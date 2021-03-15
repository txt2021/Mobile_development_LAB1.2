package ua.kpi.comsys.iv8228;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TimeTC {
    int hours;
    int minutes;
    int seconds;

    public TimeTC(LocalTime finaltime3){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public TimeTC(int hou, int min, int sec){
        if (hou >= 0 && hou <= 23){
            hours = hou;
        }
        else {
            System.err.println("The hours are set incorrectly");
        }
        if (min >= 0 && min <= 59){
            minutes = min;
        }
        else {
            System.err.println("The minutes are set incorrectly");
        }
        if (sec >= 0 && sec <= 59){
            seconds = sec;
        }
        else {
            System.err.println("The seconds are set incorrectly");
        }

    }
    public TimeTC(Date hou, Date min, Date sec){
        hours = Integer.valueOf(String.valueOf(hou));
        minutes = Integer.valueOf(String.valueOf(min));;
        seconds = Integer.valueOf(String.valueOf(sec));;
    }
    public String getTime() {
        String data = new String();
        String h_n = new String();
        List<Integer> hours_list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> hours_list2 = Arrays.asList(13,14,15,16,17,18,19,20,21,22,23,24);
        if (hours_list1.contains(hours)) {
            data = (hours + ":" + minutes + ":" + seconds + " AM");
        }
        if (hours_list2.contains(hours)) {
            if (hours ==13) {
                h_n="1";
            }
            if (hours ==14) {
                h_n="2";
            }
            if (hours==15) {
                h_n="3";
            }
            if (hours==16) {
                h_n="4";
            }
            if (hours==17) {
                h_n="5";
            }
            if (hours==18) {
                h_n="6";
            }
            if (hours==19) {
                h_n="7";
            }
            if (hours==20) {
                h_n="8";
            }
            if (hours==21) {
                h_n="9";
            }
            if (hours==22) {
                h_n="10";
            }
            if (hours==23) {
                h_n="11";
            }
            if (hours==24) {
                h_n="12";
            }

            data = (h_n + ":" + minutes + ":" + seconds + " PM");
        }
        return data;
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    public static TimeTC supp(TimeTC a, TimeTC b)  {
        int h1 = a.getHours();
        int m1 = a.getMinutes();
        int s1 = a.getSeconds();
        int h2 = b.getHours();
        int m2 = b.getMinutes();
        int s2 = b.getSeconds();
        LocalTime Firsttime = LocalTime.of(h1,m1,s1);
        LocalTime Finaltime1 = Firsttime.plusHours(Long.parseLong(String.valueOf(h2)));
        LocalTime Finaltime2 = Finaltime1.plusMinutes(Long.parseLong(String.valueOf(m2)));
        LocalTime Finaltime3 = Finaltime2.plusSeconds(Long.parseLong(String.valueOf(s2)));
        return new TimeTC(Finaltime3);
    }
    public TimeTC supp(TimeTC second){
        return supp(this, second);
    }
    public static TimeTC sub(TimeTC a, TimeTC b)  {
        int h1 = a.getHours();
        int m1 = a.getMinutes();
        int s1 = a.getSeconds();
        int h2 = b.getHours();
        int m2 = b.getMinutes();
        int s2 = b.getSeconds();
        LocalTime Firsttime = LocalTime.of(h1,m1,s1);
        LocalTime Finaltime1 = Firsttime.minusHours(Long.parseLong(String.valueOf(h2)));
        LocalTime Finaltime2 = Finaltime1.minusMinutes(Long.parseLong(String.valueOf(m2)));
        LocalTime Finaltime3 = Finaltime2.minusSeconds(Long.parseLong(String.valueOf(s2)));
        return new TimeTC(Finaltime3);
    }
    public TimeTC sub(TimeTC second){
        return sub(this, second);
    }

    public static void main(String[] args) {
        TimeTC a = new TimeTC(10,12,13);
        TimeTC b = new TimeTC(3,7,12);
        System.out.println("Get time method: "+ a.getTime());
        System.out.println("Supplementation method : "+ supp(a,b));
        System.out.println("Subtraction method : "+ sub(a,b));





    }

}
