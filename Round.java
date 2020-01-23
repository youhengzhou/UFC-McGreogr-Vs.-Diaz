
/**
 * Write a description of class Round here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Round
{
    // instance variables - replace the example below with your own
    private int rountNum;
    Fighter f1;
    Fighter f2;
    
    /**
     * Constructor for objects of class Round
     */
    public Round(String name)
    {
        f1 = new Fighter(name);
        f2 = new Fighter("comp");
        
        //System.out.println("welcome to the world of UFC");
        //this.display();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public void display()
    {
        System.out.println("Fighter1 From the Red Corner:\n");
        System.out.println(f1.toString());
        System.out.println("Fighter2 From the Blue Corner:\n");
        System.out.println(f2.toString()+"\n");
        
    }
    public String displayString()
    {
        String s;
        s="Fighter1 From the Red Corner:\n";
        s+=f1.toString();
        s+="Fighter2 From the Blue Corner:\n";
        s+=f2.toString()+"\n";
        return s;
        
        
    }
    
}
