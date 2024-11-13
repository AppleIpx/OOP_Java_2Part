package Task10;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();

        car.startCar(22, "Любимый трек");

        System.out.println("Поездка в процессе...");

        car.stopCar();
    }
}
