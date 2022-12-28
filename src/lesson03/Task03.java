package lesson03;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int n = 10;
        if (n >= 6 && n <= 12) {
            System.out.println("Доброе утро!");
        } else if (n >= 13 && n <= 18) {
            System.out.println("Добрый день!");
        } else if (n >= 19 && n <= 23) {
            System.out.println("Добрый вечер!");
        } else if ((n >= 1) && (n <= 5) || (n == 24)) {
            System.out.println("Доброй ночи!");
        } else {
            System.out.println("Некорректный время!");
        }
    }
}
