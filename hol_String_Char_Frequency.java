import java.util.*;
public class hol_String_Char_Frequency
{
    static String S , List;
    static int ListArr[];
    hol_String_Char_Frequency(String S,int len)
    {
        this.S = S;
        List = new String();
        ListArr = new int[len]; /*(optional) sort array by Unicode value, and replace string with concatenated char array, before printing
                                  for that, first make a char array filled similarly to how the int array is filled
                                  then sort the two arrays simultaneously using char array Umicode values as the basis
                                  then print using an incrementing counter (List string becomes redundant here) */
    }
    void genList(int cnt)
    {
        char c = (this.S).charAt(cnt);
        boolean charExists = List.contains(Character.toString(c));
        if(charExists)
        {
            ListArr[(List.indexOf(c))]+=1;
        }
        else
        {
            List=List+c;
            ListArr[(List.indexOf(c))]+=1;
        }
        if(cnt<((this.S).length()-1))
        {
            genList((cnt+1));
        }
    }
    void display(int cnt)
    {
        System.out.println("    "+List.charAt(cnt)+"                "+ListArr[cnt]);
        if(cnt<(List.length()-1))
        {
            display((cnt+1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String S1 = sc.nextLine();
        S1 = S1.toUpperCase().trim();
        int L = S1.length();
        hol_String_Char_Frequency obj = new hol_String_Char_Frequency(S1,L);
        obj.genList(0);
        System.out.println("The characters and their frequencies in the string are as follows:");
        System.out.println("Character        Frequency");
        System.out.println();
        obj.display(0);
    }
}