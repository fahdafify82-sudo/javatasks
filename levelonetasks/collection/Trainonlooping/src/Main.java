//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
Set <Integer> set=new LinkedHashSet<>();
System.out.println("Enter num of ids");
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
System.out.println("Enter the id");
for (int i=0;i<id;i++) {
    int ids=sc.nextInt();
    set.add(ids);
}
System.out.println(set);
System.out.println("Enter num of set"+set.size());
}
