package windows;

public class PasswordBox extends Composite {
    public PasswordBox(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("PasswordBox:" + getName());
    }
}
