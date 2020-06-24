package windows;

import java.util.ArrayList;

public class Window extends Composite {
    ArrayList<Composite> composites = new ArrayList<Composite>();

    public Window(String name) {
        super(name);
    }

    @Override
    public void add(Composite composite) {
        composites.add(composite);
    }

    @Override
    public void remove(Composite composite) {
        composites.remove(composite);
    }

    @Override
    public void print() {
        System.out.println("-------------------------Window:"+getName()+"-----------------------------------------");
        for (Composite composite : composites) {
            composite.print();
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
