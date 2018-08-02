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
        Auto nissan = new Auto("Nissan", "white");
        ford.setUser(user);
        user.addAuto(nissan);
        Auto bmw = new Auto("BMW", "black");
        ford.setUser(user);
        user.addAuto(bmw);
        userService.updateUser(user);
        user.setName("Alex");
        userService.updateUser(user);
        user.setAge(17);
        userService.updateUser(user);
        user.setName("Boris");
        userService.updateUser(user);
        user.setAge(42);
        userService.deleteUser(user);
        userService.deleteUser(user);
    }
}
