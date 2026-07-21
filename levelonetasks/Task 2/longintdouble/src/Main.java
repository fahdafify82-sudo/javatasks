
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input = new Scanner(System.in);
    System.out.println("enter 3 numbers");
  int  n,k,a;
  n = input.nextInt();
  k = input.nextInt();
  a = input.nextInt();
Datatype data=new Datatype(n,k,a);
System.out.println(data.calc());
}
