public class Charr {
    char a;

    Charr(char a) {
        this.a = a;
    }

    public char nex()
    {
        if (a == 'z')
        {
            return ('a');
        }
        else
        {
            return (char) (a+1);
        }

    }
}
