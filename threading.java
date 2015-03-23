/**
 * Created by mohammedfadin on 3/20/15.
 */
import java.util.*;

// approach #1
 class threading extends Thread
{
    public void callUS()
    {
        System.out.println("Hello " + getClass());
    }
}

// approach #2
class threading2 implements Runnable
{
    @Override
    public void run()
    {

    }
}

class resurrection implements Runnable
{
    int time;
    String human;
    Random order  = new Random();

    public resurrection(String human)
    {
        this.human = human;
        this.time = order.nextInt(999); // randomly generate
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println(human + " I'll sleep for " + time );
            Thread.sleep(time);
            System.out.println(human + " Woke up after " + time);
        }
        catch(Exception err)
        {
            System.out.println("Lord, your work failed, we couldnt resurect him");
        }
    }
}