/*
هنا عملت كلاس وعملت اكستند من الاكسبشن وبعدها عمل ميثود ترمي اكسبشن فالكلاس وبعدها عملت تراي وكاتش
 */
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner input=new Scanner(System.in);
int age = input.nextInt();
try
{
    checkage(age);
}
catch(InvalidAgeException message)
{
    System.out.println(message.getMessage());
}

}
void checkage(int age) throws InvalidAgeException {
    if (age < 18) {
        throw new InvalidAgeException("Invalid age");
    }
    System.out.println("vaild age");
}