import java.util.*;
public class hol_case_converter
{
    static String S, S1;
    hol_case_converter()
    {
        S=new String();
        S1=new String();
    }
    boolean checkUpperCase(char c)
    {
        char d=Character.toString(c).toUpperCase().charAt(0);
        if(c==d)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    char caseConverter(char c)
    {
        boolean t=checkUpperCase(c);
        if(t==true)
        {
            c=Character.toString(c).toLowerCase().charAt(0);
        }
        else if(t==false)
        {
            c=Character.toString(c).toUpperCase().charAt(0);
        }
        return c;
    }
    void StringConverter(int cnt)
    {
        char c=S.charAt(cnt);
        c=caseConverter(c);
        S1=S1+c;
        if(cnt<(S.length()-1))
        {
            StringConverter((cnt+1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        hol_case_converter obj=new hol_case_converter();
        System.out.println("\fEnter a sentence.");
        S=sc.nextLine().trim();
        System.out.println("The original sentence is:");
        System.out.println(S);
        obj.StringConverter(0);
        System.out.println("The new sentence is:");
        System.out.println(S1);
    }
}