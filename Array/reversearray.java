package Array;

public class reversearray {
  public static void reverse_array(int numbers[]){
    int start = 0 , last = numbers.length-1;

    while(start < last){
      // Swap

      int temp = numbers[last];
      numbers[last] = numbers[start];
      numbers[start] = temp;
      
      start++;
      last--;
    }

  }
  public static void main(String args[]){
    int numbers[] = {2 , 4 , 6 , 8 , 10};

    reverse_array(numbers);
    for(int i = 0 ; i < numbers.length ; i++){
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
  }
}
