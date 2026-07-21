
public class Puzzle {
    private long a, b, c, d;

    public Puzzle(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String solve() {

        long[] first = {
                a + b,
                a - b,
                a * b
        };

        for (long x : first) {
            if (x + c == d || x - c == d || x * c == d) {
                return "YES";
            }
        }

        return "NO";
    }
}
