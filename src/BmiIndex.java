import java.util.Scanner;
public class BmiIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj swoją wagę [w kg] ");
        double weight=scanner.nextDouble();
        System.out.println("Podaj swój wzrost [w m!]");
        double height = scanner.nextDouble();

        double heightPower = Math.pow(height,2);
        double bmi = weight/heightPower;
        System.out.println("Twój wskaźnik BMI wynosi: "+bmi);

        if (bmi<18.5) {
            System.out.println("Masz niedowagę. Zgłoś się do lekarza!");}
        else if
        (bmi>=18.5 && bmi<24.9) {
            System.out.println("Twoja waga jest prawidłowa :)");}
        else if
        (bmi>=24.9 && bmi<29.9) {
            System.out.println("Masz nadwagę. Zmień dietę!");}
        else if
        (bmi>=29.9 && bmi<34.9) {
            System.out.println("Twoje BMI wskazuje na otyłość I stopnia. Zmień dietę! Zacznij ćwiczyć!");}
        else if (bmi>=34.9) {
            System.out.println("Twoje BMI wskazuje na otyłość kliniczną.Zgłoś się do lekarza!");
            }
    }

}
