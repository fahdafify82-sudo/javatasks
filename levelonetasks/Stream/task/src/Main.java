import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Comparator;

void main() {
    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
    List<Student> students = Arrays.asList(
            new Student("Ali", "IT", 85),
            new Student("Mona", "CS", 92),
            new Student("Ahmed", "IT", 60),
            new Student("Sara", "CS", 70),
            new Student("Omar", "IS", 45),
            new Student("Laila", "IS", 78)
    );
    List<Employee> employees = Arrays.asList(
            new Employee("Ali", 30, "HR", 5000),
            new Employee("Mona", 25, "IT", 7000),
            new Employee("Ahmed", 30, "HR", 5500),
            new Employee("Sara", 27, "IT", 7200),
            new Employee("Omar", 40, "Finance", 8000),
            new Employee("Laila", 35, "Finance", 8200)
    );
    List<List<String>> nestedWords = Arrays.asList(
            Arrays.asList("Java", "Stream"),
            Arrays.asList("API", "Lambda"),
            Arrays.asList("FlatMap", "Map")
    );
     numbers.stream().filter(n-> n%2==0).forEach(System.out::println);
     names.stream().filter(name->name !=null).filter(name-> name.startsWith("A")).forEach(System.out::println);
     names.stream().filter(name->name!=null).map(String::toUpperCase).forEach(System.out::println);
numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

/*numbers.stream().distinct().forEach(System.out::println);*/

names.stream().filter(name->name!=null).filter(name->name.length()>5).count();
boolean div=numbers.stream().anyMatch(n->n%5==0);
System.out.println(div);
numbers.stream().forEach(System.out::println);
System.out.println("======");
numbers.stream().collect(Collectors.toSet()).forEach(System.out::println);
numbers.stream().skip(3).forEach(System.out::println);
int sum =numbers.stream().reduce(0,(a,b)->a+b);
System.out.println(sum);
int max=numbers.stream().max(Integer::compare).get();
System.out.println(max);
int min=numbers.stream().min(Integer::compare).get();
System.out.println(min);
double avg=numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
int mult=numbers.stream().reduce(1,(acc,b)->acc*b);
System.out.println(mult);
numbers.stream().filter(n->n>0).forEach(System.out::println);
Map<String,List<Student>> result=students.stream().collect(Collectors.groupingBy(Student::getDepartment));
Map <Boolean,List<Integer>>Partlist=numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("even"+Partlist.get(true));
        System.out.println("odd"+Partlist.get(false));
       String  joiin=names.stream().filter(name->name!=null&&!name.isEmpty()).collect(Collectors.joining(","));
       Map<Integer,Long>byage=employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
       System.out.println(byage);
       Map<String,Double>sala=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
       System.out.println(sala);
       List<String >newlist=nestedWords.stream().flatMap(list->list.stream()).collect(Collectors.toList());
       Set<Character>set=nestedWords.stream().flatMap(list->list.stream()).flatMap(word->word.chars().mapToObj(c->(char)c)).collect(Collectors.toSet());
    Map<String, Integer> nameLengths = names.stream()
            .filter(name -> name != null)
            .collect(Collectors.toMap(
                    name -> name,
                    name -> name.length()
            ));
    List<String>liis=names.stream().filter(name -> name != null&&name.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
List<Employee>empsort=employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());
empsort.forEach(employe->System.out.println(employe.getSalary()+" ==="+employe.getName()));

Map<String,Integer>lengh=names.stream().filter(n->n!=null).collect(Collectors.toMap(n->n,n->n.length()));

Optional<Integer>secnum=numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
System.out.println(secnum);
Set<Integer>liss=numbers.stream().filter(n->Collections.frequency(numbers,n)>1).collect(Collectors.toSet());
List<String>nonnull=names.stream().filter(n->n!=null&&!names.isEmpty()).collect(Collectors.toList());
System.out.println(nonnull);
Map<Boolean,List<Student>>pass=students.stream().collect(Collectors.partitioningBy(s->s.getGrade()>=50));
System.out.println("pass");
pass.get(true).forEach(s->System.out.println(s.getName()));
System.out.println("fall");
pass.get(false).forEach(s->System.out.println(s.getName()));

}
