
import java.util.Scanner;

class Main {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner (System.in);
      
      System.out.println ("What month were you born in? (number)");
      int month = scan.nextInt();
      System.out.println ("What day (number)");
      int day = scan.nextInt();
      
      String monthS = "";
      String dayS = "";
      String sign = "";
      
      if (month == 1)
        monthS = "January";
      else if (month == 2)
        monthS = "February"; 
      else if (month == 3)
        monthS = "March";
      else if (month == 4)
        monthS = "April";
      else if (month == 5)
        monthS = "May";
      else if (month == 6)
        monthS = "June";
      else if (month == 7)
        monthS = "July";
      else if (month == 8)
        monthS = "August";
      else if (month == 9)
        monthS = "September";
      else if (month == 10)
        monthS = "October";
      else if (month == 11)
        monthS = "November";
      else if (month == 12)
        monthS = "December";
      else 
        monthS = "error";
      
      if ((day < 21 && day > 0) || day == 30) {
        if (day == 1)
          dayS = "first";
        else if (day == 2)
          dayS = "second";
        else if (day == 3)
          dayS = "third";
        else if (day == 4)
          dayS = "fourth";
        else if (day == 5)
          dayS = "fifth";
        else if (day == 6)
          dayS = "sixth";
        else if (day == 7)
          dayS = "seventh";
        else if (day == 8)
          dayS = "eighth";
        else if (day == 9)
          dayS = "ninth";
        else if (day == 10)
          dayS = "tenth";
        else if (day == 11)
          dayS = "eleventh";
        else if (day == 12)
          dayS = "twelfth";
        else if (day == 13)
          dayS = "thirteenth";
        else if (day == 14)
          dayS = "fourteenth";
        else if (day == 15)
          dayS = "fifteenth";
        else if (day == 16)
          dayS = "sixteenth";
        else if (day == 17)
          dayS = "seventeenth";
        else if (day == 18)
          dayS = "eighteenth";
        else if (day == 19)
          dayS = "nineteenth";
        else if (day == 20)
          dayS = "twentieth";
        else if (day == 30)
          dayS = "thirtieth";
      
      }
      else if (day > 0 && day < 32) {
        int digit1 = day % 10; //checks for first, second, etc.
        int digit2 = ((day - digit1) / 10); //checks for twenty, thirty
        
        if (digit2 == 2)
          dayS = "twenty-";
        else if (digit2 == 3)
          dayS = "thirty-";
        else 
          dayS = "error";
        
        if (digit1 == 1)
          dayS += "first";
        else if (digit1 == 2)
          dayS += "second";
        else if (digit1 == 3)
          dayS += "third";
        else if (digit1 == 4)
          dayS += "fourth";
        else if (digit1 == 5)
          dayS += "fifth";
        else if (digit1 == 6)
          dayS += "sixth";
        else if (digit1 == 7)
          dayS += "seventh";
        else if (digit1 == 8)
          dayS += "eighth";
        else if (digit1 == 9)
          dayS += "ninth";
        else 
          dayS = "error";
      }
      else 
        dayS = "error";
      
      if (dayS == "error" || monthS == "error")
        System.out.println ("error");
      else {
        System.out.println("Your birthday is: " + monthS + " " + dayS);
        
        if ((month == 3 && day >= 21)|| (month == 4 && day <= 19))
          sign = "Aries";
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
          sign = "Taurus";
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
          sign = "Gemini";
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
          sign = "Cancer";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
          sign = "Leo";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
          sign = "Virgo";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
          sign = "Libra";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
          sign = "Scorpio";
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
          sign = "Sagittarius";
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
          sign = "Capricorn";
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
          sign = "Aquarius";
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20))
          sign = "Pisces";
          }
      
      System.out.println (sign);
        
      
    }
}
