import java.util.Scanner;
import java.lang.Math; 

class Main{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int hash = 0;
    int attr = 0;
    int link = 0;
    
    System.out.println ("Please enter a tweet:");
    String tweet = scan.nextLine();
    int leng = tweet.length();
    tweet = tweet.toLowerCase();
    
    int indexl = tweet.indexOf("http://");
    if ((indexl != -1) && (tweet.length()-1 > indexl && tweet.charAt(indexl +1) != ' '))
      link = 1;

    if (leng > 140) {
      System.out.println ("Excess Characters: " + (leng - 140));
    } 
    else {
      System.out.println ("Length Correct");
      
      for (int pos = 0; pos < tweet.length(); pos++){
        if (tweet.charAt(pos) == '@'){
          if ((pos + 1 < tweet.length()) && (tweet.charAt(pos + 1)!= ' ' ) && (tweet.charAt(pos + 1)) != '\t'){
            attr++;
          } 
        }
        if (tweet.charAt(pos) == '#'){
          if ((pos + 1 < tweet.length()) && (tweet.charAt(pos + 1)!= ' ' ) && (tweet.charAt(pos + 1)) != '\t'){
            hash++;
          } 
        }
        
          }
     while (indexl < tweet.indexOf("http://", indexl + 1)){
        if (tweet.length()-1 > indexl && tweet.charAt(indexl +1) != ' ')
          link++;
        indexl = tweet.indexOf("http://", indexl + 1);
     }   
      }
      System.out.println ("Number of Hashtags: " + hash);
      System.out.println ("Number of Attributions: " + attr);
      System.out.println ("Number of Links: " + link);
      }
      
      
}

 