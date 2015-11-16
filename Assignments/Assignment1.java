
import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Please enter your test grades.");
        
        System.out.println ("Test 1: ");
        int test1 = scan.nextInt();
        System.out.println ("Test 2: ");
        int test2 = scan.nextInt();  
        System.out.println();
        
        System.out.println("Please enter your quiz grades.");
        System.out.println ("Quiz 1: ");
        int quiz1 = scan.nextInt();
        System.out.println ("Quiz 2: ");
        int quiz2 = scan.nextInt();
        System.out.println ("Quiz 3: ");
        int quiz3 = scan.nextInt();
        System.out.println();
        
        System.out.println("Please enter your homework average.");
        System.out.println("Homework: ");
        double homework = scan.nextDouble();
        System.out.println();
        
        double testa = (1.0 * test1 + test2)/2;
        double quiza = (1.0 * quiz1 + quiz2 + quiz3)/3;
        System.out.println ("Test Average: " + testa);
        System.out.println ("Quiz Average: " + quiza);
        System.out.println ("Final Grade: " + ((.5*testa)+ (.3*quiza) + (.2*homework)));

    }
}