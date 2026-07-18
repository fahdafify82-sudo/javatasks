import java.util.Scanner;
void main() {

Scanner input=new Scanner(System.in);
System.out.println("enter 3 num");
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
MinMax minMax=new MinMax(a,b,c);
System.out.println(minMax.minn()+"----"+ minMax.maxx());56

}
