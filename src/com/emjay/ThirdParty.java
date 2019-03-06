package com.emjay;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class ThirdParty {
    public static void main(String[] args) {
        String name = "musa mugo";
        System.out.println(StringUtils.isBlank(name));
        System.out.println(StringUtils.capitalize(name));
        System.out.println(StringUtils.difference("Kenya","kenya"));
        System.out.println(StringUtils.abbreviate(name,4));
        System.out.println(RandomStringUtils.random(5));
    }
}
