package Task1;


public class Main {
    public static void main(String[] args) {
        ReportCreator creator;

        creator = new ChartReportCreator();
        creator.generateReport();

        creator = new TableReportCreator();
        creator.generateReport();

        creator = new TextReportCreator();
        creator.generateReport();
    }
}