import analytics.ReportBuilder;
import databases.Autorization;
import databases.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Autorization aut = new Autorization();
        if (aut.autorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
