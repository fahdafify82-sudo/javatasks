//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Set<Integer> set=new TreeSet<>();
    set.add(6);
    set.add(3);
    set.add(2);
    set.add(1);
    System.out.println(set);
    set.remove(3);
    System.out.println(set);
   System.out.println(set.lower(20));
}
