public interface DataExporter {
    void exportCSV();
    void exportPDF();
    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}