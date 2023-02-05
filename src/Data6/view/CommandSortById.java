package Data6.view;

import Data6.controller.Controller;

public class CommandSortById implements CommandOption {
    
    @Override
    public String discription() {
        return "Сортировка дерева по ID";
    }

    @Override
    public void exec(Controller controller) {
        controller.execSortById(); 
    }
}