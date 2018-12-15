public class pattern_4 /*     prints pattern: *
                                              **
                                              ***
                                              ****
                                              *****
                                              ****
                                              ***
                                              **
                                              *
                       */
{
    public static void main(String args[])
    {
        System.out.print("\f");
        for(int cnt=1; cnt<=5; cnt++)
        {
            for(int i=1; i<=cnt; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=4; j>=1; j--)
        {
            for(int k=1; k<=j; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}