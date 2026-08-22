//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    String number=sc.nextLine();
    try{
        int n=Integer.parseInt(number);
        System.out.println("the num is "+n);
    }
    catch(NumberFormatException e)
    {
        System.out.println("Please enter a number");
    }
/*
هنا باخد من اليوزر الرقم علي هيئه سترينج بعدها بحولها ب Integerparse
واعرضها لو اليوزر دخل سترينج بطلع الكاتش
 */

}
