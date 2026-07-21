class Interval {
    private int odd;
    private int even;

    public Interval(int odd, int even) {
        this.odd = odd;
        this.even = even;
    }

    public String check() {
        if (odd + even == 0) {
            return "NO";
        }

        if (Math.abs(odd - even) <= 1) {
            return "YES";
        }

        return "NO";
    }
}
