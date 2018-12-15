import java.util.*;
public class array_selection_sort
{
    public static void selection_template()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fHow many numbers would you like to input?");
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        System.out.println("Enter the numbers that you would like to sort, one by one.");
        for(int cntx=0;cntx<arr.length;cntx++)
        {
            arr[cntx]=sc.nextInt();
        }
        int pos, min, temp;
        for(int i=0; i<arr.length-1; i++)
        {
            pos=i;
            min=arr[i];
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[pos])
                {
                   pos=j;
                   min=arr[j];
                }    
            }   
            temp=arr[i];
            arr[i]=min;
            arr[pos]=temp; 
        }
        for(int b=0; b<arr.length;b++)
        System.out.print(arr[b]+", ");
    }
}