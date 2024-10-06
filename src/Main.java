import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("\nВыберите задачу, которую хотите выполнить:");
            System.out.println("1: Проверить, является ли число четным или нечетным");
            System.out.println("2: Найти минимальное из трех чисел");
            System.out.println("3: Показать таблицу умножения на 5");
            System.out.println("4: Найти сумму чисел от 1 до N");
            System.out.println("5: Показать первые N чисел Фибоначчи");
            System.out.println("6: Проверить, является ли число простым");
            System.out.println("7: Показать числа от N до 1");
            System.out.println("8: Найти сумму четных чисел между A и B");
            System.out.println("9: Развернуть строку");
            System.out.println("10: Подсчитать количество цифр в числе");
            System.out.println("11: Найти факториал числа");
            System.out.println("12: Найти сумму цифр числа");
            System.out.println("13: Проверить, является ли строка палиндромом");
            System.out.println("14: Найти максимальный элемент в массиве");
            System.out.println("15: Найти сумму элементов массива");
            System.out.println("16: Подсчитать количество положительных и отрицательных чисел в массиве");
            System.out.println("17: Найти простые числа в диапазоне");
            System.out.println("18: Подсчитать количество гласных и согласных в строке");
            System.out.println("19: Развернуть порядок слов в строке");
            System.out.println("20: Проверить, является ли число числом Армстронга");
            System.out.println("0: Выйти из программы");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Выход из программы...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите целое число: ");
                    int number = scanner.nextInt();
                    System.out.println(number + (number % 2 == 0 ? " - четное число." : " - нечетное число."));
                    break;

                case 2:
                    System.out.print("Введите три целых числа: ");
                    int first = scanner.nextInt();
                    int second = scanner.nextInt();
                    int third = scanner.nextInt();
                    int min = Math.min(Math.min(first, second), third);
                    System.out.println("Минимальное число: " + min);
                    break;

                case 3:
                    int multiplier = 5;
                    System.out.println("Таблица умножения на 5:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " * " + multiplier + " = " + (i * multiplier));
                    }
                    break;

                case 4:
                    System.out.print("Введите целое число N: ");
                    int N = scanner.nextInt();
                    int sum = IntStream.rangeClosed(1, N).sum();
                    System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);
                    break;

                case 5:
                    System.out.print("Введите количество чисел Фибоначчи: ");
                    int fibCount = scanner.nextInt();
                    System.out.println("Первые " + fibCount + " чисел Фибоначчи:");
                    for (int i = 0; i < fibCount; i++) {
                        System.out.println(fibonacci(i));
                    }
                    break;

                case 6:
                    System.out.print("Введите целое число для проверки простоты: ");
                    int primeCheck = scanner.nextInt();
                    System.out.println("Введённое число " + (isPrime(primeCheck) ? "является" : "не является") + " простым");
                    break;

                case 7:
                    System.out.print("Введите целое число для обратного отсчета: ");
                    int countdown = scanner.nextInt();
                    System.out.println("Числа от " + countdown + " до 1:");
                    IntStream.iterate(countdown, i -> i >= 1, i -> i - 1).forEach(System.out::println);
                    break;

                case 8:
                    System.out.print("Введите два числа A и B: ");
                    int A = scanner.nextInt();
                    int B = scanner.nextInt();
                    int evenSum = IntStream.rangeClosed(Math.min(A, B), Math.max(A, B)).filter(i -> i % 2 == 0).sum();
                    System.out.println("Сумма четных чисел между A и B: " + evenSum);
                    break;

                case 9:
                    System.out.print("Введите строку для разворота: ");
                    scanner.nextLine(); // Очистка буфера
                    String input = scanner.nextLine();
                    String reversed = new StringBuilder(input).reverse().toString();
                    System.out.println("Строка в обратном порядке: " + reversed);
                    break;

                case 10:
                    System.out.print("Введите целое число для подсчета цифр: ");
                    int digitCount = scanner.nextInt();
                    System.out.println("В числе " + digitCount + " цифр: " + String.valueOf(digitCount).length());
                    break;

                case 11:
                    System.out.print("Введите число для вычисления факториала: ");
                    int factorialNumber = scanner.nextInt();
                    System.out.println("Факториал числа равен: " + factorial(factorialNumber));
                    break;

                case 12:
                    System.out.print("Введите число для вычисления суммы цифр: ");
                    int numberToSumDigits = scanner.nextInt();
                    int digitSum = String.valueOf(numberToSumDigits).chars().map(Character::getNumericValue).sum();
                    System.out.println("Сумма цифр числа равна: " + digitSum);
                    break;

                case 13:
                    System.out.print("Введите строку для проверки на палиндром: ");
                    scanner.nextLine(); // Очистка буфера
                    String palindromeCheck = scanner.nextLine();
                    boolean isPalindrome = new StringBuilder(palindromeCheck).reverse().toString().equals(palindromeCheck);
                    System.out.println("Строка " + (isPalindrome ? "является" : "не является") + " палиндромом");
                    break;

                case 14:
                    System.out.print("Введите размер массива: ");
                    int arraySize = scanner.nextInt();
                    int[] array = new int[arraySize];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < arraySize; i++) {
                        array[i] = scanner.nextInt();
                    }
                    int maxElement = Arrays.stream(array).max().getAsInt();
                    System.out.println("Максимальный элемент массива: " + maxElement);
                    break;

                case 15:
                    System.out.println("Введите числа, где первое - размер массива, остальные - элементы массива:");
                    String[] elements = reader.readLine().split(" ");
                    int size = Integer.parseInt(elements[0]);
                    int arraySum = Arrays.stream(elements, 1, size + 1).mapToInt(Integer::parseInt).sum();
                    System.out.println("Сумма элементов массива: " + arraySum);
                    break;

                case 16:
                    System.out.println("Введите числа, где первое - размер массива, остальные - элементы массива:");
                    elements = reader.readLine().split(" ");
                    size = Integer.parseInt(elements[0]);
                    int positives = (int) Arrays.stream(elements, 1, size + 1).mapToInt(Integer::parseInt).filter(x -> x > 0).count();
                    int negatives = (int) Arrays.stream(elements, 1, size + 1).mapToInt(Integer::parseInt).filter(x -> x < 0).count();
                    System.out.println("Количество положительных чисел: " + positives);
                    System.out.println("Количество отрицательных чисел: " + negatives);
                    break;

                case 17:
                    System.out.print("Введите два целых числа для поиска простых чисел в диапазоне: ");
                    A = scanner.nextInt();
                    B = scanner.nextInt();
                    System.out.println("Простые числа в диапазоне:");
                    IntStream.rangeClosed(Math.min(A, B), Math.max(A, B)).filter(Main::isPrime).forEach(System.out::println);
                    break;

                case 18:
                    System.out.print("Введите строку для подсчета гласных и согласных: ");
                    scanner.nextLine(); // Очистка буфера
                    String line = scanner.nextLine();
                    long vowelCount = line.chars().filter(c -> "уеыAOИЮ".indexOf(c) != -1).count();
                    long consonantCount = line.chars().filter(c -> "кньбъгпрцзЦКНГШЩЗХЪФВПРЛ".indexOf(c) != -1).count();
                    System.out.println("Количество гласных: " + vowelCount + "\nКоличество согласных: " + consonantCount);
                    break;

                case 19:
                    System.out.print("Введите строку для разворота порядка слов: ");
                    String[] words = scanner.nextLine().split(" ");
                    String reversedWords = String.join(" ", reverseArray(words));
                    System.out.println("Строка в обратном порядке: " + reversedWords);
                    break;

                case 20:
                    System.out.print("Введите число для проверки на число Армстронга: ");
                    int armstrongCheck = scanner.nextInt();
                    int armstrongSum = String.valueOf(armstrongCheck).chars().map(Character::getNumericValue)
                            .map(x -> (int) Math.pow(x, String.valueOf(armstrongCheck).length())).sum();
                    System.out.println("Число " + (armstrongSum == armstrongCheck ? "является" : "не является") + " числом Армстронга");
                    break;

                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    private static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}