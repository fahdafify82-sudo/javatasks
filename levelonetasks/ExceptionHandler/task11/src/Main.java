//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {




    try
    {
        int e=10/0;
    }
    catch(ArithmeticException e)
        {
        System.out.println("Division by zero");
        }
    finally
    {
        System.out.println("done");
    }
}
