import java.util.Scanner;

class Main {
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first String: ");
    String first = scan.nextLine();
    System.out.println("Enter the replacement String: ");
    String rep = scan.nextLine();
    
    //tests for incorrect characters
    int count = 0;
    for (int i = 0; i < first.length(); i++){
      char piece = first.charAt(i);
      if (piece == '*')
        count++;
      else if (!(Character.isLetter(piece) || piece == '\t' || piece == ' '))
        count++;
    }
    
    //Finds location of the first *
    int stop = -1;
    for (int i = 0; i < first.length(); i++){
      if (first.charAt(i) == '*')
        stop = i;
    }
    
   
    
    //makes sure that there's no errors
    if (stop == -1)
      System.out.println ("Error: no *");
    else if (count>1)
      System.out.println ("Error: Incorrect characters");
    else {
      String front = first.substring(0,stop);
      String back = first.substring(stop+1, first.length());
      System.out.println(front + rep + back); 
    }
     
  }
}