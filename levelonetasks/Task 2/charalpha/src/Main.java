import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input=new Scanner(System.in);
System.out.println("enter ur char");
char a=input.next().charAt(0);

Charr charr=new Charr(a);
System.out.println(charr.nex());



}
