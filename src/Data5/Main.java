package Data5;

import Data5.controllers.UserController;
import Data5.model.FileOperation;
import Data5.model.FileOperationImpl;
import Data5.model.Repository;
import Data5.model.RepositoryFile;
import Data5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}