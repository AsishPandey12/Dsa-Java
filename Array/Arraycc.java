package Array;
import java.util.*;

public class Arraycc {
  public static void update(int marks[] , int nonchangeable){
    nonchangeable = 10;
    for(int i = 0 ; i < marks.length ; i++){
      marks[i] = marks[i] + 1;
    }
  }
  public static void main(String args[]){

    // Input and output
    // int marks[] = new int[100];

    // Scanner sc = new Scanner(System.in);

    // marks[0] = sc.nextInt(); // phy
    // marks[1] = sc.nextInt(); // Chem
    // marks[2] = sc.nextInt(); // Math

    // System.out.println("Phy = " + marks[0]);
    // System.out.println("Chem = " + marks[1]);
    // System.out.println("Math = " + marks[2]);

    // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    // System.out.println("Percentage = " + percentage + "%");

    // Passing array as argument

    int marks[] = {97 , 98 , 99};
    int nonchangeable = 5;
    update(marks , nonchangeable);
    System.out.println(nonchangeable);

    // print
    for(int i = 0 ; i < marks.length ; i++){
      System.out.print(marks[i] +" ");
    }
    System.out.println();


  }
  
}
