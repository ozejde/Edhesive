import java.util.Scanner;
import java.lang.Math;

class Main { 
  public static void main(String[] args){

    Scanner scan = new Scanner (System.in);
    System.out.println ("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
    
    
    int[] array1 = new int[10000];
    int[] array2 = new int[10000];
    int input = 0; //input for arrays
    int count = 0; //count for element position
    
    //adds input into first array
    while (input >= 0) {
      input = scan.nextInt();
      array1[count] = input;
      count++;
    }
    count = 0;
    
    //adds input into second array
    System.out.println ("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
    input = 0;
    while (input >= 0) {
      input = scan.nextInt();
      array2[count] = input;
      count++;
    }
    //System.out.println(java.util.Arrays.toString(array1));
    //System.out.println(java.util.Arrays.toString(array2));
    
    //finds length of the input arrays
    int num1 = 0;
    while (array1[num1] >= 0 ){
      num1++;
    }
    int num2 = 0;
    while (array2[num2] >= 0) {
      num2++;
    }
    
    //checks if arrays are input in order
    for (int i = 0; i < num1 - 1; i++) {
      if (array1[i] > array1[i + 1])
        count = -15;
    }
    for (int i = 0; i < num2 - 1; i++) {
      if (array2[i] > array2[i + 1])
        count = -15;
    }
    
    //outputs first array
    System.out.println("First Array: ");
    for (int i = 0; i < num1; i++) {
      System.out.print(array1[i]+ " ");
    }
    System.out.println();
    System.out.println();
    
    //outputs second array
    System.out.println("Second Array: ");
    for (int i = 0; i < num2; i++) {
      System.out.print(array2[i]+ " ");
    }
    System.out.println();
    
    //outputs if array if no errors
    if (count == -15){
      System.out.println();
      System.out.println ("ERROR: Array not in correct order");
    }
    else {
      String answer = "";
      
      //checks for biggest number
      int biggest = 0;
      for (int i = 0; i < num1; i++) {
        if (array1[i] > biggest)
          biggest = array1[i];
      }
      for (int i = 0; i < num2; i++) {
        if (array2[i] > biggest)
          biggest = array2[i];
      }
      System.out.println ();
      
      
      //merges the arrays
      for (int i = 0; i <= biggest; i++) {
        for (int x = 0; x < num1; x++) {
          if (array1[x] == i)
            answer += i + " ";
      }
        for (int x = 0; x < num2; x++) {
          if (array2[x] == i)
            answer += i + " ";
      }
      }
     
      System.out.println ("Merged Array: "); 
      System.out.println (answer);
    }
    
  }
}