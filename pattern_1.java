public class pattern_1 /*     prints pattern:           1
                                                       121
                                                      12321
                                                     1234321
                                                    123454321
                       */
{
    public static void main(String args[])
    {
        System.out.print("\f");
        int cnt,i,j,k,a;
        a=4;
        for(i=1;i<=5;i++,a--)
        {
            for(cnt=a; cnt>0; cnt--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);   
            }
            for(k=i-1;k>0;k--)
            {
                System.out.print(k);   
            }
            System.out.println();
        }
    }
}