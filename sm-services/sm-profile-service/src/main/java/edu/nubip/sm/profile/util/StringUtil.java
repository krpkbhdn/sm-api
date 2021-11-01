package edu.nubip.sm.profile.util;

public class StringUtil {
    public static boolean isNumeric(String str) {
        if (str == null) return false;
        if (str.isEmpty()) return false;
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
