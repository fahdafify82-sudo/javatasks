class Student {
    Student(String name)
    {
        System.out.println("Student constructor");
    }

}
class Teacher extends Student {
    Teacher()
    {
        super("fahd");
        System.out.println("Teacher constructor");
    }
}