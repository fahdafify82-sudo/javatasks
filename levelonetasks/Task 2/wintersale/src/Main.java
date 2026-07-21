import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
System.out.println("enter ur disc and price");
Scanner input=new Scanner(System.in);
int disc=input.nextInt();
int percent=input.nextInt();

Sales sales=new Sales(disc,percent);
sales.winterSale();

}
