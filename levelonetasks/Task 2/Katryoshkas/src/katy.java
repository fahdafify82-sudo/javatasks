class Katryoshka {
    private long eyes;
    private long mouths;
    private long bodies;

    public Katryoshka(long eyes, long mouths, long bodies) {
        this.eyes = eyes;
        this.mouths = mouths;
        this.bodies = bodies;
    }

    public long maxKatryoshkas() {

        long first = Math.min(eyes, Math.min(mouths, bodies));

        eyes -= first;
        mouths -= first;
        bodies -= first;

        long second = Math.min(eyes / 2, bodies);

        return first + second;
    }
}