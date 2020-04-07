package com.datagenerator.talend.components.service;

public enum TimeZones {

    DEFAULT ("Default"),
    GMTP12 ("Etc/GMT+12"),
    GMTP11 ("Etc/GMT+11"),
    GMTP10 ("Etc/GMT+10"),
    GMTP09 ("Etc/GMT+9"),
    GMTP08 ("Etc/GMT+8"),
    GMTP07 ("Etc/GMT+7"),
    GMTP06 ("Etc/GMT+6"),
    GMTP05 ("Etc/GMT+5"),
    GMTP04("Etc/GMT+4"),
    GMTP03("Etc/GMT+3"),
    GMTP02("Etc/GMT+2"),
    GMTP01("Etc/GMT+1"),
    GMTP00("Etc/UTC"),
    GMTM01("Etc/GMT-1"),
    GMTM02("Etc/GMT-2"),
    GMTM03("Etc/GMT-3"),
    GMTM04("Etc/GMT-4"),
    GMTM45("Asia/Kabul"),
    GMTM05("Etc/GMT-5"),
    GMTM55("Asia/Colombo"),
    GMTM06("Etc/GMT-6"),
    GMTM07("Etc/GMT-7"),
    GMTM08("Etc/GMT-8"),
    GMTM09("Etc/GMT-9"),
    GMTM95("Australia/North"),
    GMTM10("Etc/GMT-10"),
    GMTM11("Etc/GMT-11"),
    GMTM12("Etc/GMT-12");

    private final String name;

    private TimeZones(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String getName() {
        return this.name;
    }
}
