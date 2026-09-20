//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    HashMap<Person,String> map=new HashMap<>();
    Person p1=new Person(1,"fahd");
    map.put(p1,"manager");
    Person p2=new Person(2,"fares");
    map.put(p2,"employee");
    Person p3=new Person(3,"software");
    map.put(p3,"manager");
    Person p4=new Person(4,"ai");
    map.put(p4,"yass");
    System.out.println(map.get(p4));
    Person p5=new Person(4,"cs");
    map.put(p5,"manager");

    Person p6=new Person(4,"software");
    System.out.println(map.get(p6));
}
