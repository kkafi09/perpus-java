package Util;

import java.util.Scanner;

public class InputUtil {

    public static Scanner scanner = new Scanner(System.in);

    public static String inputStr(String info) {
        System.out.print(info + " : ");
        scanner.skip("\\R?");
        return scanner.nextLine();
    }

    public static int inputInt(String info){
        System.out.print(info + " : ");
        scanner.skip("\\R?");
        return scanner.nextInt();
    }
}
