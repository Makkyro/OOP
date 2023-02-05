package Data5.views;

import Data5.controllers.UserController;
import Data5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }
    public String numId = "";

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            try {
                switch (com) {
                    case CREATE:
                        String firstName = prompt("Имя: ");
                        String lastName = prompt("Фамилия: ");
                        String phone = prompt("Номер телефона: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> ls = userController.readList();
                        ls.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        numId = prompt("Какого пользователя редактировать? Введите ID: ");
                        userController.idPresenceValidation(numId);
                        userController.updateUser(numId, createAGay());
                        break;
                    case DELETE:
                        numId = prompt("Какого пользователя удалить? Введите ID: ");
                        userController.idPresenceValidation(numId);
                        userController.deleteUser(numId, deleteAGay());
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ooopsie\n" + e.getMessage());;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createAGay() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        User newGuy = new User(firstName, lastName, phone);
        return newGuy;
    }

    private User deleteAGay() {
        User deleteGuy = new User("-","-", "-");
        return deleteGuy;
    }
}