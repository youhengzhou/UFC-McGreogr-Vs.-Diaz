import java.util.*;
/**
 * Write a description of class Fighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fighter
{
    // instance variables - replace the example below with your own
    private int speed;
    private int strike;
    private int health;
    private int roundSpeed;
    private int roundStrike;
    
    private String name;
    
    private Random ran;

    /**
     * Constructor for objects of class Fighter
     */
    public Fighter(String name)
    {
        this.name = name;
        ran = new Random();
        speed = ran.nextInt(10)+7;
        strike = ran.nextInt(10)+15;
        health = 80+ran.nextInt(20);
        this.generateRoundVar();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */ 
    public int getspeed()
    {
        return speed;
    }
    
    public int getStrik()
    {
        return strike;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public String toString()
    {
        String s ;
        s = "Fighter: "+name+ " \nhealth: " + health+"\n";
        return s;
    }
    
    public void generateRoundVar()
    {
        roundSpeed = ran.nextInt(speed)+1;
        roundStrike = ran.nextInt(strike)+1;
        
    }
     public int getRoundspeed()
    {
        return roundSpeed;
    }
    
    public void getDamage(int dama)
    {
        health = health - dama;
    }
    
    public int getRoundstrik()
    {
        return roundStrike;
    }
    
}
