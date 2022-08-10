
/**
 * Write a description of class testPlayers here.
 *
 * @author (Classwork)
 * @version (9 March 2020)
 */
import java.util.Scanner;
public class testGamers
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      
       NGamer [] arrNGamers = new NGamer[10];
       ExpGamer [] arrEGamers = new ExpGamer[10];
       int countN = 0;
       int countE = 0;
       System.out.println("Enter type of gamers (N or E) X to quit: " );
       char Gamer = input.nextLine().charAt(0);
       Gamer = Character.toUpperCase(Gamer);
       while (Gamer != 'X')
       {
           System.out.println("Enter the name of the gamer: " );
           String name = input.nextLine();
           if (Gamer == 'N')
           {
              arrNGamers[countN] = new NGamer(name);
              countN++;
            }
            else
            {
                 arrEGamers[countE] = new ExpGamer(name);
                 countE++;
            }
             System.out.println("Enter type of gamers (N or E) X to quit: " );
             Gamer = Character.toUpperCase(input.nextLine().charAt(0));
       }
               
                
      System.out.println("\nList of new gamers");
      displayNGamers(arrNGamers);
      
      System.out.println("\nList of experienced gamers");
      displayEGamers(arrEGamers);
     
      
   }
   
   public static void displayNGamers(NGamer [] arrNGamers)
   {
       System.out.printf( "%-14s%-15s%-15s\n","    Code", "Name", "Date Registered");
       for (int k = 0; k < NGamer.getNumNGamers(); k++)
       {
          System.out.printf( "%-4d%-30s\n", (k + 1), arrNGamers[k].toString());
       }
    }
   public static void displayEGamers(ExpGamer [] arrEGamers)
   {
       System.out.printf("%-14s%-15s%-15s\n","    Code", "Name", "Rating");
       for (int k = 0; k < ExpGamer.getNumEGamers(); k++)
       {
          System.out.printf( "%-4d%-30s\n", (k + 1), arrEGamers[k].toString());
       }
    }
}
