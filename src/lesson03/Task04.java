package lesson03;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        day = Integer.parseInt(in.nextLine());
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 24:
                System.out.println("Доброй ночи!");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Добрый утро!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Добрый день!");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Добрый вечер!");
                break;
            default:
                System.out.println("Введено некорректное число!");
                break;
        }
    }
}
