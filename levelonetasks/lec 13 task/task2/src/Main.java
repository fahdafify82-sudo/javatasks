//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Person p1 =new Person(1,"fahd");
    Person p2 =new Person(1,"fares");
    Person p3 =new Person(1,"fahd");
    Person p4 =new Person(4,"fahd");
    Person p5 =new Person(5,"fahd");
    Person p6 =new Person(6,"fahd");
    Person p7 =new Person(7,"fahd");
    Person p8 =new Person(8,"fahd");
    Person p9 =new Person(9,"fahd");
    Person p10 =new Person(10,"fahd");
    Set<Person>set = new HashSet<>();
    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);
    set.add(p5);
    set.add(p6);
    set.add(p7);
    set.add(p8);
    set.add(p9);
    set.add(p10);

    System.out.println(set.size());

}
