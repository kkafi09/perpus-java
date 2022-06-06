package Util;

public class FormatString {

    public static String formatStr(String str, int length) {
        StringBuilder builder = new StringBuilder();
        int lenAdd = length - str.length();

        builder.append(str);
        if (lenAdd > 0){
            builder.append(" ".repeat(lenAdd));
        }

        return builder.toString();
    }

}
