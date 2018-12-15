import java.util.*;
public class array_bubble_sort
{
    public static void bubble_template()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fHow many numbers would you like to input?");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers that you would like to sort, one by one.");
        for(int cnt=0; cnt<arr.length; cnt++)
        {
            arr[cnt]=sc.nextInt();
        }
        int pos1, pos2, temp;
        for(int a=n; a>=0; a--) //doing this operation on the entire array
        {
            for(int j=1; j<a; j++) //swapping the variables if b is smaller than a
            {
                pos1=arr[j];
                pos2=arr[j-1];
                if(pos1<pos2)
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int b=0; b<arr.length; b++)
        System.out.print(arr[b]+", ");
    }
}