package exercise3;

import java.util.Scanner;

public class NamePrinter {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String name = input.next();
    int count = 0;
    int l = name.length();

    for ( int i = 0 ; count < l ; i++) {

      System.out.print("* " + name.charAt(i));
      System.out.println(" *");
      count++;

    }
  }
}