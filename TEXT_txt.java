import java.util.*;
import java.io.*;
public class TEXT_txt
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fw=new FileWriter("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\TEXT.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw); 
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number of sentences.");
        int N=sc.nextInt();
        String S="";
        System.out.println("Enter the sentences one by one.");
        for(int cnt=0; cnt<=N; cnt++)
        {
            S=sc.nextLine();
            if(cnt==0)
            continue;
            pw.println(S);
        }
        pw.flush();
        fw.close();
        bw.close();
        pw.close();
        FileReader fin=new FileReader("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\TEXT.txt");
        BufferedReader bin=new BufferedReader(fin);
        String S1="", space=""; char c; int vcnt=0; int wcnt=0;
        System.out.println("\fSentence                                        Words  Vowels");
        for(int cnt=0; cnt<N; cnt++)
        {
            space=""; vcnt=0; wcnt=0;
            S1=bin.readLine().trim();
            StringTokenizer st=new StringTokenizer(S1, " ,;:'");
            wcnt=st.countTokens();
            for(int i=0; i<S1.length(); i++)
            {
                c=S1.charAt(i);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                vcnt++;
            }
            for(int j=0; j<50-(S1.length()); j++)
            {
                space=space+" ";
            }
            System.out.println(S1+space+wcnt+"      "+vcnt);
        }
    }
}