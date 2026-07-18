public class Calc {

    int num1, num2;
    String oper;

    Calc(int num1, int num2, String oper) {
        this.num1 = num1;
        this.num2 = num2;
        this.oper = oper;


        switch (oper) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":

                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("Error");


        }
    }
}