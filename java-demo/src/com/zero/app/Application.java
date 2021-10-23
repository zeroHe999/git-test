package com.zero.app;

import com.zero.util.DateUtils;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        String dateString = DateUtils.getDateStringByFormatDate(new Date(), DateUtils.DEFAULT_DATE_PATTERN);
        System.out.println(dateString);

        System.out.println("git checkout version-02");

        System.out.println("git checkout version-03");

        System.out.println("git merge normal,code in hot-fix branch,git commit version-04");

        System.out.println("git merge conflict,code in master branch,git commit version-0501");
        System.out.println("git merge conflict,code in hot-fix branch,git commit version-0502");
        System.out.println("git merge conflict fixed by hand");
    }
}
