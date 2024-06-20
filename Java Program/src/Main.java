/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nathnanel Balcha
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width of the rectangle: ");
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length, width);
            double area = rectangle.getArea();
            System.out.println("Area of the rectangle: " + area);
        }
    }
}
