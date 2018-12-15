import java.util.*;
public class hol_encryption
{
    String S;
    String wordList[];
    int scoreList[];
    StringTokenizer st;
    hol_encryption(String S1)
    {
        S = S1;
        st = new StringTokenizer(S,".,?! ");
        wordList = new String[st.countTokens()];
        scoreList = new int[st.countTokens()];
    }
    void convert()
    {
        String SX = new String();
        int scnt = 0; char c = ' ';
        System.out.println("POTENTIAL:");
        for(int cnt=0; st.hasMoreTokens(); cnt++)
        {
            SX = st.nextToken();
            scnt = 0;
            for(int i = 0; i<SX.length(); i++)
            {
                c = SX.charAt(i);
                scnt += (((int)c)-64);
            }
            wordList[cnt] = SX;
            scoreList[cnt] = scnt;
            System.out.println(SX+" = "+scnt);
        }
    }
    void sort()
    {
        int pos, min;
        String temp = new String();
        String temp2 = new String();
        for(int i=0; i<scoreList.length-1; i++)
        {
            pos=i;
            min=scoreList[i];
            for(int j=i+1; j<scoreList.length; j++)
            {
                if(scoreList[j]<scoreList[pos])
                {
                   pos=j;
                   min=scoreList[j];
                   temp2=wordList[j];
                }    
            }   
            temp=Integer.toString(scoreList[i]);
            scoreList[i]=min;
            scoreList[pos]=Integer.parseInt(temp);
            temp=wordList[i];
            wordList[i]=temp2;
            wordList[pos]=temp;
        }
    }
    void display()
    {
        System.out.println("OUTPUT:");
        for(int cnt = 0; cnt<wordList.length; cnt++)
        {
            System.out.print(wordList[cnt]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a string.");
        String S1 = sc.nextLine().trim().toUpperCase();
        System.out.println("INPUT: "+S1);
        hol_encryption obj = new hol_encryption(S1);
        obj.convert();
        obj.sort();
        obj.display();
    }
}