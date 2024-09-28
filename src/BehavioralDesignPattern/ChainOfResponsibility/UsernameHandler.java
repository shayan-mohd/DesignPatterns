package BehavioralDesignPattern.ChainOfResponsibility;

public class UsernameHandler extends Handler {

    private Database database;

    public UsernameHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUsername(username)) {
            System.out.println("Incorrect username");
            return false;
        }
        System.out.println("Username verified");
        return handleNext(username, password);
    }
}
