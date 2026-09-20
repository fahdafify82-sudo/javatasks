public class book <T,N>{
    T name;
    N number;

    public void setName(T name) {
        this.name = name;
    }
    public T getName() {
        return name;
    }
    public void setNumber(N number) {
        this.number = number;
    }
    public N getNumber() {
        return number;
    }
}
