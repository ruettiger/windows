package windows;

public class Label extends Composite {
    public Label(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println("Label:" + getName());
    }
}
