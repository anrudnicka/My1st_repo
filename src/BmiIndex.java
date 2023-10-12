import java.util.Scanner;
public class BmiIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj swoją wagę [w kg] ");
        double weight=scanner.nextDouble();

            if (weight>300||weight<20){
            System.out.println("To niewłaściwe dane");
            System.exit(0);
        }
        System.out.println("Podaj swój wzrost [w metrach!]");
        double height = scanner.nextDouble();
            if (height>3||height<0.3){
            System.out.println("To niewłaściwe dane");
            System.exit(0);}
        double heightPower = Math.pow(height,2);
        double bmi = weight/heightPower;
        System.out.println("Twój wskaźnik BMI wynosi: "+bmi);

        if (bmi<18.5) {
            System.out.println("Masz niedowagę. Zgłoś się do lekarza!");}
        else if
        (bmi<24.9) {
            System.out.println("Twoja waga jest prawidłowa :)");}
        else if
        (bmi<29.9) {
            System.out.println("Masz nadwagę. Zmień dietę!");}
        else if
        (bmi<34.9) {
            System.out.println("Twoje BMI wskazuje na otyłość I stopnia. Zmień dietę! Zacznij ćwiczyć!");}
        else  {
            System.out.println("Twoje BMI wskazuje na otyłość kliniczną.Zgłoś się do lekarza!");
            }
    }

}
