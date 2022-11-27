package com.cloudcomputing.common;

public enum Theme {

    NOTSPECIFIED(0),
    REASONING(1),
    TERROR(2),
    EMOTION(3),
    MECHANISM(4),
    HAPPY(5);


    private int code;


    Theme(int i) {
    }

    public int getCode() {
        return code;
    }

    public static Theme valueOf(int code) {
        if (code == 0) {
            return Theme.NOTSPECIFIED;
        } else if (code == 1) {
            return Theme.REASONING;
        } else if (code == 2) {
            return Theme.TERROR;
        } else if (code == 3) {
            return Theme.EMOTION;
        } else if (code == 4) {
            return Theme.MECHANISM;
        } else if (code == 5) {
            return Theme.HAPPY;
        } else {
            throw new IllegalArgumentException("没这个主题");
        }
    }
}
