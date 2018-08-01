import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Ivan", 30);
        userService.saveUser(user);
        Auto mazda = new Auto("Mazda", "red");
        mazda.setUser(user);
        user.addAuto(mazda);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }
}
