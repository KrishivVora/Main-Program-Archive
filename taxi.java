import java.util.*;
public class taxi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the taxi number and then the number of kilometers travelled.");
        String T=sc.nextLine();
        int n=sc.nextInt();
        int cost=0;
        if(n<=10)
        {
            cost=n*30;
        }
        else if(n>10 && n<=30)
        {
            cost=(10*30)+((n-10)*20);
        }
        else if(n>30 && n<=70)
        {
            cost=(10*30)+(20*20)+((n-30)*15);
        }
        else if(n>70)
        {
            cost=(10*30)+(20*20)+(40*15)+((n-70)*12);
        }
        System.out.println("Taxi number: "+T);
        System.out.println("Taxi fare  : "+cost);
    }
}