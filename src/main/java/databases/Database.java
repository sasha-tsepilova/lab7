package databases;

public class Database {
    public БазаДаних db;

    public Database(){
        db = new БазаДаних();
    }
    public Database(БазаДаних db){
        this.db = db;
    }
    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStaticData() {
        return db.отриматиСтатистичніДані();
    }
}
