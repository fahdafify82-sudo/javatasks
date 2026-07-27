public class Pyramid {
    int shape;
    Pyramid(int shape)

    {
        this.shape=shape;
    }
    void loopy() {
        for (int i = 1; i <= shape; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    }


