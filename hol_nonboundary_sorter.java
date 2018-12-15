import java.util.*;
public class hol_nonboundary_sorter
{
    int A[][];
    int M;
    hol_nonboundary_sorter(int mm)
    {
        M = mm;
        A = new int[M][M];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array matrix, row by row.");
        for(int i=0; i<M; i++) //2d array input
        {
            for(int j=0; j<M; j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
    }
    void sort()
    {
        int O=(M-2)*(M-2);
        int B[]=new int[O];
        int cnt=0;
        for(int i=1; i<(M-1); i++) //2d array transfer to 1d array
        {
            for(int j=1; j<(M-1); j++, cnt++)
            {
                B[cnt]=A[i][j];
            }
        }
        System.out.println();
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
        for(int i=1; i<(M-1); i++) //1d array transferred back to 2d array
        {
            for(int j=1; j<(M-1); j++, cnt++)
            {
                A[i][j]=B[cnt];
            }
        }
    }
    void display(int f)
    {
        if(f==1)
        {
            System.out.println("ORIGINAL MATRIX");
            for(int i=0; i<M; i++) //PRINTS
            {
                for(int j=0; j<M; j++)
                {
                    if(j==(M-1) || (A[i][j]>9 && A[i][j+1]<10) || (A[i][j]>9 && A[i][j+1]>9))
                    {
                        System.out.print(A[i][j]+" ");
                    }
                    else// if (((A[i][j]<10) && (A[i][j+1]<10)) || ((A[i][j]<10) && (A[i][j+1]>9)))
                    {
                        System.out.print(A[i][j]+"  ");
                    }
                }
                System.out.println();
            }
        }
        else if(f==2)
        {
            int d=0;
            int e=0;
            System.out.println("REARRANGED MATRIX");
            for(int i=0; i<M; i++) //PRINTS
            {
                d = d + A[i][i];   //sum of left diagonal
                e = e + A[M-1-i][i]; //sum of right diagonal
                for(int j=0; j<M; j++)
                {
                    if(j==(M-1) || (A[i][j]>9 && A[i][j+1]<10) || (A[i][j]>9 && A[i][j+1]>9))
                    {
                        System.out.print(A[i][j]+" ");
                    }
                    else// if (((A[i][j]<10) && (A[i][j+1]<10)) || ((A[i][j]<10) && (A[i][j+1]>9)))
                    {
                        System.out.print(A[i][j]+"  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("DIAGONAL ELEMENTS");
            for(int i=0; i<M; i++) //PRINTS
            {
                for(int j=0; j<M; j++)
                {
                    if(i==j || (i+j==(M-1)))
                    {
                        if(j==(M-1) || (A[i][j]>9 && A[i][j+1]<10) || (A[i][j]>9 && A[i][j+1]>9))
                        {
                            System.out.print(A[i][j]+" ");
                        }
                        else// if (((A[i][j]<10) && (A[i][j+1]<10)) || ((A[i][j]<10) && (A[i][j+1]>9)))
                        {
                            System.out.print(A[i][j]+"  ");
                        }
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("SUM OF THE DIAGONAL ELEMENTS = "+(d+e));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter dimensions of array. (square matrix only: rows=columns) (3<size<10)");
        int m=sc.nextInt();
        hol_nonboundary_sorter obj = new hol_nonboundary_sorter(m);
        obj.input();
        obj.display(1);
        obj.sort();
        obj.display(2);
    }
}