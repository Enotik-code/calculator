package cal;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String string = s.nextLine();
        System.out.println("что ты написал " + string);
    }
}
