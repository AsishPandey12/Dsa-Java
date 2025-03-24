package basics;
import java.util.*;

public class conditional {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int age = 19;
    if(age >= 18){
      System.out.println("You can vote and drive");
    }
    else if(age >= 13 && age < 18){
      System.out.println("teenager");
    }
    else{
      System.out.println("You can not drive and vote");
    }

    // Print largest of 2
    int A = 1;
    int B = 3;
    if (A >= B){
      System.out.println("A is largest of 2");
    }
    else{
      System.out.println("B is largest of 2");
    }

    // Print number is odd or even
    int n = sc.nextInt();
    if(n % 2 == 0){
      System.out.println(n + " is even");
    } else {
      System.out.println(n + " is odd");
    }

    // Print largest of 3
    int a = 1;
    int b = 3;
    int c = 5;
    if (a >= b && a >= c){
      System.out.println("a is lagest of 3");
    } else if(b >= c) {
      System.out.println("b is largest of 3");
    } else {
      System.out.println("c is lagest of 3");
    }

    // Ternary operator
    int num = 6;
    String type = (num % 2 == 0) ? "even" : "odd";
    System.out.println(type);

    int marks = sc.nextInt();
    String val = (marks >= 33) ? "Pass" : "Fail";
    System.out.println(val);
  }
}
