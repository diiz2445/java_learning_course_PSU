import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * Лабораторная работа №1. Вариант 2.
 */
public class Lab1 {

    // ==================== Задание 1. Методы ====================

    /**
     * 6. Большая буква.
     * Возвращает true, если символ — большая буква от 'A' до 'Z'.
     */
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    /**
     * 7. Диапазон.
     * Возвращает true, если num входит в диапазон [a, b] (границы включительно).
     * Порядок a и b заранее неизвестен.
     */
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    /**
     * 8. Делитель.
     * Возвращает true, если любое из чисел делит другое нацело.
     */
    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            // 0 делит только 0, но деление на 0 недопустимо; считаем false, если хотя бы один 0
            return a == 0 && b == 0;
        }
        return (b % a == 0) || (a % b == 0);
    }

    /**
     * 9. Равенство.
     * Возвращает true, если все три числа равны.
     */
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    /**
     * 10. Многократный вызов.
     * Возвращает сумму цифр разряда единиц двух чисел.
     */
    public int lastNumSum(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }

    // ==================== Задание 2. Условия ====================

    /**
     * 6. Тройная сумма.
     * true, если два любых числа можно сложить так, чтобы получить третье.
     */
    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    /**
     * 7. Двойная сумма.
     * Сумма x и y; если сумма в [10, 19], возвращает 20.
     */
    public int sum2(int x, int y) {
        int s = x + y;
        if (s >= 10 && s <= 19) {
            return 20;
        }
        return s;
    }

    /**
     * 8. Возраст.
     * Возвращает строку вида "x год/года/лет" по правилам русского языка.
     */
    public String age(int x) {
        int absX = Math.abs(x);
        int lastTwo = absX % 100;
        int last = absX % 10;

        if (lastTwo >= 11 && lastTwo <= 14) {
            return x + " лет";
        }
        if (last == 1) {
            return x + " год";
        }
        if (last >= 2 && last <= 4) {
            return x + " года";
        }
        return x + " лет";
    }

    /**
     * 9. День недели.
     * 1 — понедельник ... 7 — воскресенье. Иначе "это не день недели".
     * Используется switch.
     */
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    /**
     * 10. Вывод дней недели.
     * Выводит переданный день и все последующие до воскресенья.
     * Если не день — "это не день недели". Используется switch с fall-through.
     */
    public void printDays(String x) {
        if (x == null) {
            System.out.println("это не день недели");
            return;
        }
        String dayName = x.trim().toLowerCase();
        switch (dayName) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // ==================== Задание 3. Циклы ====================

    /**
     * 6. Одинаковость.
     * true, если все цифры числа одинаковы.
     */
    public boolean equalNum(int x) {
        x = Math.abs(x);
        if (x < 10) {
            return true; // однозначное — все цифры одинаковы
        }
        int digit = x % 10;
        while (x > 0) {
            if (x % 10 != digit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    /**
     * 7. Квадрат.
     * Выводит квадрат из '*' размером x x x.
     */
    public void square(int x) {
        if (x <= 0) {
            System.out.println("(пустой квадрат)");
            return;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 8. Левый треугольник.
     * Треугольник из '*': в i-й строке i символов.
     */
    public void leftTriangle(int x) {
        if (x <= 0) {
            System.out.println("(пустой треугольник)");
            return;
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 9. Правый треугольник.
     * Треугольник, выровненный по правому краю.
     */
    public void rightTriangle(int x) {
        if (x <= 0) {
            System.out.println("(пустой треугольник)");
            return;
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 10. Угадайка.
     * Генерирует число 0..9, просит угадать до успеха, считает попытки.
     */
    public void guessGame() {
        Random random = new Random();
        int secret = random.nextInt(10);
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Я загадал число от 0 до 9. Попробуйте угадать!");
        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            while (!sc.hasNextInt()) {
                System.out.print("Ошибка ввода. Введите целое число от 0 до 9: ");
                sc.next();
            }
            int guess = sc.nextInt();
            attempts++;

            if (guess < 0 || guess > 9) {
                System.out.println("Число должно быть от 0 до 9. Попробуйте ещё раз.");
                continue;
            }

            if (guess == secret) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + attempts + " попытки");
                break;
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        }
    }

    // ==================== Задание 4. Массивы ====================

    /**
     * 6. Реверс.
     * Изменяет массив arr, записывая его задом наперёд (in-place).
     */
    public void reverse(int[] arr) {
        if (arr == null) return;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    /**
     * 7. Возвратный реверс.
     * Возвращает новый массив с элементами arr в обратном порядке.
     */
    public int[] reverseBack(int[] arr) {
        if (arr == null) return null;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    /**
     * 8. Объединение.
     * Новый массив: сначала элементы arr1, затем arr2.
     */
    public int[] concat(int[] arr1, int[] arr2) {
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    /**
     * 9. Все вхождения.
     * Возвращает массив индексов всех вхождений числа x в arr.
     */
    public int[] findAll(int[] arr, int x) {
        if (arr == null) return new int[0];
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices.add(i);
            }
        }
        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
        }
        return result;
    }

    /**
     * 10. Удалить негатив.
     * Новый массив без отрицательных элементов.
     */
    public int[] deleteNegative(int[] arr) {
        if (arr == null) return new int[0];
        int count = 0;
        for (int v : arr) {
            if (v >= 0) count++;
        }
        int[] result = new int[count];
        int j = 0;
        for (int v : arr) {
            if (v >= 0) {
                result[j++] = v;
            }
        }
        return result;
    }

    // ==================== Вспомогательные методы ====================

    private int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Ошибка: введите целое число. " + prompt);
            sc.next();
        }
        return sc.nextInt();
    }

    private char readChar(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next();
        while (s.isEmpty()) {
            System.out.print("Ошибка. " + prompt);
            s = sc.next();
        }
        return s.charAt(0);
    }

    private String readString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.next();
    }

    private int[] readArray(Scanner sc, String name) {
        int n = readInt(sc, "Введите размер массива " + name + ": ");
        while (n < 0) {
            n = readInt(sc, "Размер не может быть отрицательным. Введите размер: ");
        }
        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов массива " + name + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = readInt(sc, "  [" + i + "] = ");
        }
        return arr;
    }

    private void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // ==================== Главный метод ====================

    public static void main(String[] args) {
        Lab1 lab = new Lab1();
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("  Лабораторная работа №1. Вариант 2");
        System.out.println("  Процедурное программирование (Java)");
        System.out.println("==============================================\n");

        // ---------- Задание 1 ----------
        System.out.println("--- Задание 1. Методы ---\n");

        // 6. isUpperCase
        System.out.println("1.6 Большая буква (isUpperCase)");
        char ch = lab.readChar(sc, "Введите символ: ");
        System.out.println("Результат: " + lab.isUpperCase(ch));
        System.out.println();

        // 7. isInRange
        System.out.println("1.7 Диапазон (isInRange)");
        int a = lab.readInt(sc, "Введите a: ");
        int b = lab.readInt(sc, "Введите b: ");
        int num = lab.readInt(sc, "Введите num: ");
        System.out.println("Результат: " + lab.isInRange(a, b, num));
        System.out.println();

        // 8. isDivisor
        System.out.println("1.8 Делитель (isDivisor)");
        a = lab.readInt(sc, "Введите a: ");
        b = lab.readInt(sc, "Введите b: ");
        System.out.println("Результат: " + lab.isDivisor(a, b));
        System.out.println();

        // 9. isEqual
        System.out.println("1.9 Равенство (isEqual)");
        a = lab.readInt(sc, "Введите a: ");
        b = lab.readInt(sc, "Введите b: ");
        int c = lab.readInt(sc, "Введите c: ");
        System.out.println("Результат: " + lab.isEqual(a, b, c));
        System.out.println();

        // 10. lastNumSum + последовательное сложение пяти чисел
        System.out.println("1.10 Многократный вызов (lastNumSum)");
        System.out.println("Последовательное сложение пяти чисел по последним цифрам.");
        System.out.println("Пример из задания: 5+11 → 6; 6+123 → 9; 9+14 → 13; 13+1 → 4");
        int n1 = lab.readInt(sc, "Введите 1-е число: ");
        int n2 = lab.readInt(sc, "Введите 2-е число: ");
        int sum = lab.lastNumSum(n1, n2);
        System.out.println(n1 + " + " + n2 + " (посл.цифры) → " + sum);
        for (int i = 3; i <= 5; i++) {
            int next = lab.readInt(sc, "Введите " + i + "-е число: ");
            int prev = sum;
            sum = lab.lastNumSum(sum, next);
            System.out.println(prev + " + " + next + " (посл.цифры) → " + sum);
        }
        System.out.println("Итого: " + sum);
        System.out.println();

        // ---------- Задание 2 ----------
        System.out.println("--- Задание 2. Условия ---\n");

        // 6. sum3
        System.out.println("2.6 Тройная сумма (sum3)");
        a = lab.readInt(sc, "Введите x: ");
        b = lab.readInt(sc, "Введите y: ");
        c = lab.readInt(sc, "Введите z: ");
        System.out.println("Результат: " + lab.sum3(a, b, c));
        System.out.println();

        // 7. sum2
        System.out.println("2.7 Двойная сумма (sum2)");
        a = lab.readInt(sc, "Введите x: ");
        b = lab.readInt(sc, "Введите y: ");
        System.out.println("Результат: " + lab.sum2(a, b));
        System.out.println();

        // 8. age
        System.out.println("2.8 Возраст (age)");
        a = lab.readInt(sc, "Введите возраст (x): ");
        System.out.println("Результат: \"" + lab.age(a) + "\"");
        System.out.println();

        // 9. day
        System.out.println("2.9 День недели (day)");
        a = lab.readInt(sc, "Введите номер дня (1-7): ");
        System.out.println("Результат: \"" + lab.day(a) + "\"");
        System.out.println();

        // 10. printDays
        System.out.println("2.10 Вывод дней недели (printDays)");
        String dayStr = lab.readString(sc, "Введите название дня недели: ");
        System.out.println("Результат:");
        lab.printDays(dayStr);
        System.out.println();

        // ---------- Задание 3 ----------
        System.out.println("--- Задание 3. Циклы ---\n");

        // 6. equalNum
        System.out.println("3.6 Одинаковость (equalNum)");
        a = lab.readInt(sc, "Введите число x: ");
        System.out.println("Результат: " + lab.equalNum(a));
        System.out.println();

        // 7. square
        System.out.println("3.7 Квадрат (square)");
        a = lab.readInt(sc, "Введите размер квадрата x: ");
        System.out.println("Результат:");
        lab.square(a);
        System.out.println();

        // 8. leftTriangle
        System.out.println("3.8 Левый треугольник (leftTriangle)");
        a = lab.readInt(sc, "Введите высоту x: ");
        System.out.println("Результат:");
        lab.leftTriangle(a);
        System.out.println();

        // 9. rightTriangle
        System.out.println("3.9 Правый треугольник (rightTriangle)");
        a = lab.readInt(sc, "Введите высоту x: ");
        System.out.println("Результат:");
        lab.rightTriangle(a);
        System.out.println();

        // 10. guessGame
        System.out.println("3.10 Угадайка (guessGame)");
        lab.guessGame();
        System.out.println();

        // ---------- Задание 4 ----------
        System.out.println("--- Задание 4. Массивы ---\n");

        // 6. reverse
        System.out.println("4.6 Реверс (reverse) — изменение массива на месте");
        int[] arr = lab.readArray(sc, "arr");
        System.out.print("Исходный массив: ");
        lab.printArray(arr);
        lab.reverse(arr);
        System.out.print("После reverse: ");
        lab.printArray(arr);
        System.out.println();

        // 7. reverseBack
        System.out.println("4.7 Возвратный реверс (reverseBack)");
        arr = lab.readArray(sc, "arr");
        System.out.print("Исходный: ");
        lab.printArray(arr);
        int[] rev = lab.reverseBack(arr);
        System.out.print("Результат: ");
        lab.printArray(rev);
        System.out.println();

        // 8. concat
        System.out.println("4.8 Объединение (concat)");
        int[] arr1 = lab.readArray(sc, "arr1");
        int[] arr2 = lab.readArray(sc, "arr2");
        System.out.print("arr1: ");
        lab.printArray(arr1);
        System.out.print("arr2: ");
        lab.printArray(arr2);
        int[] cat = lab.concat(arr1, arr2);
        System.out.print("Результат: ");
        lab.printArray(cat);
        System.out.println();

        // 9. findAll
        System.out.println("4.9 Все вхождения (findAll)");
        arr = lab.readArray(sc, "arr");
        int x = lab.readInt(sc, "Введите число x для поиска: ");
        System.out.print("Массив: ");
        lab.printArray(arr);
        int[] idxs = lab.findAll(arr, x);
        System.out.print("Индексы вхождений " + x + ": ");
        lab.printArray(idxs);
        System.out.println();

        // 10. deleteNegative
        System.out.println("4.10 Удалить негатив (deleteNegative)");
        arr = lab.readArray(sc, "arr");
        System.out.print("Исходный: ");
        lab.printArray(arr);
        int[] pos = lab.deleteNegative(arr);
        System.out.print("Без отрицательных: ");
        lab.printArray(pos);
        System.out.println();

        System.out.println("==============================================");
        System.out.println("  Все задачи варианта 2 выполнены.");
        System.out.println("==============================================");
        sc.close();
    }
}
