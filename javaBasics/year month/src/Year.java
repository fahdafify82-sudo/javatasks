public class Year {
    int days;
    Year(int days)
    {
     this.days=days;

    }
void calc()
{
 int years=days/365;
 days=days%365;
 int month=days/30;
  days=days%30;
 int day=days;
   System.out.println("year is  "+years +"month is "+month+"*** day is  "+day);
}
}
