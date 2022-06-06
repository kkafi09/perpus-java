package Util;

import java.util.Scanner;

public class InputUtil {

    public static Scanner scanner = new Scanner(System.in);

    public static String inputStr(String info) {
        System.out.print(info + " : ");
        return scanner.nextLine();
    }

    public static int inputInt(String info){
        System.out.print(info + " : ");
        return scanner.nextInt();
    }
}
