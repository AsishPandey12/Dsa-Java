package basics;
import java.util.*;

public class input {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // String input = sc.next();
    // System.out.println(input);

    // String name = sc.nextLine();
    // System.out.println(name);

    // int number = sc.nextInt();
    // System.out.println(number);

    // float price = sc.nextFloat();
    // System.out.println(price);

    // boolean var = sc.nextBoolean();
    // System.out.println(var);

    // Sum of a and b
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println(sum);

    // Product of x and y
    // int x = sc.nextInt();
    // int y = sc.nextInt();
    // int product = x * y;
    // System.out.println(product);

    //Area of circle
    float rad = sc.nextFloat();
    float area = 3.14f * rad * rad;
    System.out.println(area);
    sc.close();
  }
  
}
