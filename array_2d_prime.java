import java.util.*;
public class array_2d_prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter dimensions of array, first rows then columns. (size between 2 and 20)");
        int M=sc.nextInt();
        int N=sc.nextInt();
        int O=M*N;
        int B[]=new int[O];
        int cnt=2;
        int checker=0;
        int x=0;
        do
        {
            for(int k=cnt-1; k>1; k--)
            {
                if(cnt%k==0)
                checker++;
            }
            if(checker==0)
            {
                B[x]=cnt;
                x++;
            }
            cnt++;
            checker=0;
        }
        while(x<O);
        int A[][]=new int[M][N];
        cnt=0;
        System.out.println("The 2d array of primes is:");
        for(int i=0; i<M; i++) //1d array transferred back to 2d array and PRINTS
        {
            for(int j=0; j<N; j++, cnt++)
            {
                A[i][j]=B[cnt];
                System.out.print(A[i][j]+" ");
                if(A[i][j]<10)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}