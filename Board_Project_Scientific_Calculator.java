import java.util.*;
public class Board_Project_Scientific_Calculator //a functional scientific calculator
{
    static Scanner sc=new Scanner(System.in);
    static double input; //1st user input, only input if operating on one number
    static double input0; //2nd user input, only used if operating on two numbers
    static int checker; //to check various if statement results
    static int checker0; //additional checker variable
    static int checker2; //to repeat methods or full program incase of error or desire to rerun
    static int a; //how many numbers to perform operations on
    static int b; //which opsin user wants
    static int c; //which ops user wants
    static int d; //to assign saved number to first or second operand
    static double save=0.0; //to save a number in calculator's memory
    static int n=0; //number of iterations of program
    static char ch; //to check for Y or N input
    static double z=0.0; //final result of calculation
    String ops[]=new String[8]; //list of operations with two numbers
    String opsin[]=new String[12]; //list of operations with one number
    Board_Project_Scientific_Calculator()
    {
        input=0.0;
        input0=0.0;
        a=0;
        b=0;
        c=0;
        d=0;
        checker=0;
        checker0=0;
        checker2=0;
        dual_operations:
        {
            ops[0]="Press 1 for addition.";        
            ops[1]="Press 2 for subtraction.";
            ops[2]="Press 3 for multiplication.";
            ops[3]="Press 4 for division.";
            ops[4]="Press 5 for modulus.";
            ops[5]="Press 6 to find the first number raised to the second number.";
            ops[6]="Press 7 to find the first number to the root of the second number.";
            ops[7]="Press 8 to find the hypotenuse of a triangle with sides x and y.";
        }
        single_operations:
        {
            opsin[0]="Press 1 for square.";
            opsin[1]="Press 2 for cube.";
            opsin[2]="Press 3 for square root.";
            opsin[3]="Press 4 for cube root.";
            opsin[4]="Press 5 for inverse.";
            opsin[5]="Press 6 for sine (in radians).";
            opsin[6]="Press 7 for cosine (in radians).";
            opsin[7]="Press 8 for tangent (in radians).";
            opsin[8]="Press 9 for factorial.";
            opsin[9]="Press 10 for finding all factors of the number.";
            opsin[10]="Press 11 for log x to the base e (Euler's constant).";
            opsin[11]="Press 12 for the log x to the base 10.";
        }
    }
    void fancy() //to spruce up the program
    {
        System.out.println("\f           ____           _                  _           _                  ");
        System.out.println("          / ___|   __ _  | |   ___   _   _  | |   __ _  | |_    ___    _ __ ");
        System.out.println("         | |      / _` | | |  / __| | | | | | |  / _` | | __|  / _ \\  | '__|");
        System.out.println("         | |___  | (_| | | | | (__  | |_| | | | | (_| | | |_  | (_) | | |   ");
        System.out.println("          \\____|  \\__,_| |_|  \\___|  \\__,_| |_|  \\__,_|  \\__|  \\___/  |_|   ");
        for(int cnt=0; cnt<=4; cnt++)
        {
            System.out.println();
        }
        System.out.println("                 WELCOME TO THE SCIENTIFIC CALCULATOR EXTRAORDINAIRE");
        System.out.println("                        Press any key and enter to continue.");
        ch=sc.next(".").charAt(0);
    }
    void enter() //to accept input and/or use saved number as operand
    {
        checker=0;
        while(checker==0)
        {
            System.out.println("\fWould you like to perform an operation on 1 or 2 numbers?");
            switch(a)
            {
                case 1:
                {
                    if(n>0)
                    {
                        System.out.println("Would you like to operate on the saved number? ("+save+")");
                        System.out.println("Press Y for yes and N for no.");
                        ch=sc.next(".").charAt(0);
                        if(ch=='Y' || ch=='y')
                        {
                            checker0++;
                        }
                    }
                    if(checker0==0)
                    {
                        System.out.println("Please enter your number.");
                        input=sc.nextDouble();
                    }
                    else
                    {
                        input=save;
                    }
                    System.out.println("Is "+input+" your number of choice? Press Y for yes and N for no.");
                    ch=sc.next(".").charAt(0);
                    if(ch=='Y' || ch=='y')
                    {
                        checker++;
                    }
                    else
                    {
                        checker2++;
                    }
                    break;
                }
                case 2:
                {
                    if(n>0)
                    {
                        System.out.println("Would you like to operate on the saved number? ("+save+")");
                        System.out.println("Press Y for yes and N for no.");
                        ch=sc.next(".").charAt(0);
                        if(ch=='Y' || ch=='y')
                        {
                            checker0++;
                        }
                    }
                    if(checker0==0)
                    {
                        System.out.println("Please enter both your numbers one by one, in the order of operation.");
                        System.out.println("(for example, if you want to divide x by y, enter x first and then enter y)");
                        input=sc.nextDouble();
                        input0=sc.nextDouble();
                    }
                    else if(checker0==1)
                    {
                        System.out.println("Would you like the first operand or the second operand to be the saved number?");
                        System.out.println("Press 1 to assign the saved number to the first operand and 2 to assign it to the second operand.");
                        d=sc.nextInt();
                        if(d==1)
                        {
                            input=save;
                            System.out.println("Please enter the second number.");
                            input0=sc.nextInt();
                        }
                        else if(d==2)
                        {
                            input0=save;
                            System.out.println("Please enter the first number.");
                        }
                    }
                    checker=0;
                    System.out.println("Are "+input+" and "+input0+" your numbers of choice? Press Y for yes and N for no.");
                    ch=sc.next(".").charAt(0);
                    if(ch=='Y' || ch=='y')
                    {
                        checker++;
                    }
                    else
                    {
                        checker2++;
                    }
                    break;
                }
                default:
                {
                    System.out.println("Wrong input...");
                    checker2++;
                    break;
                }
            }
        }
        d=0;
    }
    void asker()
    {
        if(a==1)
        {
            System.out.println("\fHere are the operations you can perform on one number:");
            for(int cnt=0;cnt<=11;cnt++)
            {
                System.out.println(opsin[cnt]);
            }
            System.out.println("Please choose an operation by entering the corresponding number.");
            b=sc.nextInt(); //b now holds the operation number for one operand that the user wants
        }
        else if(a==2)
        {
            System.out.println("\fHere are the operations you can perform on two numbers:");
            for(int cnt=0;cnt<=7;cnt++)
            {
                System.out.println(ops[cnt]);
            }
            System.out.println("Please choose an operation by entering the corresponding number.");
            c=sc.nextInt(); //c now holds the operation number for two operands that user wants
        }
    }
    static double operations(double x,double y)
    {
        x=input;
        y=input0;
        if(a==2)
        {
            checker=0;
        }
        else
        {
            checker=1;
        }
        outerswitch:
        switch(checker)
        {
            case 0:
            {
                switch(c)
                {
                    case 1:
                    {
                        z=x+y;
                        break outerswitch;
                    }
                    case 2:
                    {
                        z=x-y;
                        break outerswitch;
                    }
                    case 3:
                    {
                        z=x*y;
                        break outerswitch;
                    }
                    case 4:
                    {
                        if(y==0)
                        {
                            System.out.println("Error. Cannot divide by 0.");
                            checker2++;
                            break outerswitch;
                        }
                        z=x/y;
                        break outerswitch;
                    }
                    case 5:
                    {
                        if(y==0)
                        {
                            System.out.println("Error. Cannot divide by 0.");
                            checker2++;
                            break outerswitch;
                        }
                        z=x%y;
                        break outerswitch;
                    }
                    case 6:
                    {
                        z=Math.pow(x,y);
                        break outerswitch;
                    }
                    case 7:
                    {
                        z=Math.pow(Math.abs(x),1/y);
                        break outerswitch;
                    }
                    case 8:
                    {
                        z=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                        break outerswitch;
                    }
                    default:
                    {
                        System.out.println("Wrong input...");
                        checker2++;
                    }
                }
                break outerswitch;
            }
            case 1:
            {
                switch(b)
                {
                    case 1:
                    {
                        z=Math.pow(x,2);
                        break outerswitch;
                    }
                    case 2:
                    {
                        z=Math.pow(x,3);
                        break outerswitch;
                    }
                    case 3:
                    {
                        z=Math.sqrt(x);
                        break outerswitch;
                    }
                    case 4:
                    {
                        z=Math.cbrt(x);
                        break outerswitch;
                    }
                    case 5:
                    {
                        z=1/x;
                        break outerswitch;
                    }
                    case 6:
                    {
                        z=Math.sin(x);
                        break outerswitch;
                    }
                    case 7:
                    {
                        z=Math.cos(x);
                        break outerswitch;
                    }
                    case 8:
                    {
                        z=Math.tan(x);
                        break outerswitch;
                    }
                    case 9:
                    {
                        z=1;
                        if(x!=0)
                        {
                            for(double cnt=x; cnt>0; cnt--)
                            {
                                z=z*cnt;
                            }
                        }
                        if(x<0)
                        {
                            System.out.println("Error. Negative numbers cannot have a factorial.");
                            checker2++;
                        }
                        break outerswitch;
                    }
                    case 10:
                    {
                        z=1;
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.println(z);
                        for(double cnt=2; cnt<=x; cnt++)
                        {
                            if(x%cnt==0)
                            {
                                System.out.println(cnt);
                            }
                        }
                        d++;
                        break outerswitch;
                    }
                    case 11:
                    {
                        z=Math.log(x);
                        break outerswitch;
                    }
                    case 12:
                    {
                        z=Math.log10(x);
                        break outerswitch;
                    }
                    default:
                    {
                        System.out.println("Wrong input.");
                        checker2++;
                    }
                }
                break outerswitch;
            }
            default:
            {
                System.out.println("FATAL ERROR. HOW HAS THIS HAPPENED. I LOVE CHOCOLATES.");
            }
        }
        save=z;
        return z;
    }
    void runcheck() throws InterruptedException
    {
        if(checker2>0)
        {
            System.out.println("Would you like to re-run the program?");
            System.out.println("press Y for yes or N for no.");
            ch=sc.next(".").charAt(0);
            if(ch=='Y' || ch=='y')
            {
                rerun();
            }
            else
            {
                shutdown();
            }
        }
    }
    void rerun()throws InterruptedException
    {
        System.out.println("Your answer has been saved and can be reused in the next iteration.");
        System.out.println("Restarting...");
        Thread.sleep(3000);
        n++;
        main();
    }
    void shutdown()throws InterruptedException
    {
        System.out.println("Thank you for using the calculator!");
        System.out.println("Program will self destruct in 5 seconds.");
        Thread.sleep(5000);
        System.exit(0);
    }
    public static void main()throws InterruptedException
    {
        Board_Project_Scientific_Calculator obj=new Board_Project_Scientific_Calculator();
        obj.fancy();
        ch=' ';
        obj.enter();
        obj.runcheck();
        obj.asker();
        obj.runcheck();
        z=obj.operations(input, input0);
        obj.runcheck();
        if(d==0)
        {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println();
            System.out.println(z);
        }
        System.out.println("Would you like to re-run the program?");
        System.out.println("Enter Y for yes and N for no.");
        ch=sc.next(".").charAt(0);
        if(ch=='Y' || ch=='y')
        {
            checker2++;
            obj.rerun();
        }
        else
        {
            checker2=0;
            obj.shutdown();
        }
    }
}