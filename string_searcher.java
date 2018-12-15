import java.util.*;
public class string_searcher
{
    static void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String SO=sc.nextLine();
        System.out.println("Enter the smaller string.");
        String SX=sc.nextLine();
        int no=SO.length();
        int nx=SX.length();
        char co;
        char cx;
        int checker=0;
        int cnt2=1;
        for(int cnt=0;cnt<no;cnt++,cnt2++)
        {
            co=SO.charAt(cnt);
            cx=SX.charAt(0);
            if(nx==1)
            {
                checker++;
                break;
            }
            if(cx==co)
            {
                for(int i=1;i<nx;i++,cnt2++)
                {
                    cx=SX.charAt(i);
                    co=SO.charAt(cnt2);
                    if(cx!=co)
                    break;
                    else if(i==(nx-1))
                    checker++;
                }
            }
        }
        if(checker!=0)
            System.out.println("The bigger string contains the smaller string.");
        else
            System.out.println("The bigger string does not contain the smaller string.");
    }
}