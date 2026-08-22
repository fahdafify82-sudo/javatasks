//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int [] grade={2,3,4,5,6};
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    try
    {
        System.out.println(grade[n]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
}
/*
هنا عملت كاتش تمسك لو اليوزر دخل رقم اكبر من عدد الarray
 */
