package basics;

public class pattern2 {
  // Print Hollow rectangle pattern
  public static void hollow_rectangle(int totRows , int totcols){
    // outer loop
    for(int i = 1 ; i <= totRows ; i++){
      // inner - column
      for(int j = 1 ; j <= totcols ; j++){
        // cell - (i,j)
        if(i == 1 || i == totRows || j == 1 || j == totcols){
          // boundary cells
          System.out.print("*");
        } else{
          System.out.print(" ");

        }
      }
      System.out.println();
    }
  }

  // print Inverted & Rotated Half pyramid
  public static void Rotatedhalf_pyramid(int n){
    // Outer loop
    for(int i = 1; i <= n; i++){
      // Spaces
      for(int j = 1 ; j <= n - i ; j++){
        System.out.print(" ");
      }
      // Stars
      for(int j = 1 ; j <= i ; j++){
        System.out.print("*");
      }
      System.out.println();
    } 
  }

  // Print Inverted half Pyramid with Numbers
  public static void invertedhalf_pyramid_withnumbers(int n){
    // outer
    for(int i = 1; i <= n ; i++){
      // inner - number
      for(int num = 1; num <= (n-i+1) ; num++){
        System.out.print(num+" ");
      }
      System.out.println();
    }
  }

  // Print Floyd's triangle
  public static void floyds_triangle(int n){
    int counter = 1;
    // outer
    for(int i = 1; i <= n ; i++){
      // inner loop - how many time will counter be printed
      for(int j = 1; j<=i ; j++){
        System.out.print(counter+" ");
        counter++;
      }
      System.out.println();
    }
  }

  // Print 0-1 triangle
  public static void zero_one_triangle(int n){
    for(int i = 1; i <= n ; i++){
      for(int j = 1; j <= i ; j++){
        if((i+j) % 2 == 0){
          System.out.print("1"+ " ");
        } else{
          System.out.print("0"+ " ");
        }
      }
      System.out.println();
    }
  }

  // Print ButterFly Pattern
  public static void ButterFly_pattern(int n){
    // 1st half
    for(int i = 1; i <= n; i++){
      // Stars - i
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      // Spaces - 2*(n-i)
      for(int j = 1; j <= 2 * (n-i); j++){
        System.out.print(" ");
      }
      // Stars - i
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    // 2nd half
    for(int i = n; i >= 1; i--){
      // Stars - i
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      // Spaces - 2*(n-i)
      for(int j = 1; j <= 2*(n-i); j++){
        System.out.print(" ");
      }
      // Stars - i
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }

  // Print Solid Rhombus pattern
  public static void Solid_Rhombus(int n){
    for(int i = 1; i <= n; i++){
      // Spaces 
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }
      // Stars
      for(int j = 1; j <= n; j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void hollow_rhombus(int n){
    for(int i = 1; i <= n ; i++){
      // spaces
      for(int j = 1; j <= (n-i) ; j++){
        System.out.print(" ");
      }

      // hollow rectangle - stars
      for(int j = 1; j <= n; j++){
        // Boundary condition
        if(i == 1 || i == n || j == 1 || j == n){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  // Print Diamond Star Pattern
  public static void diamond_pattern(int n){
    // 1st half
    for(int i = 1; i <= n; i++){
      // Spaces
      for(int j = 1; j <= (n - i) ; j++){
        System.out.print(" ");
      }
      // Stars
      for(int j = 1; j <= (2*i)-1; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
    // 2nd half
    for(int i= n; i >= 1; i--){
      // Spaces
      for(int j = 1; j <= (n - i) ; j++){
        System.out.print(" ");
      }
      // Stars
      for(int j = 1; j <= (2*i)-1; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Print Number_Pyramid
  public static void Number_Pyramid(int n){
    for(int i = 1; i <= n; i++){
      // Spaces - (n - i)
      for(int j = 1; j <= (n - i) ; j++){
        System.out.print(" ");
      }

      // Numbers - i

      for(int j = 1; j <= i ; j++){
        System.out.print(i+ " ");
      }
      System.out.println();
    }
  }

  // Print palindromic pattern with Numbers
  public static void palindromic_pattern(int n){
    for(int i = 1; i <= n ; i++){
      // Spaces
      for(int j = 1; j <= (n - i) ; j++){
        System.out.print(" ");
      } 
      // descending number
      for(int j = i; j >= 1; j--){
        System.out.print(j);
      }
      // Ascending number
      for(int j = 2 ; j <= i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String args[]){
    // hollow_rectangle(4, 5);
    // Rotatedhalf_pyramid(4);
    // invertedhalf_pyramid_withnumbers(5);
    // floyds_triangle(5);
    // zero_one_triangle(5);
    // ButterFly_pattern(4);
    // Solid_Rhombus(5);
    // hollow_rhombus(5);
    // diamond_pattern(4);
    // Number_Pyramid(5);
    palindromic_pattern(5);
  }
}
