//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

Set <Integer> set=new HashSet<>();
set.add(3);
set.add(4);
set.add(5);
set.add(6);
set.add(9);
System.out.println(set);
set.remove(3);
System.out.println(set);
System.out.println(set.contains(6));

}
