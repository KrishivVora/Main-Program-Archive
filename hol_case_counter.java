import java.util.*;
public class hol_case_counter
{
    static int ucnt, lcnt;
    static String S1;
    hol_case_counter()
    {
        ucnt=0;
        lcnt=0;
        S1=" ,.;:'\"!@#$%^&*()<>?1234567890{}[]/\\+-_|`~";
    }
    void caseChecker(String S,int cnt)
    {
        char c=S.charAt(cnt);
        if(c==(S.toUpperCase().charAt(cnt)) && S1.contains(Character.toString(c))==false)
        {
            ucnt+=1;
        }
        else if(c==(S.toLowerCase().charAt(cnt)) && S1.contains(Character.toString(c))==false)
        {
            lcnt+=1;
        }
        if(cnt<(S.length()-1))
        {
            caseChecker(S,(cnt+1));
        }
    }
    public static void main(String args[])
    {
        hol_case_counter obj=new hol_case_counter();
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a sentence.");
        String S=sc.nextLine().trim();
        System.out.println("The number of uppercase and lowercase characters in the sentence are:");
        obj.caseChecker(S,0);
        System.out.println("Uppercase characters: "+ucnt);
        System.out.println("Lowercase characters: "+lcnt);
    }
}