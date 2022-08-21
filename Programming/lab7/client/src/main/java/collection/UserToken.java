package collection;

import exceptions.MaxLenUserException;

import java.io.Serializable;

public class UserToken implements Serializable {
    private final String login;
    private final String password;

    public UserToken(String login, String password) throws MaxLenUserException{
        if (login.length()>128 || password.length()>128)
            throw new MaxLenUserException();
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
