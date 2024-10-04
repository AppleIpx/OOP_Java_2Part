package Task2;

class MeatPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MeatPizza();
    }

    @Override
    public Topping createTopping() {
        return new CheeseTopping();
    }
}

class VeggiePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }

    @Override
    public Topping createTopping() {
        return new MushroomTopping();
    }
}

class SeafoodPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new SeafoodPizza();
    }

    @Override
    public Topping createTopping() {
        return new SeafoodTopping();
    }
}
