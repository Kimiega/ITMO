package cmd;

import collection.UserToken;
import exceptions.MaxLenUserException;
import ioManager.ConsoleManager;

public class LoginCommand {
    public static UserToken login(){
        UserToken user = null;
        while (true) {
            try {
                System.out.print("Enter login:");
                String login = ConsoleManager.getInstance().readline();
                System.out.print("Enter password:");
                String password = ConsoleManager.getInstance().readPassword();
                user = new UserToken(login, password);
            } catch (MaxLenUserException ex) {
                System.err.println("Длина логина или пароля должна быть меньше или равна 128 символов!");
                continue;
            }
            break;
        }
        return user;
    }
}
