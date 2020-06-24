package windows;

public class LinkLable extends Composite {
    public LinkLable(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("LinkLable:" + getName());
    }
}
