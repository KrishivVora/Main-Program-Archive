import java.util.*;
public class string_length
{
    static void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String S=sc.nextLine();
        int a=S.length();
        System.out.println("The string you entered has "+a+" characters.");
    }
}