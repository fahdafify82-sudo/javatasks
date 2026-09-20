public class Person {
    private int id;
    private String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {

        if(this==obj)
            return true;
        if(!(obj instanceof Person)){
            return false;
        }
        Person person = (Person)obj;
        return this.id==person.id && this.name==person.name;/* هنا بعمل باو الاسمid ممكن بالid بس*/

    }
    @Override
    public int hashCode()
    {
        return Integer.hashCode(id);
    }
}
