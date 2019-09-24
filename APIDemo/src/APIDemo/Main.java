package APIDemo;

import Controllers.DefaultPrototypeController;
import view.EditorScreen;
import view.CharactersController;
import view.WeaponsController;

/**
 * @author Carlos Esquivel
 * @author Marco Gamboa
 */
public class Main {
    public static void main(String[] args){
        DefaultPrototypeController.loadDefaultPrototypes();
        EditorScreen screen = new EditorScreen();
        
        screen.setVisible(true);
    } 
}
