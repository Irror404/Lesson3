package lesson03;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:" );
        n = Integer.parseInt(in.nextLine());
        if (n == 1) {
            System.out.println("Понедельник");
        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6) {
            System.out.println("Суббота");
        } else if (n == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
