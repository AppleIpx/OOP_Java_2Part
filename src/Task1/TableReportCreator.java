package Task1;

class TableReportCreator extends ReportCreator {
    @Override
    public Report createReport() {
        return new TableReport();
    }
}
