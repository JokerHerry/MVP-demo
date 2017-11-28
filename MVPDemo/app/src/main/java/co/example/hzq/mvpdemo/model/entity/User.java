package co.example.hzq.mvpdemo.model.entity;

/**
 * Created by Hzq on 2017/11/28.
 */

public class User {

    /**
     * name : 郝志强
     * password : 12312312
     */

    private String name;
    private String password;

    public User(String name,String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
