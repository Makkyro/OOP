package Data6.view;

import Data6.controller.Controller;

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