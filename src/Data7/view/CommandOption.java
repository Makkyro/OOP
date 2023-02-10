package Data7.view;

import java.io.IOException;

import Data7.controller.Controller;

public interface CommandOption {
    String discription();
    void exec(Controller controller) throws ClassNotFoundException, IOException;
}