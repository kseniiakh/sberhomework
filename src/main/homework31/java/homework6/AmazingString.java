package homework6;

/**
 * 6. Необходимо реализовать класс AmazingString, который хранит внутри себя
 * строку как массив char и предоставляет следующий функционал:
 * Конструкторы:
 * ● Создание AmazingString, принимая на вход массив char
 * ● Создание AmazingString, принимая на вход String
 * Публичные методы (названия методов, входные и выходные параметры
 * продумать самостоятельно). Все методы ниже нужно реализовать “руками”, т.е.
 * не прибегая к переводу массива char в String и без использования стандартных
 * методов класса String.
 * ● Вернуть i-ый символ строки
 * ● Вернуть длину строки
 * ● Вывести строку на экран
 * ● Проверить, есть ли переданная подстрока в AmazingString (на вход
 * подается массив char). Вернуть true, если найдена и false иначе
 * ● Проверить, есть ли переданная подстрока в AmazingString (на вход
 * подается String). Вернуть true, если найдена и false иначе
 * ● Удалить из строки AmazingString ведущие пробельные символы, если
 * они есть
 * ● Развернуть строку (первый символ должен стать последним, а
 * последний первым и т.д.)
 */

public class AmazingString {

    private char[] array;

    public AmazingString(char[] array) {
        this.array = array;
    }

    public AmazingString(String line) {

        array = new char[line.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = line.charAt(i);
        }
    }


    public char returnCharacterOfTheLine(int i) {

        char c = ' ';
        for (int j = 0; j < array.length; j++) {
            if (j == i) {
                System.out.println(array[j]);
                c = array[j];
            }
        }
        return c;
    }

    public int returnLengthOfTheLine() {
        return array.length;
    }

    public void printLine() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public boolean substringInArrayChars(char[] chars) {
        int m = this.array.length;
        int n = chars.length;

        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n && i + j < m && chars[j] == this.array[i + j]) {
                j++;
            }
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public boolean substringInString(String str) {

        int m = this.array.length;
        int n = str.toCharArray().length;

        for (int i = 0; i < m; i++) {
            int j = 0;
            while (j < n && i + j < m && str.charAt(j) == this.array[i + j]) {
                j++;
            }
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public void deleteFirstBackspaceSymbol() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] <= ' ') {
                for (int j = i + 1; j < this.array.length; j++) {
                    this.array[j - 1] = this.array[j];
                }
            }
        }
    }

    public void reverseString() {
        for (int i = this.array.length - 1; i >= 0; i--) {
            System.out.print(this.array[i]);
        }
        System.out.println();
    }




    public static void main(String[] args) {
        AmazingString line = new AmazingString("Hello, world!");
        line.returnCharacterOfTheLine(0);
        System.out.println(line.returnLengthOfTheLine());
        line.printLine();
        System.out.println();
        System.out.println(line.substringInArrayChars(new char[]{'w', 'o', 'r'}));
        System.out.println(line.substringInString("hfjf"));
        line.deleteFirstBackspaceSymbol();
        line.reverseString();
    }
}

