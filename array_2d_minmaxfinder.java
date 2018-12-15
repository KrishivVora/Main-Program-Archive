import java.util.*;
public class array_2d_minmaxfinder
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
        System.out.println("\fYour entered array is:");
        for(int i=0; i<M; i++) //prints original 2d array
        {
            for(int j=0; j<N; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int min=A[0][0];
        int max=A[0][0];
        int loc1=0, loc2=0, loc3=0, loc4=0;
        for(int i=0; i<M; i++) //finds min and max along with position in original 2d array and prints
        {
            for(int j=0; j<N; j++)
            {
                if(A[i][j]<min)
                {   min=A[i][j];
                    loc1=i+1;
                    loc2=j+1;
                }
                if(A[i][j]>max)
                {
                    max=A[i][j];
                    loc3=i+1;
                    loc4=j+1;
                }
            }
        }
        System.out.println("Minimum value in the array is: "+min);
        System.out.println("It is in Row "+loc1+" and Column "+loc2);
        System.out.println("Maximum value in the array is: "+max);
        System.out.println("It is in Row "+loc3+" and Column "+loc4);
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