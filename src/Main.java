import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите задачу (1-3) или 0, чтобы выйти.");
            int userChoice = scanner.nextInt();

            try {
                switch (userChoice) {
                    case 0:
                        System.out.println("Программа завершена.");
                        return;
                    case 1:
                        System.out.println("\nЗадача на численность населения.");
                        int population = 10_000_000;
                        double birthRate = 14.0 / 1000.0;
                        double deathRate = 8.0 / 1000.0;
                        int years = 10;

                        for (int i = 1; i <= years; i++) {
                            double births = population * birthRate;
                            double deaths = population * deathRate;
                            population += births - deaths;
                            System.out.println("Год " + i + ": численность населения = " + (int) population);
                        }
                        System.out.println("Численность населения через " + years + " лет: " + (int) population);

                        break;
                    case 2:
                        System.out.println("\nЗадача на население с другими условиями");
                        int HumanPopulation = 10_000_000;
                        double HumanBirthRate = 14.0 / 1000;
                        double HumanDeathRate = 8.0 / 1000;
                        int Years = 10;
                        double minBirthRate = 7.0 / 1000;
                        double minDeathRate = 6.0 / 1000;

                        for (int i = 1; i <= Years; i++) {
                            double HumanBirths = HumanPopulation * HumanBirthRate;
                            double HumanDeaths = HumanPopulation * HumanDeathRate;
                            HumanPopulation += HumanBirths - HumanDeaths;

                            System.out.println("Год " + i + ": численность населения = " + (int)HumanPopulation);
                            HumanBirthRate = Math.max(HumanBirthRate - 1.0 / 1000, minBirthRate);
                            HumanDeathRate = Math.max(HumanDeathRate - 1.0 / 1000, minDeathRate);
                        }
                        System.out.println("Численность населения через " + Years + " лет: " + (int) HumanPopulation);
                        break;
                    case 3:
                        System.out.println("\nЗадача на сумму вклада");

                        System.out.print("Введите сумму вклада: ");
                        float deposit = scanner.nextFloat();
                        System.out.print("Введите количество месяцев: ");
                        int months = scanner.nextInt();

                        float monthRate = 7.0f / 100;

                        for (int i = 1; i <= months; i++) {

                            deposit += deposit * monthRate;
                            System.out.println("Месяц " + i + ": сумма вклада = " + deposit);
                        }
                        System.out.println("Итоговая сумма вклада через " + months + " месяцев = " + deposit);


                    default:
                        System.out.println("Неправильный выбор. Попробуйте снова");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}