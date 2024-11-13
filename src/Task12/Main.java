package Task12;

public class Main {
    public static void main(String[] args) {
        MenuComponent menu = new MenuCategory("Меню ресторана");

        MenuComponent pastaMenu = new MenuCategory("Паста");
        pastaMenu.add(
                new Dish(
                        "Спагетти Болоньезе",
                        "Спагетти с мясным соусом",
                        12.99,
                        false
                )
        );
        pastaMenu.add(
                new Dish(
                        "Вегетарианская карбонара",
                        "Паста с вегетарианским соусом",
                        11.99,
                        true
                )
        );

        MenuComponent dessertMenu = new MenuCategory("Десерты");
        dessertMenu.add(
                new Dish(
                        "Тирамису",
                        "Итальянский десерт с кофе",
                        5.99,
                        true
                )
        );

        menu.add(pastaMenu);
        menu.add(dessertMenu);

        menu.print();
    }
}
