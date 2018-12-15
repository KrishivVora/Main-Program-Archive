import java.util.*;
public class array_2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int storage[][]=new int[5][5];
        System.out.println("\fEnter roll number of each student.");
        for(int i=0; i<5; i++)
        {
            storage[i][0]=sc.nextInt();
        }
        String sentence[]={"first", "second", "third", "fourth", "fifth"};
        for(int cnt=0; cnt<5; cnt++)
        {
            System.out.println("Enter the marks of the "+sentence[cnt]+" student.");
            for(int j=1, total=0; j<4; j++)
            {
                storage[cnt][j]=sc.nextInt();
                total=total+storage[cnt][j];
                storage[cnt][4]=total;
            }
        }
        for(int cnt=0; cnt<5; cnt++)
        {
            System.out.println("Roll no.- "+storage[cnt][0]+"  Total marks- "+storage[cnt][4]);
        }
    }
}