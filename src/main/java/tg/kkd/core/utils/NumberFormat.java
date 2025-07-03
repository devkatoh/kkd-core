package tg.kkd.core.utils;

import java.text.DecimalFormat;

public class NumberFormat {
    public static String formatDigit(Integer digit) {
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        return decimalFormat.format(digit);
    }
}
