package com.datagenerator.talend.components.service;

public enum TimeZones {

    DEFAULT ("Default"),
    GMTP12 ("Etc/GMT+12"),
    GMTP11 ("Pacific/Samoa"),
    GMTP10 ("Pacific/Honolulu"),
    GMTP09 ("Pacific/Gambier"),
    GMTP08 ("America/Juneau"),
    GMTP07 ("America/Vancouver"),
    GMTP06 ("America/Denver"),
    GMTP05 ("America/Chicago"),
    GMTP04("America/Havana"),
    GMTP03("America/Cayenne"),
    GMTP02("America/Miquelon"),
    GMTP01("Etc/GMT+1"),
    GMTP00("Etc/UTC"),
    GMTM01("Europe/Dublin"),
    GMTM02("Europe/Paris"),
    GMTM03("Europe/Vilnius"),
    GMTM04("Asia/Dubai"),
    GMTM45("Asia/Kabul"),
    GMTM05("Asia/Karachi"),
    GMTM55("Asia/Colombo"),
    GMTM06("Asia/Almaty"),
    GMTM07("Asia/Bangkok"),
    GMTM08("Asia/Singapore "),
    GMTM09("Asia/Seoul"),
    GMTM95("Australia/Yancowinna"),
    GMTM10("Australia/Melbourne"),
    GMTM11("Pacific/Norfolk"),
    GMTM12("Pacific/Fiji");

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
