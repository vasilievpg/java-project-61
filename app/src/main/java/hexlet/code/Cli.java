package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void knowing() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var name = sc.next();

        System.out.println("Hello, " + name + "!");
    }
}
