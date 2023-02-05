package Data6.view;

import java.io.IOException;

import Data6.controller.Controller;

public class CommandSaveTree implements CommandOption {
    
    @Override
    public String discription() {
        return "Сохранить дерево";
    }

    @Override
    public void exec(Controller controller) throws ClassNotFoundException, IOException {
        controller.execSave();
    }
}