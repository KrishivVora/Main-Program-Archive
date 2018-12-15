public class Salary_calculator
{
    void main(int BA)
    {
        int DA=(3*BA)/4;
        int HRA=(BA)/4;
        int PF=(12*(BA+DA))/100;
        int GS=BA+DA+HRA;
        int NS=GS-PF;
        System.out.println("The Gross Salary is Rs. "+GS);
        System.out.println("The Net Salary is Rs. "+NS);
    }
}
        