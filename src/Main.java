import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String calc(String input) {
        return input;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число от 1 до 10");

        Integer a = Integer.parseInt(sc.nextLine());


        while (true) {

            if (a > 10) {

                System.out.println("Число больше 10");
                throw new Exception();



            }
            break;
        }
        System.out.println("Введите второе число от 1 до 10");
        Integer b = Integer.parseInt(sc.nextLine());
        while (true) {

            if (b > 10) {

                System.out.println("Больше 10 нельзя");
                throw new Exception();

            }
            break;
        }
        System.out.println("Введите знак");
        char znak = sc.next().charAt(0);


        if (znak == '+') {
            int result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        } else if (znak == '-') {
            int result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        } else if (znak == '*') {
            int result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        } else if (znak == '/') {
            int result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        }
    }
}

