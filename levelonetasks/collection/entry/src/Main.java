//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
int count=0;    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
  Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Map<Integer,Integer> map = new HashMap<>();
for (int i = 1; i <= n; i++) {
 int a=sc.nextInt();
 int b=sc.nextInt();
 map.put(a,b);
}
int x=sc.nextInt();
for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
    if(entry.getValue()>x) {
        count++;
    }
}
System.out.println(count);
}
