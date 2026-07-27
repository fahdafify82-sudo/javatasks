import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
Scanner input = new Scanner(System.in);
int shape=input.nextInt();
Pyramid pyramid=new Pyramid(shape);
pyramid.loopy();



}
