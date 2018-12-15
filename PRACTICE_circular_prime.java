import java.util.*;
public class PRACTICE_circular_prime
{
    int N;
    PRACTICE_circular_prime() //default constructor
    {
        N=0;
    }
    int prime(int m) //checks if input is prime
    {
        for(int cnt=2; cnt<m; cnt++)
        {
            if(m%cnt==0)
            {
                return 0; //not prime
            }
        }
        return 1; //prime
    }
    void cycle(int h) //cycles the input N by shifting it's first digit to the last position
    {
        String S=""+N;
        String S1=S.substring(0,1);
        String S2=S.substring(1, S.length());
        S=S2+S1;
        N=Integer.parseInt(S);
    }
    void checker() //checks if the number is a cyclic prime by testing each cycle for being prime
    {
        int o=0;
        String S=""+N;
        for(int cnt=0; cnt<S.length(); cnt++)
        {
            System.out.println(N);
            cycle(N);
        }
        for(int cnt=0; cnt<=S.length(); cnt++)
        {
            cycle(N);
            o=prime(N);
            if(o==0)
            break;
        }
        if(o==0)
        System.out.println("The number is NOT a cyclic prime number.");
        else if(o==1)
        System.out.println("The number IS a cyclic prime number.");
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number to be checked for being a cyclic prime.");
        N=sc.nextInt();
    }
    public void main()
    {
        PRACTICE_circular_prime obj=new PRACTICE_circular_prime();
        obj.input();
        obj.checker();
    }
}