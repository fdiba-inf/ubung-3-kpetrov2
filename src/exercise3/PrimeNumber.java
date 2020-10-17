package exercise3;

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    int counter = 0;
    int d = 2;
    boolean complex = true;

    if (number > 2) {

      while (number > 2 && d <= number) {
      
        
      if (number%d == 0) {

        counter++;
        d++;
      }
      else {

        d++;
      }
      if (counter < 2) {

        complex = true;
      }
      else {

        complex = false;
      } 
    }
    System.out.println("Prime number: " + complex);
  }
  else {}
    }
    
}