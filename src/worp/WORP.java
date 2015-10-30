package worp;
import java.util.Scanner;

/**
 *
 * @author Zerocool
 */
//public class WORP { // This Is the file name on our pc at home
public class WORP {
 public static Scanner keys = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        termstart();
        }
    public static void termstart(){
        final String user = System.getProperty("user.name");
        System.out.println("War Operation Plan Response (WOPR) has initialized Running on port:8080");
        letmesleep();
        System.out.println("GETTING USERNAME INFO..");
        letmesleep();
        System.out.println("Greetings " + user); 
        System.out.println("HOW ARE YOU FEELING?"); 
        System.out.println("Press (1) Good Or (2) Bad ?");
        int choice = keys.nextInt();
        if (choice==1)
         {
         good();
         }
        if (choice == 2) 
         {
             sad(); 
         }
        else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         termstart();

          }    
    }
    public static void good(){        
      System.out.println("Im Fine How Are you?");
      letmesleep();
      System.out.println("EXCELLENT. IT'S BEEN A LONG TIME ");
      letmesleep();
      System.out.println("Shall We Play A Game? ");
      System.out.println("Press (1) Yes Or (2) No?");

        int choice = keys.nextInt();
        if (choice==1)
         {
         game();
         }
        if (choice == 2) 
         {
             end(); 
         }
        else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         good();
          }    
    }
    public static void sad(){
      System.out.println("Not So Good How About you?");
      letmesleep();
      System.out.println("EXCELLENT. IT'S BEEN A LONG TIME ");
      letmesleep();
      System.out.println("Shall We Play A Game? ");
      System.out.println("Press (1) Yes Or (2) No?");
        int choice = keys.nextInt();
        if (choice==1)
         {
         game();
         }
        if (choice == 2) 
         {
             end(); 
         }
        else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         sad();
          }    
      
    }
    
    public static void game(){
       System.out.println("LOVE TO. HOW ABOUT GLOBAL THERMONUCLEAR WAR");
         letmesleep();
        System.out.println("WOULDN'T YOU PREFER A GOOD GAME OF CHESS?");
        letmesleep();
        System.out.println("Press (1) No Lets Play War Or (2) Never Mind I Dont Want To play anything");
              //TODO System.out.println("LATER. LET'S PLAY GLOBAL THERMONUCLEAR WAR"); This Is The Answer
        int choice = keys.nextInt();
        if (choice==1)
         {
         letsplaywar();
         }
        if (choice == 2) 
         {
             end(); 
         }
        else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         game();
          }   
    }
    
     public static void letsplaywar(){
         System.out.println("WAR");
         System.out.println("A Strage Based Game");
         System.out.println("The Only Way To Win Is Not To Play");
         letmesleep();
         System.out.println("Who Would You Attack First?");
         System.out.println("Press (1) China Or (2) Russia ");
         int choice = keys.nextInt();
         if (choice == 1)
         {
             china();
         }
         if (choice == 2)
         {
             russia();
         }
         else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         letsplaywar();
         }
    }
     
     public static void china() 
        {
        System.out.println("Missile Are Warming Up");
        letmesleep();
        System.out.println("Who Will We Attack Next...");
        System.out.println("Press (1) North Korea Or (2) Never Mind Im done Playing");
        int choice = keys.nextInt();
          if (choice == 1) 
         {
             nk(); //nk = North Korea
         }
          if (choice == 2) 
         {
             end(); 
         }
         else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         china();
         }


        }
     public static void russia() 
        {
         System.out.println("Missile Are Warming Up");
         letmesleep();
         System.out.println("Who Will We Attack Next...");
        System.out.println("Press (1) Germany Or (2) Never Mind Im done Playing");
         int choice = keys.nextInt();
          if (choice == 1) 
         {
             germany(); 
         }
          if (choice == 2) 
         {
             end(); 
         }
         else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         russia();
         }
        }
    public static void nk() 
        {
         System.out.println("Missile Are Warming Up");
         letmesleep();
         System.out.println("Woudl You Like To Keep Going?...");
        System.out.println("Press (1) Yes Lets Keep Going Or (2) Never Mind Im done Playing");
         int choice = keys.nextInt();
          if (choice == 1) 
         {
             ww3(); 
         }
          if (choice == 2) 
         {
             end(); 
         }
         else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         nk();
         }
        }
    public static void germany() 
    {
        System.out.println("Missile Are Warming Up");
         letmesleep();
         System.out.println("Woudl You Like To Keep Going?...");
        System.out.println("Press (1) Yes Lets Keep Going Or (2) Never Mind Im done Playing");
         int choice = keys.nextInt();
          if (choice == 1) 
         {
             ww3(); 
         }
          if (choice == 2) 
         {
             end(); 
         }
         else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         germany();
         }
    }
    public static void ww3() 
    {       
       System.out.println("Are Missile Are Warmed Up");
         letmesleep();
       System.out.println("Last Chance To Back out");
        System.out.println("Type Yes Or No?");
        String lastchance;
        lastchance = keys.next(); 
        if (lastchance.equals ("Yes")) 
        {
             fallout4confirmed(); 
         }
        if (lastchance.equals("No")) 
         {
             end(); 
         }
         else
         {
         System.out.println("WRONG IMPUT");
         System.out.println("We Are Going To ReRun This");
         letmesleep();
         System.out.println("The Text is cap sensitive so keep this in mind");
         letmesleep();
         ww3();
         }
    }
    public static void fallout4confirmed(){
        final String user = System.getProperty("user.name");
        System.out.println("War World 3  Has Begun Because Of You ");
        letmesleep();
        System.out.println("They are Now aiming there Missiles at you");
        letmesleep();
        System.out.println("Good Bye " + user);
        System.out.println("fallout 4 confirmed :p");
        letmesleep();
        end();
    }

     
    public static void letmesleep(){
    try {
        Thread.sleep(3000L);
        }
        catch (Exception e) {}
    }

            
    public static void end(){
    System.out.println("Thanks For Playing ");
        letmesleep();
    System.out.println("Made By Jalen Battle-Bryant ");
        letmesleep();
    System.out.println("Based Of The 80's Classic WarGames's WOPR ");
        letmesleep();     
    System.out.println("--CONNECTION TERMINATED--");
    letmesleep();
    System.exit(0);

    }
}

