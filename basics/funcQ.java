package basics;

public class funcQ {
  // Sum of a digit
  public static void sum(int n){
    int sum = 0;
    for(int i = 0; i <= n; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
  // method to test the number is even or odd
  public static boolean isEven(int n){
    if(n % 2 == 0){
      return true;
    } else {
      return false;
    }
  }


  // the average of three number
  public static int avgnum(int a , int b , int c){
    int avg = (a + b + c) / 3 ;
    return avg;
  }
  public static void main(String args[]){
    System.out.println(avgnum(10, 20, 30));
    System.out.println(isEven(15));
    sum(10);

  }
}
