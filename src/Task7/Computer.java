package Task7;

public class Computer {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    protected Computer(ComputerBuilder builder) {
        this.processor = builder.getProcessor();
        this.ram = builder.getRam();
        this.storage = builder.getStorage();
        this.graphicsCard = builder.getGraphicsCard();
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

    @Override
    public String toString() {
        return "Computer {" +
                "Processor='" + processor + '\'' +
                ", RAM=" + ram + " GB" +
                ", Storage=" + storage + " GB" +
                ", GraphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
