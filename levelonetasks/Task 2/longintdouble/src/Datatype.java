public class Datatype {
    int n, k, a;

    Datatype(int n, int k, int a) {
        this.n = n;
        this.k = k;
        this.a = a;
    }

    String calc() {
        int res = n * k;
        if (res % 2 != 0) {
            return "double";
        }
        res = res / a;
        if (res <= Integer.MAX_VALUE) {
            return "int";
        } else {
            return "long";
        }


    }
}
