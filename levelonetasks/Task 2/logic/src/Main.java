import java.util.Scanner;
 void main() {

Scanner input=new Scanner(System.in);
System.out.println("enter 2 numbers");
int num1=input.nextInt();
int num2=input.nextInt();
Logic logic=new Logic(num1,num2);
System.out.println(logic.xor());





}