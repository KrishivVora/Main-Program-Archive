import java.util.*;
public class hol_String_Sorter //change name to hol
                                /*take String input, segregate each character into a char array of length equal to string length,
                                 * sort char array using Unicode values, concatenate each element of array into new sorted String,
                                 * print String (only add alphabet elements to String, not numbers, special chars, spaces) */
{
    static String S,S2;
    char arr[];
    static int pos, min, temp;
    hol_String_Sorter(String S1,int len)
    {
        S = S1;
        S2 = new String();
        arr = new char[len];
        pos = 0;
        min = 0;
        temp = 0;
    }
    void separateChars(int i)
    {
        arr[i] = S.charAt(i);
        if(i<(S.length()-1))
        {
            separateChars((i+1));
        }
    }
    void sort_outer(int j)
    {
        pos = j;
        min = (int)arr[j];
        sort_inner(j);
        temp = (int)arr[j];
        arr[j] = (char)min;
        arr[pos] = (char)temp;
        if(j<(arr.length-1))
        {
            sort_outer((j+1));
        }
    }
    void sort_inner(int k)
    {
        if((int)arr[k]<(int)arr[pos])
        {
            pos = k;
            min = (int)arr[k];
        }
        if(k<(arr.length-1))
        {
            sort_inner((k+1));
        }
    }
    void display(int g)
    {
        if(((int)arr[g]>=65 && (int)arr[g]<=90) || ((int)arr[g]>=97 && (int)arr[g]<=122))
        {
            S2 = S2 + arr[g];
        }
        if(g<(arr.length-1))
        {
            display((g+1));
        }
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("\fEnter a string.");
       String S1 = sc.nextLine().trim();
       int L = S1.length();
       hol_String_Sorter obj = new hol_String_Sorter(S1,L);
       obj.separateChars(0);
       obj.sort_outer(0);
       obj.display(0);
       System.out.println("The sorted string is (ignoring punctuation): "+S2);
    }
}