public class Prime {
    int num;
    Prime(int num) {
        this.num=num;
    }
    void calc()
    {
        for (int i=2;i<num;i++) {
            if (num % i == 0) {
                System.out.println("NO");
                return;
            }
        }


             System.out.println("YES");



    }


}
