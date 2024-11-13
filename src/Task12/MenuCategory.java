package Task12;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;

    public MenuCategory(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println("--------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
