package windows;

public class Button extends Composite {
    public Button(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Button:" + getName());
    }
}
