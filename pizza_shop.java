import java.util.*;
public class pizza_shop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number of pizzas and number of crushers you'd like to order, one by one.");
        int p=sc.nextInt();
        int c=sc.nextInt();
        int sub=(p*75)+(c*25);
        int total=sub;
        System.out.println("Enter the day of the week:");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        int day=sc.nextInt();
        if(day>=5)
        total=sub-50;
        else if (day>7)
        System.out.println("WRONG INPUT. ASSUMING WEEKDAY.");
        System.out.println();
        System.out.println("  __________________________");
        System.out.println("  BILL:");
        System.out.println("  __________________________");
        System.out.println("  Pizzas: "+p+"       Cost: "+(p*75));
        System.out.println("  Crushers: "+c+"       Cost: "+(c*25));
        System.out.println("  Subtotal: "+sub);
        System.out.println("  Total after discount: "+total);
    }
}