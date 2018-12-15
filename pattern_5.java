public class pattern_5 /*     prints pattern:               0
                                                          1 0 1
                                                        2 1 0 1 2
                                                      3 2 1 0 1 2 3
                                                    4 3 2 1 0 1 2 3 4
                       */
{
    public static void main(String args[])
    {
        System.out.print("\f");
        int cnt,i,j,k,a;
        a=4;
        for(cnt=0; cnt<=4; cnt++, a--)
        {
            for(i=a; i>0; i--)
            {
                System.out.print("  ");
            }
            for(j=cnt; j>=0; j--)
            {
                System.out.print(j+" ");   
            }
            for(k=1; k<=cnt; k++)
            {
                System.out.print(k+" ");   
            }
            System.out.println();
        }
    }
}