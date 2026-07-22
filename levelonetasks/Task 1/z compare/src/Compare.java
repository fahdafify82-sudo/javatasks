 class Compare {
    int num1,num2,num3,num4;
    Compare(int num1,int num2,int num3,int num4)
    {
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
    }
    void log()
    {
        double pown1=Math.log(num1)*num2;
        double pown2=Math.log(num3)*num4;
        if(pown1>pown2)
        {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }

    }
}
