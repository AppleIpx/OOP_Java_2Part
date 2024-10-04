package Task2;

public interface Pizza {
    void prepare();
}

class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление мясной пиццы с говядиной, беконом и сыром.");
    }
}

class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление вегетарианской пиццы с перцем, грибами и оливками.");
    }
}

class SeafoodPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление пиццы из морепродуктов с креветками, кальмарами и мидиями.");
    }
}

class CheeseTopping implements Topping {
    @Override
    public void add() {
        System.out.println("Добавляем сырную начинку.");
    }
}

class MushroomTopping implements Topping {
    @Override
    public void add() {
        System.out.println("Добавляем грибную начинку.");
    }
}

class SeafoodTopping implements Topping {
    @Override
    public void add() {
        System.out.println("Добавляем топпинг из морепродуктов.");
    }
}

