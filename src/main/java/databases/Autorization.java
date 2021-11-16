package databases;

public class Autorization {
    public Авторизація aut;
    public Autorization(){
        aut = new Авторизація();
    }
    public Autorization(Авторизація aut){
        this.aut = aut;
    }
    public boolean autorize(Database db){
        return aut.авторизуватися(db.db);
    }
}
