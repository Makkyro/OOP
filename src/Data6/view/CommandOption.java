package Data6.view;

import java.io.IOException;

import Data6.controller.Controller;

public interface CommandOption {
    String discription();
    void exec(Controller controller) throws ClassNotFoundException, IOException;
}