package basics;
import java.util.*;

public class primeornot {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your number");
    int n = sc.nextInt();

    if(n == 2){
      System.out.println("n is prime");
    } 
    else{
      boolean isprime = true;
      for(int i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0){
          isprime = false;
        }
      }
        if(isprime == true){
          System.out.println("n is prime");
        }
        else{
          System.out.println("n is not prime");
        }
    }

  }
  
}
