//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter num ");
  int num = sc.nextInt();

  Map<Integer,String> map = new LinkedHashMap<>();
  for (int i = 0; i < num; i++)
  {
    System.out.println("Enter id");
    int id=sc.nextInt();
    System.out.println("enter name");
    String name=sc.next();
   map.put(id,name);
  }
  System.out.println(map);
  System.out.println("enter id to search");
  int id=sc.nextInt();
 if(map.containsKey(id))
 {
     System.out.println(map.get(id));
 }
else
{
  System.out.println("id not found");
}
}
