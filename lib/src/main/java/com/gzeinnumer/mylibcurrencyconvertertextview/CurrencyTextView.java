package com.gzeinnumer.mylibcurrencyconvertertextview;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CurrencyTextView {

    public static String changePattern(String prefix, int value) {
        String cleanString = String.valueOf(value).replace(prefix, "").replaceAll("[,]", "");

        String formattedString;
        if (cleanString.contains(".")) {
            formattedString = formatDecimal(cleanString, prefix);
        } else {
            formattedString = formatInteger(cleanString, prefix);
        }
        return formattedString;
    }

    public static String changePattern(String prefix, double value) {
        String cleanString = String.valueOf(value).replace(prefix, "").replaceAll("[,]", "");

        String formattedString;
        if (cleanString.contains(".")) {
            formattedString = formatDecimal(cleanString, prefix);
        } else {
            formattedString = formatInteger(cleanString, prefix);
        }
        return formattedString;
    }

    public static String changePattern(String prefix, String value) {
        String cleanString = value.replace(prefix, "").replaceAll("[,]", "");

        String formattedString;
        if (cleanString.contains(".")) {
            formattedString = formatDecimal(cleanString, prefix);
        } else {
            formattedString = formatInteger(cleanString, prefix);
        }
        return formattedString;
    }

    private static String formatDecimal(String str, String prefix) {
        if (str.equals(".")) {
            return prefix + ".";
        }
        BigDecimal parsed = new BigDecimal(str);
        // example pattern VND #,###.00
        DecimalFormat formatter = new DecimalFormat(prefix + "#,###.",
                new DecimalFormatSymbols(Locale.US));
        formatter.setRoundingMode(RoundingMode.DOWN);
        return formatter.format(parsed);
    }

    private static String formatInteger(String str, String prefix) {
        BigDecimal parsed = new BigDecimal(str);
        DecimalFormat formatter = new DecimalFormat(prefix + "#,###", new DecimalFormatSymbols(Locale.US));
        return formatter.format(parsed);
    }

    public static String trimCommaOfString(String value){
        if (value.contains(",")) {
            return value.replace(",", "");
        } else {
            return value;
        }
    }

    public static String trimCommaOfString(String srefix, String string){
        if (string.contains(",") || srefix.length()>0) {
            if (srefix.length()>0)
                return string.replace(",", "").replace(srefix,"");
            else
                return string.replace(",", "");
        } else {
            return string;
        }
    }
}
