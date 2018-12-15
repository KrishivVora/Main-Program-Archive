import java.util.*;
public class array_2d_boundary_printer
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
        System.out.println("\fThe boundary of the array is:");
        for(int cnt=0; cnt<N; cnt++) //prints first row
        {
            System.out.print(A[0][cnt]+"  ");
            if(A[0][cnt]<10)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=1; i<M-1; i++) //prints first and last columns of every row except first and last
        {
            System.out.print(A[i][0]);
            if(A[i][0]>10)
            {
                System.out.print("  ");
            }
            else
            {
                System.out.print("   ");
            }
            for(int cnt=0; cnt<N-1; cnt++)
            {
                System.out.print("   ");
            }
            System.out.println(A[i][N-1]);
        }
        for(int cnt=0; cnt<N; cnt++) //prints last row
        {
            System.out.print(A[M-1][cnt]+"  ");
            if(A[M-1][cnt]<10)
            {
                System.out.print(" ");
            }
        }
    }
}