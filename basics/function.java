package basics;
import java.util.*;

public class function {
  public static void printhelloworld(){
    System.out.println("Hello world");
    System.out.println("Hello world");
    System.out.println("Hello world");
  }

  public static int calculatesum(int num1 , int num2){
    int sum = num1 + num2;
    return sum;
  }

  public static int swap(int x , int y){
    // Swap
    int temp = x;
    x = y;
    y = temp;
    System.out.println("x is = " + x);
    System.out.println("y is = " + y);
    return 3;
  }

  // product of a and b
  public static int multiply(int a , int b){
    int product = a * b;
    return product;
  }

  // Function to calculate factorial
  public static int factorial(int n){
    int f = 1;
    for(int i = 1; i <= n ; i++){
      f = f * i;
    }
    return f;
  }

  // Function to calculate Binomial coefficient
  public static int Bincoeff(int n , int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n - r);

    int Binc = fact_n / (fact_r * fact_nmr);
    return Binc;
  }

 
  // Function overloading using parameter
  // public static int sum(int a , int b){
  //   return a + b;
  // }

  // // Function overloading using parameter
  // public static int sum(int a , int b , int c){
  //   return a + b + c;
  // }

  // Function overloading Data Type
  public static int sum(int a, int b){
    return a + b;
  }

  public static float sum(float a , float b){
    return a + b;
  }

  // public static boolean isPrime(int n){
  //   // corner case
  //   // 2
  //   if(n == 2){
  //     return true;
  //   }
  //   for(int i =2; i <= n-1; i++){
  //     if(n % i == 0) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  // Function to check if number is prime or not.
  public static boolean isPrime(int n){
    if(n == 2){
      return true;
    }
    for(int i = 2; i <= Math.sqrt(n); i++){
      if(n % i == 0){
        return false;
      }

    }
    return true;
  }

  public static void main(String args[]){

    // Sum of a and b

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a :");
    // int a = sc.nextInt();
    // System.out.println("Enter b :");
    // int b = sc.nextInt();
    // int sum = calculatesum(a, b);
    // System.out.println("Sum is :" + sum);

    // Swap - Exchange value
    // int x = 5;
    // int y = 10;
    // swap(x , y);

    // // Product of a and b
    // int a = 5;
    // int b = 3;
    // int prod = multiply(a , b);
    // System.out.println("Product of a and b is : " + prod);

    // // factorial of n
    // int facto = factorial(5);
    // System.out.println("Factorial of n is : " + facto);

    // // Calculate Binomial coefficient
    // int ans = Bincoeff(5, 2);
    // System.out.println("Binomial coefficient is : " + ans);

    // // Function overloading using parameter
    // // System.out.println(sum(5 , 3));
    // // System.out.println(sum(5,2,1));

    // // Function overloading Data Type
    // System.out.println(sum(5 , 3));
    // System.out.println(sum(4.8f , 3.2f));

    System.out.println(isPrime(15));


  }
}
