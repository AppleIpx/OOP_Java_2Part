package Task1;

abstract class ReportCreator {
    public abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}
