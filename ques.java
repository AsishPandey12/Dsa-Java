import java.util.*;

public class ques {
 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    //Q 1
    // System.out.println("Enter thr Number of Pizzas");
    // int pizza = sc.nextInt();
    // System.out.println("Enter thr Number of Puffs");
    // int puffs = sc.nextInt();
    // System.out.println("Enter thr Number of Cold drinks");
    // int colddrinks = sc.nextInt();

    // int bill = ((100 * pizza) + (20 * puffs) + (10 * colddrinks) );
    // System.out.println("Total bill is : " + bill);

    // Q2
    System.out.println("Enter the salary");
    int salary = sc.nextInt();
    System.out.println("Enter the apprassel rating");
    float rating = sc.nextFloat();
    
    
    if(salary < 0 || rating <= 0 || rating > 5 ){
      System.out.println("Invalid input");
    }else if(rating >= 1 && rating <= 3){
      salary = salary + (int)(0.1 * salary);
      System.out.println("updated salary : " + salary);
    } else if(rating >= 3.1 && rating <= 4){
      salary = salary + (int)(0.25 * salary);
      System.out.println("updated salary : " + salary);
    } else if(rating >= 4.1 && rating <= 5){
      salary = salary + (int)(0.3 * salary);
      System.out.println("updated salary : " + salary);

    } 

    sc.close();
    




  }
}
