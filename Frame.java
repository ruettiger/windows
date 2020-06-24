package windows;

import java.util.ArrayList;

public class Frame extends Composite {
    ArrayList<Composite> composites = new ArrayList<Composite>();

    public Frame(String name) {
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
        System.out.println("------------------------Frame:"+getName()+"---start---------------------------");
        for (Composite composite : composites) {
            composite.print();
        }
        System.out.println("------------------------Frame:"+getName()+"---end-----------------------------");
    }
}
