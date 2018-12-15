public class Average_Marks
{
    void marks(double Eng, double Math, double Science, double Hist, double Geog, double Computers, double EVS, double Hindi)
    {
        double sum=Eng+Math+Science+Hist+Geog+Computers+EVS+Hindi;
        System.out.println("The sum of the marks is "+sum+" out of 800");
        double average=sum/8;
        System.out.println("The average of the marks is "+average+" out of 800");
    }
}