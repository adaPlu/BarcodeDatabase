
public class Main {
    public static void main(String args[]) {
        barcodeDatabase db = new barcodeDatabase();
        createNewDatabase("C:/Users/plugu/Documents/Main/CSE111/Project","test.db");

        db.openConnection("data/inventory.sqlite");

        db.dropTable();
       //db.createTable();
        db.populateTable();

        db.Q1();
        db.Q2();
        db.Q3();
        db.Q4();
        db.Q5();

        db.closeConnection();
    }
}
