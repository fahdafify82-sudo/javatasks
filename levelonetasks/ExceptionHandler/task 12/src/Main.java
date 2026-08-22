//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    try {

        try {
            int k=n/0;
        }
        catch (NullPointerException e) {
            System.out.println("null exeption");
        }

    }
    catch (ArithmeticException e) {
        System.err.println("Caught ArithmeticException");
    }
}
