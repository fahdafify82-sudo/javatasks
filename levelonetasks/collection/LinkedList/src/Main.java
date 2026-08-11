//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    LinkedList<String> names=new LinkedList<>();
    names.add("John");
    names.add("fares");
    names.add("abolo");
    System.out.println(names);
    names.addFirst("hala");
    System.out.println(names);
    names.addLast("yasser");
    System.out.println(names);
    names.add(2,"noha");
    System.out.println(names);
    names.removeLast();
    System.out.println(names);

    names.offer("fahd");
    System.out.println(names);

    names.pop();
    System.out.println(names);

}
