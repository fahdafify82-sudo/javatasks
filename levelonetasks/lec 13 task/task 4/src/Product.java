public class Product {
    private int code;
    private int price;
Product(int code, int price) {
    this.code = code;
    this.price = price;
}

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(!(obj instanceof Product))
            return false;
        Product p=(Product)obj;
        return p.code==this.code;
    }
    @Override
    public int hashCode() {
    return Integer.hashCode(code);
    }
}
