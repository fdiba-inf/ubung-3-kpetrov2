package exercise3;

import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double a;
    double b;
    double c;

    do {

      System.out.println("Enter a value for a: ");
      a = input.nextDouble();
      System.out.println("Enter a value for b: ");
      b = input.nextDouble();
      System.out.println("Enter a value for c: ");
      c = input.nextDouble();

      if (a > 0 && b > 0 && c > 0 && a+b > c && a+c > b && b+c > a ) {

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
        if (a == b && a == c && b == c) {
          System.out.println("Typ: equilateral");
        }
        else if (a == b || a == c || b == c) {
          System.out.println("Typ: isosceles");
        }
        else {
          System.out.println("Typ: scalene");
        }
      }
      else {
        System.out.println("Values are not correct!");
      }
    }
    while ( a > 0 || b > 0 || c > 0);
  }
}