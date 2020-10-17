package exercise3;

public class NumberSearch {

  public static void main(String[] args) {

    int i;
    int count = 0;

    for (i = 100 ; i < 1000 ; i++) {

      if ( i%6 == 0 && i%5 == 0) {
 
        count++;
        if (count < 10) {

          System.out.print(i + " ");
        }
        else {

          count = 0;
          System.out.println(i);
        } 
      }
    } 
  }
}