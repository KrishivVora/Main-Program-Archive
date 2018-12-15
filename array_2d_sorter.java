import java.util.*;
public class array_2d_sorter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter dimensions of array, first rows then columns. (size between 2 and 20)");
        int M=sc.nextInt();
        int N=sc.nextInt();
        int A[][]=new int[M][N];
        System.out.println("Enter elements of array matrix, row by row.");
        for(int i=0; i<M; i++) //2d array input
        {
            for(int j=0; j<N; j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int O=M*N;
        int B[]=new int[O];
        int cnt=0;
        for(int i=0; i<M; i++) //2d array transfer to 1d array
        {
            for(int j=0; j<N; j++, cnt++)
            {
                B[cnt]=A[i][j];
            }
        }
        int pos1, pos2, temp;
        for(int a=O; a>=0; a--) //1d array sorted
        {
            for(int j=1; j<a; j++)
            {
                pos1=B[j];
                pos2=B[j-1];
                if(pos1<pos2)
                {
                    temp=B[j];
                    B[j]=B[j-1];
                    B[j-1]=temp;
                }
            }
        }
        cnt=0;
        System.out.println();
        System.out.println("The sorted array is:");
        for(int i=0; i<M; i++) //1d array transferred back to 2d array and PRINTS
        {
            for(int j=0; j<N; j++, cnt++)
            {
                A[i][j]=B[cnt];
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}