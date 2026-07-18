import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input=new Scanner(System.in);
System.out.println("enter ur 4 numbers");
int num1=input.nextInt();
int num2=input.nextInt();
int num3=input.nextInt();
int num4=input.nextInt();
Compare compare=new Compare(num1,num2,num3,num4);
compare.log();


}
