import java.util.Scanner;
import java.text.NumberFormat;


public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the length dimension: ");
        double length = in.nextDouble();
        System.out.print("Enter the width dimension: ");
        double width = in.nextDouble();

        double area = length * width;

        System.out.print("The area of a ");
        System.out.printf("%.1f", length);
        System.out.print("-by-");
        System.out.printf("%.1f", width);
        System.out.print(" rectangle is ");
        System.out.printf("%.1f", area);
        System.out.print(".");

        in.close();
    }
}
