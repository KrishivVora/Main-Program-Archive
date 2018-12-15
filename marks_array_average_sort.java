import java.util.Scanner;
public class marks_array_average_sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[15];
        System.out.println("Enter the marks of 15 students one by one.");
        for(int cnt=0;cnt<15;cnt++)
        {
            a[cnt]=sc.nextInt();
        }
        int pos1, pos2, temp;
        for(int cnt=a.length;cnt>=0;cnt--)
        {
            for(int j=0; j<(cnt-1); j++)
            {
                pos1=a[j];
                pos2=a[j+1];
                if(a[pos2]<a[pos1])
                {
                    temp=a[pos1];
                    a[pos1]=a[pos2];
                    a[pos2]=temp;
                }
            }
        }
    }
}