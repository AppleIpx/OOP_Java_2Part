package Task7;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new ComputerBuilder("Intel i9", 16, 512)
                .setGraphicsCard("NVIDIA RTX 3080")
                .build();

        System.out.println(myComputer);
    }
}
