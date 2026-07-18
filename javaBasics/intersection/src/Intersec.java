public class Intersec
{
    Intersec(int l1,int l2,int r1,int r2) {
        int left = Math.max(l1, l2);
        int right = Math.min(r1, r2);
        if (left <= right) {
            System.out.println(left + " " + right);
        }
        else
        {
            System.out.println("-1 ") ;
        }
    }


        }