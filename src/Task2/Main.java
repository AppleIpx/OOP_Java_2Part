package Task2;

public class Main {
    public static void main(String[] args) {
        PizzaFactory meatPizzaFactory = new MeatPizzaFactory();
        PizzaStore meatStore = new PizzaStore(meatPizzaFactory);
        meatStore.orderPizza();
        System.out.println();

        PizzaFactory veggiePizzaFactory = new VeggiePizzaFactory();
        PizzaStore veggieStore = new PizzaStore(veggiePizzaFactory);
        veggieStore.orderPizza();
        System.out.println();

        PizzaFactory seafoodPizzaFactory = new SeafoodPizzaFactory();
        PizzaStore seafoodStore = new PizzaStore(seafoodPizzaFactory);
        seafoodStore.orderPizza();
    }
}
