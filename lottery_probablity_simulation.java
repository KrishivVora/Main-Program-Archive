import java.util.concurrent.*;
public class lottery_probablity_simulation //8.01% for at least 3 prizes
{
    public static void main(String args[])
    {
        double answer=0;
        int n=0;
        int prize=0;
        double atlo=0;
        for(int i=1; i<=100000; i++) //ten million simulations of the problem
        {
            prize=0;
            for(int cnt=1; cnt<=1000; cnt++) //1000 lotteries
            {
                n=ThreadLocalRandom.current().nextInt(1, 1001); //1000 tickets, one winning ticket
                if (n==500)
                {
                    prize=prize+1; //prize if ticket is picked
                }
            }
            if(prize>=3)
            {
                atlo=atlo+1; //at least three prizes are won
            }
        }
        answer=(atlo/10000000.00)*100;
        System.out.println("Probability of winning AT LEAST THREE prizes is: "+answer+"%");
    }
}
    