package com.zero.app;

import com.zero.util.DateUtils;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        String dateString = DateUtils.getDateStringByFormatDate(new Date(), DateUtils.DEFAULT_DATE_PATTERN);
        System.out.println(dateString);

        System.out.println("git checkout version-02");
    }
}
