package exercise3;

import java.util.Scanner;

public class AngleCalculation {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    double number;
    char unit; 
    
    do {
      
      System.out.println("Enter the number of rad or degree: ");
      number = input.nextInt();
    
      System.out.println("Now enter the unit r or d: ");
      
      unit = input.next().charAt(0);
      
      
      if (unit == 'd') {

        double radiant = (number*Math.PI) / 180;
        System.out.println("Angle: " + radiant + 'r');
      }
      else if (unit == 'r') {

        double degree = (number * 180) / Math.PI;
        System.out.println("Angle: " + degree + 'd');
      }
    }
    while (unit == 'r' || unit == 'd');
  }
}