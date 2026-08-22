//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter firt num");
    int num1=sc.nextInt();
    System.out.println("Enter 2 num");
    int num2=sc.nextInt();
    try
    {
        double d=(double)num1/num2;
        System.out.println("Your number is "+d);
    }
    catch (ArithmeticException e)
    {
        System.out.println("devided by 0");
    }
}
/*

هنا لو قسمت علي صفر يطلع اللي فالكاتش
 */