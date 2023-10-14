import java.util.Scanner;
import java.io.*;

public class BmiIndex {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double weight = getWeight(scanner);
    double height = getHeight(scanner);
    bmiCalculation(height, weight);
    }
    private static double getWeight(Scanner scanner) {
    System.out.println("Podaj swoją wagę [w kg] ");
    double weight = scanner.nextDouble();
    while (weight > 300 || weight < 20) {
    System.out.println("To niewłaściwe dane");
    System.out.println("Wpisz poprawną wartość");
    weight = scanner.nextDouble();
    }
    return weight;
    }
    private static double getHeight(Scanner scanner) {
    System.out.println("Podaj swój wzrost [w metrach!]");
    double height = scanner.nextDouble();
    while (height > 3 || height < 0.3) {
    System.out.println("To niewłaściwe dane");
    System.out.println("Wpisz poprawną wartość");
    height = scanner.nextDouble();
    }
    return height;
    }

    private static void bmiCalculation(double height, double weight) {
        double heightPower = Math.pow(height, 2);
        double bmi = weight / heightPower;
        rounding(bmi);
    }
    private static void rounding(double bmi) {
        int n=2;
        bmi =Math.round(bmi *Math.pow(10,n))/Math.pow(10,n);
        System.out.println("Twój wskaźnik BMI wynosi: " + bmi);
        conclusions(bmi);
    }

    private static void conclusions(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Masz niedowagę. Zgłoś się do lekarza!");
        } else if (bmi < 24.9) {
            System.out.println("Twoja waga jest prawidłowa :)");
        } else if (bmi < 29.9) {
            System.out.println("Masz nadwagę. Zmień dietę!");
        } else if (bmi < 34.9) {
            System.out.println("Twoje BMI wskazuje na otyłość I stopnia. Zmień dietę! Zacznij ćwiczyć!");
        } else {
            System.out.println("Twoje BMI wskazuje na otyłość kliniczną.Zgłoś się do lekarza!");
        }
    }
}
