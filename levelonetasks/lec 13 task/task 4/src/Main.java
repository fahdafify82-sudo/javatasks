//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Product p1=new Product(21423,54);
Product p2=new Product(21421,54);
Product p3=new Product(21423,544);
Product p4=new Product(21421,55);
Product p5=new Product(21421,53);
HashSet<Product>set=new HashSet<>();
set.add(p1);
set.add(p2);
set.add(p3);
set.add(p4);
set.add(p5);
System.out.println(set.size());
}
