import java.util.Scanner;
void main() {
Scanner input=new Scanner(System.in);
System.out.println("enter days num");
int days=input.nextInt();
Year year=new Year(days);
year.calc();
}
