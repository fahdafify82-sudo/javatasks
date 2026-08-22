//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   try
   {
   upper(null)   ;
   }
  catch (NullPointerException ex)
  {
      System.out.println("its null");
  }
}
void upper(String tex)
{
    System.out.println(tex.toUpperCase());
}
/*
هنا عملت فانكشن بره المين انهعا تحول لuppercase وبعدها عملت تراي اني ادخل null ولو نل عملت كاتش يمسكه
 */