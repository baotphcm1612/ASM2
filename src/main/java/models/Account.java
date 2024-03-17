package models;

public class Account {

    private int id;
    private String username;
    private String pass;
    private int type;

    public static final int LECTURER = 0;
    public static final int OFFICER = 1;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Account() {}

    public Account(String username, String pass, int type) {
        this.setUsername(username);
        this.setPass(pass);
        this.setType(type);
    }

    public Account(String username) {
        this.setUsername(username);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = 1;
        }
        if(id <= 0) {
            this.id = 0;
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
