public class Lucky {
    int num;

    Lucky(int num) {
        this.num = num;
    }

    void show() {
        if(num >=10 && num<=100) {

            switch (num) {

                case 55:
                    System.out.println(" is lucky");
                    break;

                case 66:
                    System.out.println(num + " is lucky");
                    break;

                default:
                    System.out.println("not lucky");
            }
        }
            else
            {
                System.out.println("num is not in range");
            }


    }
}