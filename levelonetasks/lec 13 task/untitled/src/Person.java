public class Person {

    private String name;
    private int id;
    public Person( int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if(!(obj instanceof Person))
        {
            return false;
        }
        Person person=(Person)obj;
        return person.id==this.id;
    }
}
