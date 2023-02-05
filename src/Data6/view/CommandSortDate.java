package Data6.view;

import Data6.controller.Controller;

public class CommandSortDate implements CommandOption {
    
    @Override
    public String discription() {
        return "Сортировка дерева по дате рождения";
    }

    @Override
    public void exec(Controller controller) {
        controller.execSortByDate(); 
    }
}