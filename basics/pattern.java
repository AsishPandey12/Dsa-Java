package basics;
import java.util.*;

public class pattern {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // Print star pattern

    // for(int line = 1; line <= 4; line++){
    //   for(int star = 1; star <= line; star++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Print inverted star pattern

    // int n = sc.nextInt();
    // for(int line = 1; line <= n; line++){
    //   for(int star = 1; star <= n-line+1; star++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Print half-pyramid pattern
    // for(int line = 1; line <= 4; line++){
    //   for(int num = 1; num <= line; num++){
    //     System.out.print(num);
    //   }
    //   System.out.println();
    // }

    // Print character pattern
    int n = 4;
    char ch = 'A';
    for(int line = 1; line <= n; line++){
      for(int chars = 1; chars <= line; chars++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }

  }
}
