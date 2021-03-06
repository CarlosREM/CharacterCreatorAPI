package view;

import controllers.CharactersController;
import controllers.WeaponsController;
import controllers.SimulationController;
import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Carlos Esquivel
 */
public class EditorScreen extends javax.swing.JFrame {
    
    javax.swing.JPanel contentPane = new javax.swing.JPanel();
    
    javax.swing.JTabbedPane tabbedPane;
    CharactersTab charactersTab;
    WeaponsTab weaponsTab;
    SimulationTab simulationTab;
    
    public CharactersTab getCharactersTab() { return charactersTab; }
    public WeaponsTab getWeaponsTab() { return weaponsTab; }
    public SimulationTab getSimulationTab() { return simulationTab; }
    
    public EditorScreen() {
        initComponents();
        setupControllers();
    }
    
    private void initComponents() {
        setTitle("Editor Screen test");
	setResizable(false);
	setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 876, 649);
	contentPane = new javax.swing.JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
	contentPane.setBorder(null);
	contentPane.setLayout(null);

        setContentPane(contentPane);
        
        tabbedPane = new javax.swing.JTabbedPane();
        tabbedPane.setBounds(0, 0, 870, 614);
        
        charactersTab = new CharactersTab();
        tabbedPane.add(charactersTab, "Characters");
        
        weaponsTab = new WeaponsTab();
        tabbedPane.add(weaponsTab, "Weapons");
        
        simulationTab = new SimulationTab();
        tabbedPane.add(simulationTab, "Simulation");
        
        contentPane.add(tabbedPane);
    }
    
    private void setupControllers() {
        CharactersController charController = new CharactersController(charactersTab);
        WeaponsController weaponController = new WeaponsController(weaponsTab);
        charController.setWeaponList(weaponController.getWeaponClassesModel());
        SimulationController simController = new SimulationController(simulationTab);
        simController.setcmBxModelCharacters(charController.getCharClasses());
        
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                if (tabbedPane.getSelectedIndex() < 2) {
                    try {
                        simController.clear();
                    }
                    catch(Exception ex) {}
                }
            }
        });
    }
    
}
