import java.util.*;
public class array_2d_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int storage[][]=new int[5][5];
        int total=0;
        System.out.println("\fEnter the match number.");
        for(int i=0; i<5; i++)
        {
            storage[i][0]=sc.nextInt();
        }
        String sentence[]={"first", "second", "third", "fourth", "fifth"};
        for(int cnt=0; cnt<5; cnt++)
        {
            System.out.println("Enter the score of the "+sentence[cnt]+" player.");
            for(int j=1; j<4; j++)
            {
                total=0;
                storage[cnt][j]=sc.nextInt();
                total=total+storage[cnt][j];
            }
            storage[cnt][4]=total/3;
        }
        for(int cnt=0; cnt<5; cnt++)
        {
            System.out.println("Match no.- "+storage[cnt][0]+"  Average score- "+storage[cnt][4]);
        }
    }
}