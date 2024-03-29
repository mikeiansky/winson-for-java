package com.winson.jdkapi.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Mike Ian
 * @date 2022/12/20
 **/
public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);
        // 1676274467
        // 1676274480
        // 1676274496
    }

}
