public class Pum {
    int n;
    int x=1;
    Pum(int n)
    {
        this.n=n;
    }
    void show()
    {
        for (int i = 1; i <= n; i++) {

            System.out.println(x + " " + (x + 1) + " " + (x + 2) + " " + "PUM");
            x += 4;
        }
    }


}
