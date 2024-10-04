package Task2;

public class PizzaStore {
    private Pizza pizza;
    private Topping topping;

    public PizzaStore(PizzaFactory factory) {
        pizza = factory.createPizza();
        topping = factory.createTopping();
    }

    public void orderPizza() {
        pizza.prepare();
        topping.add();
    }
}
