
class MinMax {

    int a, b, c;

    MinMax(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int minn() {
        int min = a;

        if (min > b)
            min = b;

        if (min > c)
            min = c;

        return min;
    }

    int maxx() {
        int max = a;

        if (max < b)
            max = b;

        if (max < c)
            max = c;

        return max;
    }
}
