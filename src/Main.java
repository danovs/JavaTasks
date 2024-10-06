import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.lang.invoke.StringConcatException;
import java.security.PublicKey;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.function.IntBinaryOperator;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите задачу (1-20) или 0, чтобы выйти.");
            int userChoice = scanner.nextInt();
            try {
                switch (userChoice) {
                    case 0:
                        System.out.println("Вы вышли из программы.");
                        return;
                    case 1:
                        System.out.println("\nФункция для нахождения максимума.");
                        System.out.print("Введите число А: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Введите число B: ");
                        int num2 = scanner.nextInt();
                        System.out.println("\nМаксимальное число: " + FindMax(num1, num2));
                        break;
                    case 2:
                        System.out.println("\nКалькулятор деления.");
                        System.out.print("Введите число А: ");
                        double divNumber1 = scanner.nextInt();
                        System.out.print("Введите число В: ");
                        double divNumber2 = scanner.nextInt();
                        System.out.println("\nРезульат: " + DivideNumbers(divNumber1, divNumber2));
                        break;
                    case 3:
                        System.out.println("\nКонвертер строк в числа.");
                        System.out.print("Введите строку: ");
                        String string = scanner.next();
                        System.out.println("Выходной результат: " + StringToInt(string));

                        break;
                    case 4:
                        System.out.println("\nПроверка возраста.");
                        System.out.print("Введите возраст: ");
                        int age = scanner.nextInt();
                        System.out.println("Возраст: " + CheckAge(age));

                        break;
                    case 5:
                        System.out.println("\nНахождение корня.");
                        System.out.print("Введите число: ");
                        double sqrtNum = scanner.nextDouble();
                        System.out.println("Результат: " + Sqrt(sqrtNum));
                        break;
                    case 6:
                        System.out.println("\nФакториал.");
                        System.out.print("Введите число: ");
                        int numfac = scanner.nextInt();
                        System.out.println("Результат: " + Factorial(numfac));
                        break;
                    case 7:
                        System.out.println("\nПроверка массива на нули.");
                        int[] array = {5, 0, 30, 10, 0, 0, 34,
                                321, 3215, 5465, 0, 0, 1, 2, 3, 4, 5};
                        CheckZeros(array);
                        System.out.println("Массив содержит нули");

                        break;
                    case 8:
                        System.out.println("\nКалькулятор возведения в степень.");
                        System.out.print("Введите число: ");
                        double number = scanner.nextDouble();
                        System.out.print("Введите степень: ");
                        int extent = scanner.nextInt();
                        System.out.println("Результат\n" + Extent(number, extent));
                        break;
                    case 9:
                        System.out.println("\nОбрезка строки.");
                        scanner.nextLine();
                        System.out.print("Введите строку: ");
                        String stroka = scanner.nextLine();
                        System.out.print("Введите количество символов для обрезки строки: ");
                        int count = scanner.nextInt();
                        System.out.println(CutString(stroka, count));
                        break;
                    case 10:
                        System.out.println("\nПоиск элемента в массиве.");
                        int[] nums = {5, 3, 1, 10, 20, 40, 50, 0, 0, 30, 20, 100, 50, 3141, 1, 2, 3, 4, 5, 6, 7, 8};
                        System.out.print("Введите число, которое вы желаете найти в массиве: ");
                        int findNumber = scanner.nextInt();
                        int findIndex = FindNumberInArray(nums, findNumber);
                        System.out.println("Найдено число: " + findNumber + " на индексе: " + findIndex);
                        break;
                    case 11:
                        System.out.println("\nКонвертация в двоичную систему.");
                        System.out.print("Введите число: ");
                        int numForBin = scanner.nextInt();
                        System.out.println("Результат конертирования: " + ConvertIntToBin(numForBin));
                        break;
                    case 12:
                        System.out.println("\nПроверка делимости.");
                        System.out.print("Введите первое число: ");
                        double checkOddNum1 = scanner.nextInt();
                        System.out.print("Введите второе число: ");
                        double checkOddNum2 = scanner.nextInt();
                        System.out.println("Одно делиться на другое? " + CheckOdd(checkOddNum1, checkOddNum2));

                        break;
                    case 13:
                        System.out.println("\nЧтение элемента списка.");
                        List<Integer> myList = new ArrayList<>();
                        myList.add(1);
                        myList.add(314);
                        myList.add(411);
                        myList.add(4141);

                        System.out.println("\nВведите индекс, который вы хотите вывести: ");
                        int indexForList = scanner.nextInt();
                        System.out.println(GetListElement(myList, indexForList));

                        break;
                    case 14:
                        System.out.println("\nПарольная проверка.");
                        System.out.print("Введите пароль, который состоит более чем 8 символов.");
                        String password = scanner.next();
                        System.out.println(CheckPassword(password));
                        break;
                    case 15:
                        System.out.println("\nПроверка даты.");
                        System.out.print("Введите дату: ");
                        String date = scanner.next();
                        CheckDate(date);
                        break;
                    case 16:
                        System.out.println("\nКонкатенация строк");
                        System.out.print("Введите первую строку: ");
                        String str1 = scanner.next();
                        System.out.print("Введите вторую строку: ");
                        String str2 = scanner.next();
                        System.out.print(ConactStrings(str1, str2));
                        break;
                    case 17:
                        System.out.println("\nОстаток от деления.");
                        System.out.print("Введите число А: ");
                        double numb1 = scanner.nextDouble();
                        System.out.print("Введите число В: ");
                        double numb2 = scanner.nextDouble();
                        System.out.println(DivideTwo(numb1, numb2));
                        break;
                    case 18:
                        System.out.println("\nКвадратный корень.");
                        System.out.print("Введите число А: ");
                        double sqrA = scanner.nextDouble();
                        System.out.println(SqrtNums(sqrA));

                        break;
                    case 19:
                        System.out.println("\nВведите температуру в Цельсиях:");
                        double celsius = scanner.nextDouble();
                        System.out.println("Температура в Фаренгейтах: " + celsiusToFahrenheit(celsius));
                        break;
                    case 20:
                        System.out.println("Введите строку:");
                        String strCheck = scanner.next();
                        checkString(strCheck);
                        break;
                    default:
                        System.out.println("Неправильный выбор. Попробуйте снова");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int FindMax(int a, int b) throws Exception {

        if (a == b) {
            throw new Exception("Числа равны. Найти максимум невозможно.");
        } else {
            return Math.max(a, b);
        }

    }

    public static double DivideNumbers(double a, double b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException("Второе число равно нулю. Деление невозможно.");
        } else {
            return a / b;
        }
    }

    public static int StringToInt(String string) throws Exception {

        try {
            return Integer.parseInt(string);
        } catch (Exception e) {
            throw new NumberFormatException("Неудалось конвертировать строку в число");
        }
    }

    public static int CheckAge(int a) throws Exception {
        if (a < 0 || a > 150) {
            throw new IllegalArgumentException("Такого возраста не существует");
        } else {
            return a;
        }
    }

    public static double Sqrt(double a) throws Exception {
        if (a < 0) {
            throw new IllegalArgumentException("Нельзя найти корень от отрицательного числа");
        }
        return Math.sqrt(a);
    }

    public static int Factorial(int a) throws Exception {
        if (a < 0) {
            throw new IllegalArgumentException("Нельзя ввести отрицательное число");
        } else {
            int forFactorial = 1;
            for (int i = 1; i <= a; i++) {
                forFactorial *= i;
            }
            return forFactorial;
        }
    }

    public static void CheckZeros(int[] arr) throws Exception {
        for (int num : arr) {
            if (num == 0) throw new Exception("Массив содержит нули");
        }
    }

    public static double Extent(double a, int b) throws Exception {
        if (b < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательная");
        }
        else {
            return Math.pow(a, b);
        }
    }
    public static String CutString(String strochka, int a) throws Exception {
        if (a > strochka.length()) {
            throw new Exception("Введеное число превышает количество символов в строке");
        }
        else {

            strochka = strochka.substring(0, a);
        }
        return strochka;
    }

    public static int FindNumberInArray(int[] arr, int a) throws Exception {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == a) return k;
        }
        throw new Exception("Элемент не найден");
    }

    public static String ConvertIntToBin(int a) throws Exception {
        try {
            String binary = Integer.toBinaryString(a);
            return binary;
        }
        catch(Exception ex) {
            throw new Exception("Не удалось конвертировать");
        }
    }
    public static double CheckOdd(double a, double b) throws Exception {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель равен нулю.");
        }
        else {
            return a / b;
        }
    }

    public static int GetListElement(List<Integer> list, int index) throws Exception {
        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException("Индекс за пределами списка");
        return list.get(index);
    }

    public static String CheckPassword(String password) throws Exception {
        if (password.length() < 8) throw new IllegalArgumentException("В пароле меньше чем 8 символов.");
        return password;
    }

    public static void CheckDate(String date) throws Exception {
        String pattern = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$";
        if(!date.matches(pattern)) throw new Exception("Неправильный формат даты");
    }

    public static String ConactStrings(String string1, String string2) throws Exception {
        if (string1 == null || string2 == null) throw new StringConcatException("Неудалось конкатинировать строки");
        return string1 + string2;
    }

    public static double DivideTwo(double a, double b) throws Exception {
        if (b == 0) throw new ArithmeticException("Делитель не может быть нуль");
        return a % b;
    }

    public static double SqrtNums(double a) throws Exception {
        if (a < 0) throw new ArithmeticException("Число не может быть отрицательным");
        return Math.sqrt(a);
    }

    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) throw new IllegalArgumentException("Температура ниже абсолютного нуля.");
        return celsius * 9 / 5 + 32;
    }

    public static void checkString(String str) {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("Строка пуста или равна null.");
    }
}