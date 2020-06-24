package windows;

public class TextBox extends Composite {
    public TextBox(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("TextBox:" + getName());
    }
}
