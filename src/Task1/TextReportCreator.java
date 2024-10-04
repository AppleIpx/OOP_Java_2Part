package Task1;

class TextReportCreator extends ReportCreator {
    @Override
    public Report createReport() {
        return new TextReport();
    }
}
