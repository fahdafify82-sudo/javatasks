public class Memo {
    public int a, k, b;

    Memo(int a, int k, int b) {
        this.a = a;
        this.k = k;
        this.b = b;
    }

    public void calc() {
        if (a % k == 0 && b % k == 0) {
            System.out.println("both");
        } else if (a % k == 0) {

            System.out.println("memo");
        } else if (b % k == 0) {
            System.out.println("momo");
        } else {
            System.out.println("none");
        }

    }
}