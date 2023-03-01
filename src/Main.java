
public class Main {
    public static void main(String[] args){

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "ivangorbachev";
        String password = "admin";

        Admin admin = new Admin(url, user, password);
        admin.addFilm("HP", "F", 100);
        Integer res = admin.getUUID("films", admin.connection);
        System.out.println(res);
    }
}