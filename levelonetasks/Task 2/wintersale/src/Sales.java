public class Sales
{
    int disc,percent;
   Sales(int disc,int percent)
   {
       this.disc=disc;
       this.percent=percent;
   }
    void winterSale()
    {
      double before=(disc*100)/(100-percent);
       System.out.println(before);

    }

}
