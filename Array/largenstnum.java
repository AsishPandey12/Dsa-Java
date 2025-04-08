package Array;
import java.util.*;

public class largenstnum {
  public static int getlargest(int numbers[]){
    int largest = Integer.MIN_VALUE; // -Infinity
    int smallest  = Integer.MAX_VALUE; // +Infinity

    for(int i = 0 ; i < numbers.length ; i++){
      if(largest < numbers[i]){
        largest = numbers[i];
      }
      if(smallest > numbers[i]){
        smallest = numbers[i];
      }
    }
    System.out.println("smallest value is : " + smallest);
    return largest;
  }
  public static void main(String args[]){
    int number[] = {1, 2 , 6 , 3 , 5};

    System.out.println("largest value is : "+ getlargest(number));
  }
  
}
