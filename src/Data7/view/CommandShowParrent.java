package Data7.view;

import Data7.controller.Controller;

public class CommandShowParrent implements CommandOption {
    
    @Override
    public String discription() {
        return "Показать родителей";
    }

    @Override
    public void exec(Controller controller) {
        controller.execShowParents(controller.getView().requestNodeId()); 
    }

}