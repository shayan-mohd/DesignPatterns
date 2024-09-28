package BehavioralDesignPattern.ChainOfResponsibility;

public class Main {

    public static void main(String[] arg) {
        Database database = new Database();
        Handler handler = new UsernameHandler(database);

        handler.setNextHandler(new PasswordHandler(database)).setNextHandler(new RoleCheckerHandler());

        handler.handle("admin_username", "admin_password");
        System.out.println("================================================");
        handler.handle("useeername", "password");
        System.out.println("================================================");
        handler.handle("username", "password");
        System.out.println("================================================");
        handler.handle("admin_username", "password");
    }
}
