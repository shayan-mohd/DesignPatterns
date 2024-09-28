package BehavioralDesignPattern.ChainOfResponsibility;

public class PasswordHandler extends Handler {

    private Database database;

    public PasswordHandler(Database database) {
        this.database = database;
    }
    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong password");
            return false;
        }
        System.out.println("Password verified");
        return handleNext(username, password);
    }
}
