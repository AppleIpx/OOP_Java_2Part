package Task1;

class ChartReportCreator extends ReportCreator {
    @Override
    public Report createReport() {
        return new ChartReport();
    }
}
