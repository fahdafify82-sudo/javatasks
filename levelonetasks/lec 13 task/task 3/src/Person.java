public class Person {
    private  String name;
    private int id;
    public Person( int id,String name) {
    this.name = name;
    this.id = id;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Person))
            return false;

        Person n = (Person) obj;
        return this.id == n.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
