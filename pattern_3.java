public class pattern_3 /*     prints pattern: 4444
                                              4333
                                              4222
                                              4111
                       */
{
    public static void main(String args[])
    {
        System.out.print("\f");
        for(int cnt=4; cnt>=1; cnt--)
        {
            System.out.print("4");
            for(int j=3; j>=1; j--)
            {
                System.out.print(cnt);
            }
            System.out.println();
        }
    }
}