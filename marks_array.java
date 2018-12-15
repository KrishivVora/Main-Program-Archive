import java.util.Scanner;
public class marks_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        int n=0;
        int a1=0,a2=0,a3=0,a4=0,a5=0;
        System.out.println("Enter the marks of the 50 students one by one.");
        for(int cnt=0;cnt<50;cnt++)
            a[cnt]=sc.nextInt();
        for(int cnt=0;cnt<50;cnt++)
        {
            if(a[cnt]<60)
            a1++;
            else if(a[cnt]>60 && a[cnt]<70)
            a2++;
            else if(a[cnt]>70 && a[cnt]<80)
            a3++;
            else if(a[cnt]>80 && a[cnt]<90)
            a4++;
            else if(a[cnt]>90)
            a5++;
        }
        System.out.println("The number of people that got less than 60 marks: "+a1);
        System.out.println("The number of people that got between 60 and 70 marks: "+a2);
        System.out.println("The number of people that got between 70 and 80 marks: "+a3);
        System.out.println("The number of people that got between 80 and 90 marks: "+a4);
        System.out.println("The number of people that got more than 90 marks: "+a5);
    }
}
        