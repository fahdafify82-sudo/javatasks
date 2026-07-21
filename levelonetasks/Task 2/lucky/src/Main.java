import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner input = new Scanner(System.in);
    System.out.println("enter a num to see lucky or not");
    int num = input.nextInt();
    Lucky lucky = new Lucky(num);
    lucky.show();
}
