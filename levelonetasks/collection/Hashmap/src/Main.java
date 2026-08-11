//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"fahd");
    map.put(2,"samara");
    map.put(3,"rambo");
    map.put(4,"abolo");
    System.out.println(map);
System.out.println(map.get(1));

System.out.println(map.containsKey(2));
System.out.println(map.containsValue("samara"));
}