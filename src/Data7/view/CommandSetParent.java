package Data7.view;

import Data7.controller.Controller;

public class CommandSetParent implements CommandOption {
    
    @Override
    public String discription() {
        return "Добавить родителя";
    }

    @Override
    public void exec(Controller controller) {
        controller.execSetParent(controller.getView().setParentForm());
    }
}