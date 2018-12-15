import java.util.*;
public class numgen_sequencer
{
    public static void hack() throws InterruptedException
    {
        System.out.print("\f");
        String alpha="0123456789abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^&*()/\\;:";
        int N=alpha.length();
        Random r=new Random();
        for(;;)
        {
            for (int i=0;i<50;i++) 
            {
                System.out.print(alpha.charAt(r.nextInt(N)));
                Thread.sleep(1);
            }
            System.out.println();
            Thread.sleep(1);
        }
    }
}