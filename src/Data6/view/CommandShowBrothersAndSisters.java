package Data6.view;

import Data6.controller.Controller;

public class CommandShowBrothersAndSisters implements CommandOption {
    
    @Override
    public String discription() {
        return "Показать братьев и сестер";
    }

    @Override
    public void exec(Controller controller) {
        controller.execShowBrothersAndSisters(controller.getView().requestNodeId()); 
    }

}