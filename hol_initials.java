import java.util.*;
public class hol_initials
{
    void initialPrinter(String S)
    {
        StringTokenizer st=new StringTokenizer(S," ");
        String S1;
        if(st.hasMoreTokens())
        {
            S1=st.nextToken().toUpperCase();
            S=S.substring(S1.length()).trim();
            System.out.print((S1.charAt(0))+" ");
            initialPrinter(S);
        }
    }
    public static void main(String args[])
    {
        hol_initials obj=new hol_initials();
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the name.");
        String S=sc.nextLine().trim();
        System.out.println("The initials of the name are: ");
        obj.initialPrinter(S);
    }
}