package Task7;

public class ComputerBuilder {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard = "Integrated"; // Значение по умолчанию

    public ComputerBuilder(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public Computer build() {
        return new Computer(this);
    }
}
