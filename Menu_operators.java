import java.io.*;
public class Menu_operators
{
    public static void method()throws IOException
    {
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader y=new BufferedReader(x);
        System.out.println("Enter two numbers and an operator");
        int a= Integer.parseInt(y.readLine());
        int b= Integer.parseInt(y.readLine());
        char op= (y.readLine()).charAt(0);
        int ans=0;
           switch(op)
        {   case '+': ans=a+b; break;
            case '-': ans=a-b; break;
            case '*': ans=a*b; break;
            case '/': ans=a/b; break;
            case '%': ans=a%b; break;
        }
        System.out.println(ans);
    }
}
