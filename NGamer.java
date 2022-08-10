
/**
 * Write a description of class NewGamer here.
 *
 * @author (31777597)
 * @version (a version number or a date)
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Format;


public class NGamer
{
   private String code;
   private String name;
   private String dateReg;
   private static int numNGamers = 0;
   
   public NGamer()
   {
       numNGamers++;
   }
    
    public NGamer(String name)
    {
        this.name = name;
        numNGamers++;
        compileCode();
        setDateReg();
    }
    
    public String getName()
    {
        return name;
    }
    public String getCode()
    {
        return code;
    }
    public String getDateReg()
    {
        return dateReg;
    }
    public static int getNumNGamers()
    {
        return numNGamers;
    }
    
    public void compileCode()
    {
        code = name.substring(0,1) + name.substring(name.length()-1).toUpperCase();
        
    }
    
    private void setDateReg()
    {
        Format dateFormat = new SimpleDateFormat("dd/MM/yyyy" );
        dateReg = dateFormat.format(new Date());
    }
    
    @Override 
    public String toString()
    {
        String str = String.format("%-10s%-10s%-10s",code, name, dateReg);
        return str;
    }
        
        
}
