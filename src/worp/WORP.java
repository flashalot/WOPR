package worp;
import java.util.Scanner;

/**
 *
 * @author Zerocool
 */
public class WORP {
 public static Scanner keys = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        termstart();
        }
    public static void termstart(){
        System.out.println("War Operation Plan Response (WOPR) has initialized.\\r\\nRunning on port:8080");
        System.out.println("LOGIN..");
        System.out.println("What is Your Name?");
        Scanner keys = new Scanner(System.in);
        String login;
        login = keys.next();        
        System.out.println("Greetings " + login); 
        System.out.println("HOW ARE YOU FEELING?"); 
        int choice = keys.nextInt();
        if (choice==1)
         {
         good();
         }
        else
         {
          sad();
          }    
    }
    public static void good(){        
      System.out.println("Im Fine How Are you?");letmesleep();
       System.out.println("EXCELLENT. IT'S BEEN A LONG TIME ");letmesleep();
      System.out.println("Shall We Play A Game? ");
        int choice = keys.nextInt();
        if (choice==1)
         {
         game();
         }
        else
         {
          end();
          }    
    }
    public static void sad(){
      System.out.println("Not So Go How About you?");
      System.out.println("EXCELLENT. IT'S BEEN A LONG TIME ");letmesleep();
      System.out.println("Shall We Play A Game? ");
        int choice = keys.nextInt();
        if (choice==1)
         {
         game();
         }
        else
         {
          end();
          }    
      
    }
    
    public static void game(){
       System.out.println("LOVE TO. HOW ABOUT GLOBAL THERMONUCLEAR WAR");
       
        System.out.println("WOULDN'T YOU PREFER A GOOD GAME OF CHESS?");
              //TODO System.out.println("LATER. LET'S PLAY GLOBAL THERMONUCLEAR WAR"); This Is The Answer
        int choice = keys.nextInt();
        if (choice==1)
         {
         letsplaywar();
         }
        else
         {
          end();
          }   
    }
    
     public static void letsplaywar(){
         System.out.println("LATER. LET'S PLAY GLOBAL THERMONUCLEAR WAR");
    
    }
    public static void letmesleep(){
    try {
        Thread.sleep(3000L);    // one second
        }
        catch (Exception e) {}     // this never happen... nobody check for it
    }

            
    public static void end(){
    System.out.println("Thanks For Playing ");
        letmesleep();
    System.out.println("Made By Jalen Battle-Bryant ");
        letmesleep();
    System.out.println("Based Of The 80's Classic WarGames's WOPR ");
        letmesleep();
    System.out.println("-CONNECTION TERMINATED--");

    }
}
    