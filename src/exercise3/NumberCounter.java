package exercise3;

import java.util.Scanner;

public class NumberCounter {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int counterp = 0;
    int countern = 0;
    int counter = 0;
    double sum = 0;
    double average = 0;
    int number = input.nextInt();

    while (number != 0) {
      if (number > 0) {

      counterp++;

      }
      else {

        countern++;

      }
      counter++;
      sum = sum + number;
      average = sum / counter;

      number = input.nextInt();

    }
    System.out.println("Positive numbers: " + counterp);

    System.out.println("Negative numbers: " + countern);

    System.out.println("Sum: " + sum);

    System.out.println("Average: " + average);
  }
}