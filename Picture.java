package windows;

public class Picture extends Composite {
    public Picture(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Picture:" + getName());
    }
}
