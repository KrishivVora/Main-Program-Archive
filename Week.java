import java.io.*;
public class Week
{
    public static void method()throws IOException
    {
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader y=new BufferedReader(x);
        System.out.println("Enter a number from 1 to 7...");
        int a=Integer.parseInt(y.readLine());
        switch(a)
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thurday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Wrong input");
        }
    }
}
    