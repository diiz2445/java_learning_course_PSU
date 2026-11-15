/**
 * Тестовый класс для демонстрации работы методов Lab1
 */
public class Lab1Demo {

    public static void main(String[] args) {
        Lab1 lab = new Lab1();

        System.out.println("=================================================");
        System.out.println("  ТЕСТ / ДЕМОНСТРАЦИЯ МЕТОДОВ Lab1  |  Вариант 2");
        System.out.println("=================================================\n");

        // ========== ЗАДАНИЕ 1 ==========
        System.out.println("--- Задание 1. Методы ---\n");

        System.out.println("1.6 isUpperCase('D') = " + lab.isUpperCase('D'));
        System.out.println("1.6 isUpperCase('q') = " + lab.isUpperCase('q'));
        System.out.println();

        System.out.println("1.7 isInRange(5, 1, 3)  = " + lab.isInRange(5, 1, 3));
        System.out.println("1.7 isInRange(2, 15, 33) = " + lab.isInRange(2, 15, 33));
        System.out.println();

        System.out.println("1.8 isDivisor(3, 6)  = " + lab.isDivisor(3, 6));
        System.out.println("1.8 isDivisor(2, 15) = " + lab.isDivisor(2, 15));
        System.out.println();

        System.out.println("1.9 isEqual(3, 3, 3)  = " + lab.isEqual(3, 3, 3));
        System.out.println("1.9 isEqual(2, 15, 2) = " + lab.isEqual(2, 15, 2));
        System.out.println();

        System.out.println("1.10 lastNumSum (последовательное сложение):");
        int s = lab.lastNumSum(5, 11);
        System.out.println("  5 + 11  -> " + s);
        s = lab.lastNumSum(s, 123);
        System.out.println("  6 + 123 -> " + s);
        s = lab.lastNumSum(s, 14);
        System.out.println("  9 + 14  -> " + s);
        s = lab.lastNumSum(s, 1);
        System.out.println("  13 + 1  -> " + s + "   (итого)");
        System.out.println();

        // ========== ЗАДАНИЕ 2 ==========
        System.out.println("--- Задание 2. Условия ---\n");

        System.out.println("2.6 sum3(5, 7, 2)  = " + lab.sum3(5, 7, 2));
        System.out.println("2.6 sum3(8, -1, 4) = " + lab.sum3(8, -1, 4));
        System.out.println();

        System.out.println("2.7 sum2(5, 7)  = " + lab.sum2(5, 7));
        System.out.println("2.7 sum2(8, -1) = " + lab.sum2(8, -1));
        System.out.println();

        System.out.println("2.8 age(5)  = \"" + lab.age(5) + "\"");
        System.out.println("2.8 age(31) = \"" + lab.age(31) + "\"");
        System.out.println("2.8 age(44) = \"" + lab.age(44) + "\"");
        System.out.println();

        System.out.println("2.9 day(5) = \"" + lab.day(5) + "\"");
        System.out.println("2.9 day(1) = \"" + lab.day(1) + "\"");
        System.out.println("2.9 day(9) = \"" + lab.day(9) + "\"");
        System.out.println();

        System.out.println("2.10 printDays(\"четверг\"):");
        lab.printDays("четверг");
        System.out.println();
        System.out.println("2.10 printDays(\"чг\"):");
        lab.printDays("чг");
        System.out.println();

        // ========== ЗАДАНИЕ 3 ==========
        System.out.println("--- Задание 3. Циклы ---\n");

        System.out.println("3.6 equalNum(1111) = " + lab.equalNum(1111));
        System.out.println("3.6 equalNum(1211) = " + lab.equalNum(1211));
        System.out.println();

        System.out.println("3.7 square(2):");
        lab.square(2);
        System.out.println();
        System.out.println("3.7 square(4):");
        lab.square(4);
        System.out.println();

        System.out.println("3.8 leftTriangle(2):");
        lab.leftTriangle(2);
        System.out.println();
        System.out.println("3.8 leftTriangle(4):");
        lab.leftTriangle(4);
        System.out.println();

        System.out.println("3.9 rightTriangle(3):");
        lab.rightTriangle(3);
        System.out.println();
        System.out.println("3.9 rightTriangle(4):");
        lab.rightTriangle(4);
        System.out.println();

        System.out.println("3.10 guessGame — интерактивный метод.");
        System.out.println("         Для запуска игры: java Lab1");
        System.out.println("         (или раскомментируйте строку ниже)");
        // lab.guessGame();
        System.out.println();

        // ========== ЗАДАНИЕ 4 ==========
        System.out.println("--- Задание 4. Массивы ---\n");

        // 6. reverse
        int[] arr6 = {1, 2, 3, 4, 5};
        System.out.print("4.6 reverse — до:    ");
        printArr(arr6);
        lab.reverse(arr6);
        System.out.print("         после: ");
        printArr(arr6);
        System.out.println();

        // 7. reverseBack
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.print("4.7 reverseBack — исходный:  ");
        printArr(arr7);
        System.out.print("              результат: ");
        printArr(lab.reverseBack(arr7));
        System.out.println();

        // 8. concat
        int[] a1 = {1, 2, 3};
        int[] a2 = {7, 8, 9};
        System.out.print("4.8 concat — arr1: ");
        printArr(a1);
        System.out.print("           arr2: ");
        printArr(a2);
        System.out.print("       результат: ");
        printArr(lab.concat(a1, a2));
        System.out.println();

        // 9. findAll
        int[] arr9 = {1, 2, 3, 8, 2, 2, 9};
        System.out.print("4.9 findAll — массив: ");
        printArr(arr9);
        System.out.print("         индексы 2: ");
        printArr(lab.findAll(arr9, 2));
        System.out.println();

        // 10. deleteNegative
        int[] arr10 = {1, 2, -3, 4, -2, 2, -5};
        System.out.print("4.10 deleteNegative — исходный: ");
        printArr(arr10);
        System.out.print("                   результат: ");
        printArr(lab.deleteNegative(arr10));
        System.out.println();

        System.out.println("=================================================");
        System.out.println("  Все методы Lab1 успешно вызваны.");
        System.out.println("=================================================");
    }

    private static void printArr(int[] arr) {
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
}
