package BehavioralDesignPattern.ChainOfResponsibility;

import javax.xml.crypto.Data;

public class RoleCheckerHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Admin user");
            return true;
        }
        System.out.println("Normal user");
        return handleNext(username,password);
    }
}
