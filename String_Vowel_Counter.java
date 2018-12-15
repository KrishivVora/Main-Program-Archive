import java.util.*;
public class String_Vowel_Counter
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the sentence.");
        String S=sc.nextLine().trim();
        if(S.endsWith(".")==false && S.endsWith("?")==false)
        {
            System.out.println("ERROR. SENTENCE DOES NOT END WITH '.' or '?'");
        }
        else
        {
            StringTokenizer st=new StringTokenizer(S," .?",false);
            int cnt=0;
            int n=st.countTokens();
            String arr[]=new String[n];
            char c=' ';
            int vcnt, ccnt;
            String space="";
            while(st.hasMoreTokens()) //storing each word in an array element
            {
                arr[cnt]=st.nextToken();
                cnt++;
            }
            System.out.println("Word           Vowels  Consonants");
            for(cnt=0; cnt<n; cnt++)
            {
                space="";
                for(int j=0; j<17-(arr[cnt].length()); j++)
                {
                    space=space+" ";
                }
                arr[cnt]=arr[cnt].substring(0,1).toUpperCase() + arr[cnt].substring(1);
                vcnt=0;
                ccnt=0;
                for(int i=0; i<arr[cnt].length(); i++)
                {
                    c=arr[cnt].charAt(i);
                    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                    vcnt++;
                    else
                    ccnt++;
                }
                System.out.println(arr[cnt]+space+vcnt+"          "+ccnt);
            }
        }
    }
}