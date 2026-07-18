import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
int num1;
int num2;
String oper;
Scanner input=new Scanner(System.in);
System.out.println("enter the operation");
oper=input.nextLine();
System.out.println("enter ur first num");
num1=input.nextInt();
System.out.println("enter ur sec num");
num2=input.nextInt();
Calc cal=new Calc(num1,num2,oper);

}
