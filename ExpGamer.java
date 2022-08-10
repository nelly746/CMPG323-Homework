
/**
 * Write a description of class ExpGamer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class ExpGamer
{
   private String code;
   private String name;
   private int rating;
   private static int numEGamers = 0;
   
   public ExpGamer()
   {
        numEGamers++;
   }
    
    public ExpGamer(String name)
    {
        compileCode();
        this.name = name;
        numEGamers++;
        setRating();
        
        
    }
    
    public String getName()
    {
        return name;
    }
    public String getCode()
    {
        return code;
    }
    public int getRating()
    {
        return rating;
    }
    public static int getNumEGamers()
    {
        return numEGamers;
    }
    
    public void compileCode()
    {
        code = name.substring(0,1) + name.substring(name.length()-1).toUpperCase() + rating;
        
    }
    
    private void setRating()
    {
        Random random =new Random();
        rating = random.nextInt(101);
    }
    
    @Override 
    public String toString()
    {
        String str = String.format("%-10s%-10s%-10s",code, name, rating);
        return str;
    }
        
        
}
