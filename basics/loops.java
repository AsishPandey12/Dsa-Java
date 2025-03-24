package basics;
import java.util.*;

public class loops {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // WHILE Loop
    // int i = 0;
    // while(i < 10){
    //   System.out.println("hello World");
    //   i++;
    // }
    // System.out.println("printed Hello world 10x");

    // //print number from 1 to 10.
    // int counter = 1;
    // while(counter <= 100){
    //   System.out.print(counter + " ");
    //   counter++;
    // }

    // System.out.println();

    // //print number from 1 to n.
    // int j = 1;
    // int range = sc.nextInt();
    // while(j <= range){
    //   System.out.print(j + " ");
    //   j++;
    // }
    // System.out.println();

    // // print sum of first n natural number.
    // int n = sc.nextInt();
    // int k = 1;
    // int sum = 0;
    // while(k <= n){
    //   sum += k;
    //   k++;

    // }
    // System.out.println("Sum is :" + sum);
    

    // FOR Loop
    for(int i = 1; i <= 10; i++ ){
      System.out.println("hello world");
    }

    for(int line = 1; line <=4 ; line++){
      System.out.println("* * * *");
    }

    // Print Reverse of a number
    int num = 120403;

    while(num > 0){
      int lastdigit = num % 10;
      System.out.print(lastdigit);
      num = num / 10;
    }
    System.out.println();

    int number = 120403;
    int rev = 0;

    while(number > 0){
      int lastdigite = number % 10;
      rev = (rev * 10) + lastdigite;
      number /= 10;
    }
    System.out.println(rev);


    // do-while loop
    int i = 1;
    do{
      System.out.println("Hello World");
      i++;
    }while(i <= 10);


    //Break
    // keep entering number till user enters multiple of 10
    do{
      System.out.println("Enter your number");
      int numb = sc.nextInt();
      if(numb % 10 == 0){
        break;
      }
      System.out.println(numb);
    }while(true);
    
    // Continue
    for(int n = 1; n <= 5; n++){
      if(n == 3){
        continue;
      }
      System.out.println(n);
    }

    // Display all numbers entered by user axcept multiple of 10
    do{
      System.out.println("Enter your number");
      int inp = sc.nextInt();
      if(inp % 10 == 0){
        continue;
      }
      System.out.println(inp);
    }while(true);

  }
}
