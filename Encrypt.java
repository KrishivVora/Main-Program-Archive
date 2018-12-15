import java.util.*;
public class Encrypt // Krishiv Vora 12E Roll No.18
{
    String A[];
    int n;
    Encrypt(int nn)
    {
        A = new String[nn];
        n = nn;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int cnt = 0; cnt < n; cnt++)
        {
            A[cnt] = sc.nextLine();
        }
    }
    String even_encrypt(String S)
    {
        StringTokenizer st = new StringTokenizer(S, " .");
        String S1 = new String();
        String S2 = new String();
        while(st.hasMoreTokens())
        {
            S2 = reverse(st.nextToken());
            S1 = S1 + S2 + " ";
        }
        S1 = S1.trim() + '.';
        return S1;
    }
    String reverse(String S)
    {
        char c[] = S.toCharArray();
        String S1 = new String();
        for(int cnt = c.length-1; cnt>=0; cnt--)
        {
            S1 = S1 + c[cnt];
        }
        return S1;
    }
    String odd_encrypt(String S)
    {
        String S1 = new String();
        char x;
        int a;
        for(int cnt = 0; cnt < S.length(); cnt++)
        {
            x = S.charAt(cnt);
            if(x!=' ' && x!='.')
            {
                a = (int)x;
                if((a>=89 && a<97) || (a>=122))
                {
                    a = a - 26;
                }
                a = a + 2;
                x = (char)a;
            }
            S1 = S1 + x;
        }
        return S1;
    }
    void display()
    {
        for(int cnt = 0; cnt < n; cnt ++)
        {
            A[cnt] = A[cnt].toUpperCase();
            System.out.println("\t"+A[cnt]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\fEnter number of sentences.");
        int nn = sc.nextInt();
        if(nn < 2 || nn > 9)
        {
            System.out.println("INPUT: n="+nn);
            System.out.println("OUTPUT: INVALID ENTRY.");
        }
        else
        {
            Encrypt obj = new Encrypt(nn);
            obj.input();
            System.out.println("\fINPUT: n="+nn);
            obj.display();
            for(int cnt = 0; cnt < nn; cnt++)
            {
                if(cnt%2 != 0)
                {
                    obj.A[cnt] = obj.even_encrypt(obj.A[cnt]);
                }
                else
                {
                    obj.A[cnt] = obj.odd_encrypt(obj.A[cnt]);
                }
            }
            System.out.println();
            System.out.println("OUTPUT:");
            obj.display();
        }
    }
}