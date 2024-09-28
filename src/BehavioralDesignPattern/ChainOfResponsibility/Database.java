package BehavioralDesignPattern.ChainOfResponsibility;

import java.util.HashMap;

public class Database {

    private HashMap<String, String> map;

    public Database() {
        map = new HashMap<>();
        map.put("username", "password");
        map.put("admin_username", "admin_password");
    }

    public boolean isValidUsername(String username) {
        return map.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return map.get(username).equals(password);
    }
}
