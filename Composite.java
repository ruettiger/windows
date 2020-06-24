package windows;

public abstract class Composite {
    private String name;

    protected Composite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void add(Composite composite) {
    }

    protected void remove(Composite composite) {
    }

    protected abstract void print();

}
