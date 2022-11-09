public class books {
    public String name;

    public books(String name) {
        this.name = name;
    }
    public int pages(){
        return 0;
    }

    public String getName() {
        return name;
    }
}
class nim extends books{
    public nim() {
        super("nim");
    }

    @Override
    public int pages() {
        return 100;
    }
}
class mic extends books{
    public mic() {
        super("bob");
    }

    @Override
    public int pages() {
        return 500;
    }
}
