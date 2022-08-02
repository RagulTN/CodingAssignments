import java.util.Scanner;

public class AreaofPolygon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Sides : ");
        int ns = sc.nextInt();
        System.out.print("Enter the length : ");
        double l = sc.nextDouble();

        //area
        double area =((ns*(l*l))/(4.0 * Math.tan(3.14 / ns)));

        System.out.printf("Area of polygon : "+ area);
    }
}