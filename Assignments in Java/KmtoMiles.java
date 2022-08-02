import java.util.Scanner;

public class KmtoMiles{

    public static void main(String[] args) {
        System.out.print("Enter Kilometers : ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.println("Miles : "+ String.format("%.2f", miles));
    }
}
