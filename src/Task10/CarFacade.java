package Task10;

public class CarFacade {

    private final Engine engine;
    private final ClimateControl climateControl;
    private final MusicSystem musicSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.climateControl = new ClimateControl();
        this.musicSystem = new MusicSystem();
    }

    public void startCar(int temperature, String musicTrack) {
        engine.start();
        climateControl.turnOn();
        climateControl.setTemperature(temperature);
        musicSystem.playMusic(musicTrack);
        System.out.println("Автомобиль готов к поездке!");
    }

    public void stopCar() {
        musicSystem.stopMusic();
        climateControl.turnOff();
        engine.stop();
        System.out.println("Автомобиль остановлен.");
    }
}

