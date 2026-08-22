//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    try
    {
        String n=null;
        System.out.println(n.length());
        int dev=7/0;

    }
    catch(NullPointerException e)
    {
        System.out.println("Null err");
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arth error dev 0");
    }

}
