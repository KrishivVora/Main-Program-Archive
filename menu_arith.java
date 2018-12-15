import java.util.*;
public class menu_arith //a menu driven program that takes two numbers as input and performs one of 5 arithmetic operations on them
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter two numbers.");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("Choose an operation by pressing the corresponding button.");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-) ");
        System.out.println("3. Multiplication (x) ");
        System.out.println("4. Division (/) ");
        System.out.println("5. Modulus (%) ");
        int a=sc.nextInt();
        double z=0.0;
        switch(a)
        {
            case 1:
            {
                z=x+y;
                break;
            }
            case 2:
            {
                z=x-y;
                break;
            }
            case 3:
            {
                z=x*y;
                break;
            }
            case 4:
            {
                z=x/y;
                break;
            }
            case 5:
            {
                z=x%y;
                break;
            }
            default:
            {
                System.out.println("Wrong input. Printing null value of answer...");
                break;
            }
        }
        System.out.println("The answer of your operation is: "+z);
    }
}