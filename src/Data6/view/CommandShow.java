package Data6.view;

import Data6.controller.Controller;

public class CommandShow implements CommandOption {
    
    @Override
    public String discription() {
        return "Просмотр дерева";
    }

    @Override
    public void exec(Controller controller) {
        controller.execShow(); 
    }
}