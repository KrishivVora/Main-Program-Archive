import java.util.*;
public class array_2d_magic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the size of your NxN matrix.");
        int N=sc.nextInt();
        int A[][]=new int[N][N];
        int M=N*(((N*N)+1)/2); //calculates magic number
        System.out.println("Enter the elements of the NxN matrix,  row by row. (N must be between 2 and 20)");
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int b=0, c=0, d=0, e=0; //variables to store: sum of one row, one column, diagonals; sums of rows, sums of columns
        int x[]=new int[N];
        int y[]=new int[N];
        for(int i=0; i<N; i++) //
        {
            b=0; //resets the value of b for a new row
            c=0; //resets the value of b for a new column
            d=d+A[i][i];   //sum of left diagonal
            e=e+A[N-1-i][i]; //sum of right diagonal
            for(int j=0; j<N; j++)
            {
                b=b+A[i][j]; //sum of the i'th row 
                c=c+A[j][i]; //sum of the i'th column
            }
            x[i]=b; //stores sum of i'th row in x array
            y[i]=c; //stores sum of i'th column in y array
        }
        //d ,e and each element in x[i], y[i] must be equal to the magic constant M. then square is a magic square
        int flag=0; //if flag>0, square is not magic
        if(d!=M || e!=M) //checks diagonals
        {
            flag++;
        }
        for(int i=0; i<N; i++)
        {
            if(x[i]!=M || y[i]!=M) //checks each element of x along with corresponding element of y
            {
                flag++;
            }
        }
        if(flag==0)
        {
            System.out.println("The entered square IS a magic square.");
        }
        else
        {
            System.out.println("The entered square is NOT a magic square.");
        }
    }
}