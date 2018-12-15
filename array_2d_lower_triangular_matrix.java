import java.util.*;
public class array_2d_lower_triangular_matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter dimensions of array. (rows and columns are same) (size between 2 and 20)");
        int N=sc.nextInt();
        int A[][]=new int[N][N];
        System.out.println("Enter elements of array matrix, row by row.");
        for(int i=0; i<N; i++) //2d array input
        {
            for(int j=0; j<N; j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int checker=0;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                if(A[i][j]!=0 && j>i)
                checker++;
            }
        }
        if(checker==0)
        System.out.println("Matrix is a Lower Triangular Matrix.");
        else
        System.out.println("Matrix is not a Lower Triangular Matrix.");
    }
}