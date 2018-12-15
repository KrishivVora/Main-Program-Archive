public class pattern_2 /*     prints pattern:  abcddcba
                                               abc  cba
                                               ab    ba
                                               a      a
                       */
{
    public static void main(String args[])
    {
        System.out.print("\f");
        String S="abcd";
        char c;
        int cnt,i,j,k,a;
        a=4;
        for(cnt=0; cnt<4; cnt++, a--)
        {
            for(i=0; i<a; i++)
            {
                c=S.charAt(i);
                System.out.print(c);
            }
            for(j=0; j<cnt; j++)
            {
                System.out.print("  ");   
            }
            for(k=a-1; k>=0; k--)
            {
                c=S.charAt(k);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}