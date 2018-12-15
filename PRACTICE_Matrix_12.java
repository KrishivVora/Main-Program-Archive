import java.util.*;
public class PRACTICE_Matrix_12
{
    int Mat[][]=new int[10][10];
    int Mat2[][]=new int[10][10];
    int M;
    PRACTICE_Matrix_12() //initialises all global variables
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                Mat[i][j]=0;
                Mat2[i][j]=0;
            }
        }
        M=0;
    }
    void input() //takes input
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the dimensions of the square matrix.");
        M=sc.nextInt();
        System.out.println("Enter the elements of the array, one by one.");
        for(int i=0; i<M; i++) //input
        {
            for(int j=0; j<M; j++)
            {
                Mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("The input is:");
        for(int i=0; i<M; i++) //display input
        {
            for(int j=0; j<M; j++)
            {
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    int calculate()
    {
        int sum=Mat[0][0]+Mat[0][M-1]+Mat[M-1][0]+Mat[M-1][M-1]; //sum of corners
        return sum;
    }
    void shift() // 1 2 3    7 4 1
                 // 4 5 6 -> 8 5 2
                 // 7 8 9    9 6 3
    {
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
            {
                Mat2[i][j]=Mat[M-1-j][i];
            }
        }
    }
    void display()
    {
        System.out.println("The output is:");
        for(int i=0; i<M; i++) //display output
        {
            for(int j=0; j<M; j++)
            {
                System.out.print(Mat2[i][j]+" ");
            }
            System.out.println();
        }
        int sum=calculate();
        System.out.println("Sum of the corner elements is: "+sum);
    }
    public void main()
    {
        PRACTICE_Matrix_12 obj=new PRACTICE_Matrix_12();
        PRACTICE_Matrix_12 obj2=new PRACTICE_Matrix_12();
        obj.input();
        obj.shift();
        obj.display();
    }
}