
import java.util.*;
import java.util.stream.*;

public class Main {

    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        // Question 1
        String input = "swiss";

        Character first = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst().orElse(null);

        System.out.println(first);


        // Question 2
        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .distinct().sorted()
                .collect(Collectors.toList());

        System.out.println(duplicates);


        // Question 3
        List<Integer> nums3 =
                Arrays.asList(10, 5, 20, 20, 8, 15, 10);

        System.out.println(nums3.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(null));


        // Question 4
        String sentence = "Java Spring Java Hibernate Spring Java";

        Map<String, Long> words = Arrays.stream(sentence.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(
                        w -> w, LinkedHashMap::new, Collectors.counting()));

        words.forEach((w, count) -> System.out.println(w + "=" + count));


        // Question 5
        List<String> wordList = Arrays.asList(
                "Java", "SpringBoot", "Microservices",
                "Hibernate", "Docker");

        System.out.println(wordList.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null));


        // Question 6
        List<Employee> employees = Arrays.asList(
                new Employee("Ahmed", "IT", 10000),
                new Employee("Mohamed", "IT", 15000),
                new Employee("Sara", "HR", 8000),
                new Employee("Omar", "HR", 12000),
                new Employee("Ali", "Finance", 20000)
        );

        employees.stream()
                .collect(Collectors.groupingBy(e -> e.department))
                .forEach((dept, list) ->
                        System.out.println(dept + " = " +
                                list.stream().mapToDouble(e -> e.salary)
                                        .average().orElse(0)));


        // Question 7
        List<Employee> employees2 = Arrays.asList(
                new Employee("Ahmed", "IT", 10000),
                new Employee("Mohamed", "IT", 18000),
                new Employee("Sara", "HR", 9000),
                new Employee("Omar", "HR", 14000),
                new Employee("Ali", "Finance", 20000)
        );

        employees2.stream()
                .collect(Collectors.groupingBy(e -> e.department))
                .forEach((dept, list) ->
                        System.out.println(dept + " = " +
                                list.stream()
                                        .max(Comparator.comparingDouble(e -> e.salary))
                                        .get().name));


        // Question 8
        List<Integer> list1 =
                Arrays.asList(1, 2, 3, 4, 5, 6, 3);
        List<Integer> list2 =
                Arrays.asList(4, 5, 6, 7, 8, 4);

        System.out.println(list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList()));


        // Question 9
        List<Integer> nums9 = Arrays.asList(
                1, 2, 2, 3, 3, 3, 4, 4, 4, 4,
                5, 5, 5, 6);

        Map<Integer, Long> frequency = nums9.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        frequency.entrySet().stream()
                .sorted(Comparator.<Map.Entry<Integer, Long>>comparingLong(
                                e -> e.getValue()).reversed()
                        .thenComparing(e -> e.getKey()))
                .limit(3)
                .forEach(e -> System.out.println(
                        e.getKey() + " = " + e.getValue() + " occurrences"));


        // Question 10
        List<Employee> employees3 = Arrays.asList(
                new Employee("Ahmed", "IT", 10000),
                new Employee("Mohamed", "IT", 18000),
                new Employee("Ali", "IT", 15000),
                new Employee("Omar", "IT", 22000),
                new Employee("Sara", "HR", 12000),
                new Employee("Mona", "HR", 16000),
                new Employee("Nour", "HR", 14000),
                new Employee("Hana", "HR", 9000),
                new Employee("Khaled", "Finance", 20000),
                new Employee("Youssef", "Finance", 25000),
                new Employee("Mostafa", "Finance", 18000)
        );

        employees3.stream()
                .collect(Collectors.groupingBy(e -> e.department))
                .forEach((dept, list) -> {
                    System.out.println(dept + ":");

                    list.stream()
                            .sorted(Comparator.comparingDouble(
                                            (Employee e) -> e.salary).reversed()
                                    .thenComparing(e -> e.name))
                            .limit(3)
                            .forEach(e -> System.out.println(
                                    e.name + " " + e.salary));
                });
    }
}

