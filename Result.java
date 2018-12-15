import java.util.*;
public class Result
{
    String Nam[]=new String[100];
    int Roll[]=new int[100];
    int Tot[]=new int[100];
    int N;
    Result()
    {
        for(int cnt=0; cnt<100; cnt++)
        {
            Nam[cnt]="";
            Roll[cnt]=0;
            Tot[cnt]=0;
        }
    }
    void getsize(int nm)
    {
        N=nm;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        for(int cnt=0; cnt<N; cnt++)
        {
            System.out.println("\fEnter the name of the next student.");
            Nam[cnt]=sc.nextLine();
            System.out.println("Enter the student's roll number.");
            Roll[cnt]=sc.nextInt();
            System.out.println("Enter the student's total marks.");
            Tot[cnt]=sc.nextInt();
        }
    }
    void formatdata() //arrange all the arrays using sorting technique by sorting all array elements in same loop, responsible for sorting marks elements in descending order
    {
        int pos1, pos2, temp;
        String temp0;
        for(int a=N; a>=0; a--) //1d array sorted
        {
            for(int j=1; j<a; j++)
            {
                pos1=Tot[j];
                pos2=Tot[j-1];
                if(pos1>pos2)
                {
                    temp=Tot[j];
                    Tot[j]=Tot[j-1];
                    Tot[j-1]=temp;
                    temp=Roll[j];
                    Roll[j]=Roll[j-1];
                    Roll[j-1]=temp;
                    temp0=Nam[j];
                    Nam[j]=Nam[j-1];
                    Nam[j-1]=temp0;
                }
            }
        }
    }
    void show()
    {
        String space="";
        System.out.println("Roll no.  Name                 Marks");
        for(int cnt=0; cnt<N; cnt++)
        {
            space="";
            for(int j=0; j<17-(Nam[cnt].length()); j++)
            {
                space=space+" ";
            }
            System.out.println(Roll[cnt]+"        "+Nam[cnt]+space+Tot[cnt]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number of entries.");
        int ne=sc.nextInt();
        Result obj=new Result();
        obj.getsize(ne);
        obj.getdata();
        obj.formatdata();
        obj.show();
    }
}