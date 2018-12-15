import java.util.*;
public class Matrix
{
    int Mat[][]=new int[6][6];
    int m, n;
    Matrix(int mm, int nn)
    {
        m=mm;
        n=nn;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                Mat[i][j]=0;
            }
        }
    }
    void getmat()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all elements of matrix.");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                Mat[i][j]=sc.nextInt();
            }
        }
    }
    void dispmat()
    {
        System.out.println("\fYour matrix is:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    void changemat()
    {
        for(int cnt=0; cnt<n; cnt++)
        {
            Mat[cnt][0]=Mat[cnt][0]+Mat[cnt][m-1];
            Mat[cnt][m-1]=Mat[cnt][0]-Mat[cnt][m-1];
            Mat[cnt][0]=Mat[cnt][0]-Mat[cnt][m-1];
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter size of rows and columns.");
        int mm1=sc.nextInt();
        int nn1=sc.nextInt();
        Matrix obj=new Matrix(mm1, nn1);
        obj.getmat();
        obj.dispmat();
        System.out.println("Press y to swap.");
        char c=sc.next().charAt(0);
        obj.changemat();
        obj.dispmat();
    }
}