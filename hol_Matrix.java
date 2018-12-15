import java.util.*;
public class hol_Matrix //class name should be 'Matrix' in book
{
    int Mat[][];
    int m,n;
    hol_Matrix(int mm, int nn)
    {
        m = mm;
        n = nn;
        Mat = new int[m][n];
    }
    void getmat()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix, one by one.");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                Mat[i][j] = sc.nextInt();
            }
        }
    }
    void dispmat()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==(n-1) || Mat[i][j+1]>9)
                {
                    System.out.print(Mat[i][j]+" ");
                }
                else if (Mat[i][j+1]<10)
                {
                    System.out.print(Mat[i][j]+"  ");
                }
            }
            System.out.println();
        }
    }
    void changemat()
    {
        int temp[][] = new int[1][n];
        for(int p=0; p<n; p++)
        {
            temp[0][p] = Mat[0][p];
            Mat[0][p] = Mat[m-1][p];
            Mat[m-1][p] = temp[0][p];
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns of the matrix.");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        hol_Matrix obj = new hol_Matrix(m1,n1);
        obj.getmat();
        System.out.println("Original input:");
        obj.dispmat();
        obj.changemat();
        System.out.println("Output, with first and last row swapped:");
        obj.dispmat();
    }
}