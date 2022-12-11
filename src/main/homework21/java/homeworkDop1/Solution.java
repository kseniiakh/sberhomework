package homeworkDop1;

/*
Создать программу генерирующую пароль.
На вход подается число N — длина желаемого пароля. Необходимо проверить,
что N >= 8, иначе вывести на экран "Пароль с N количеством символов
небезопасен" (подставить вместо N число) и предложить пользователю еще раз
ввести число N.
Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
вывести его на экран. В пароле должны быть:
● заглавные латинские символы
● строчные латинские символы
● числа
● специальные знаки(_*-)
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину пароля: ");
        int N = scanner.nextInt();

        while (N < 8) {
            System.out.print("Пароль с " + N + " количеством символов небезопасен. Попробуй еще раз.");
            return;
        }
        System.out.println(generatePassword(N));

    }

    public static String generatePassword(int n) {
        final String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_*-";
        SecureRandom random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(str.length());
            builder.append(str.charAt(index));
        }

        return builder.toString();
    }
}
