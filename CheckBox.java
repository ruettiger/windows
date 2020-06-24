package windows;

public class CheckBox extends Composite {
    public CheckBox(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("CheckBox:" + getName());
    }
}
