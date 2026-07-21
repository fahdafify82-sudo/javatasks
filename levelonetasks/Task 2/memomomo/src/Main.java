import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
System.out.println("enter a,k,b");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int k=input.nextInt();
int b=input.nextInt();
Memo memo=new Memo(a,k,b);
memo.calc();




}
