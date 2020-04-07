package com.datagenerator.talend.components.service;

public enum TimeZones {

    DEFAULT ("Default"),
    GMTM12 ("Etc/GMT+12"),
    GMTM11 ("Etc/GMT+11"),
    GMTM10 ("Etc/GMT+10"),
    GMTM09 ("Etc/GMT+9"),
    GMTM08 ("Etc/GMT+8"),
    GMTM07 ("Etc/GMT+7"),
    GMTM06 ("Etc/GMT+6"),
    GMTM05 ("Etc/GMT+5"),
    GMTM04("Etc/GMT+4"),
    GMTM03("Etc/GMT+3"),
    GMTM02("Etc/GMT+2"),
    GMTM01("Etc/GMT+1"),
    GMTP00("Etc/UTC"),
    GMTP01("Etc/GMT-1"),
    GMTP02("Etc/GMT-2"),
    GMTP03("Etc/GMT-3"),
    GMTP04("Etc/GMT-4"),
    GMTP45("Asia/Kabul"),
    GMTP05("Etc/GMT-5"),
    GMTP55("Asia/Colombo"),
    GMTP06("Etc/GMT-6"),
    GMTP07("Etc/GMT-7"),
    GMTP08("Etc/GMT-8"),
    GMTP09("Etc/GMT-9"),
    GMTP95("Australia/North"),
    GMTP10("Etc/GMT-10"),
    GMTP11("Etc/GMT-11"),
    GMTP12("Etc/GMT-12");

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
