package view;

import ADT.DefaultCharacterAppearance;
import ADT.DefaultWeaponAppearance;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.FileFilter;

/**
 *
 * @author Carlos Esquivel
 */
public class AppearanceDialogController implements ActionListener {
    
    public static final int CHARACTER_MODE = 1;
    public static final int WEAPON_MODE = 2;
    
    private EditorScreenController controllerParent;
    private int selectedMode;
    private int selectedLvl;
    private List<String> imgPaths;
   
    private JDialog screen;
    
    public AppearanceDialogController(EditorScreenController controllerParent, JFrame parent, int mode) {
        this.controllerParent = controllerParent;
        selectedMode = mode;
        switch (mode) {
            case CHARACTER_MODE:
                screen = new CharAppearanceDialog(parent);
                break;
            case WEAPON_MODE:
                screen = new WeaponAppearanceDialog(parent);
                break;
            default:
                throw new IllegalArgumentException("Invalid Dialog mode");
        }
        setupActionListeners();
        screen.setVisible(true);
    }

    private void setupActionListeners() {
        if (selectedMode == WEAPON_MODE) {
            WeaponAppearanceDialog dialog = (WeaponAppearanceDialog) this.screen;
            dialog.btnDefault.addActionListener(this);
            dialog.btnCancel.addActionListener(this);
            dialog.btnOk.addActionListener(this);
        }
        else {
            CharAppearanceDialog dialog  = (CharAppearanceDialog) this.screen;
            dialog.btnDefault.addActionListener(this);
            dialog.btnAttack.addActionListener(this);
            dialog.btnDefend.addActionListener(this);
            dialog.btnWalk.addActionListener(this);
            dialog.btnLowHealth.addActionListener(this);
            dialog.btnHurt.addActionListener(this);
            dialog.btnCancel.addActionListener(this);
            dialog.btnOk.addActionListener(this);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "Cancel":
                screen.dispose();
                break;
            case "OK":
                getLevel();
                if (!getAppearanceOverwriteConfirmation())
                    break;
                
                if (selectedMode == CHARACTER_MODE) {
                    getPaths_Char();
                    controllerParent.addCharAppearance(selectedLvl, new DefaultCharacterAppearance(imgPaths));
                }
                else { 
                    getPaths_Weapon();
                    controllerParent.addWeaponAppearance(selectedLvl, new DefaultWeaponAppearance(imgPaths));
                }
                screen.dispose();
                break;
                
            default:
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileFilter("png", "PNG Image"));
                int result = fileChooser.showOpenDialog(screen);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String path = fileChooser.getSelectedFile().getAbsolutePath();
                    System.out.println("File directory: " + path);
                    if (selectedMode == CHARACTER_MODE)
                        showPath_Char(e.getActionCommand(), path);
                    else
                        showPath_Weapon(e.getActionCommand(), path);
                }

        }
    }
    
    private void showPath_Char(String button, String path) {
        CharAppearanceDialog dialog  = (CharAppearanceDialog) this.screen;
        switch(button) {
            case "DEFAULT":
                dialog.lblDefaultPath.setText(path);
                break;
            case "ATTACK":
                dialog.lblAttackPath.setText(path);
                break;
            case "DEFEND":
                dialog.lblDefendPath.setText(path);
                break;  
            case "WALK":
                dialog.lblWalkPath.setText(path);
                break;
            case "LOWHEALTH":
                dialog.lblLowHealthPath.setText(path);
                break;
            case "HURT":
                dialog.lblHurtPath.setText(path);
                break;
        }
    }
    
    private void showPath_Weapon(String button, String path) {
        WeaponAppearanceDialog dialog = (WeaponAppearanceDialog) this.screen;
        switch(button) {
            case "DEFAULT":
                dialog.lblDefaultPath.setText(path);
                break;
        }
    }
    
    private boolean getAppearanceOverwriteConfirmation() {
        boolean check;

        if (selectedMode == CHARACTER_MODE)
            check = controllerParent.checkCharAppearance(selectedLvl);
        else
            check = controllerParent.checkWeaponAppearance(selectedLvl);
        
        boolean confirmation = true;
        if (check) {
            int result =
                JOptionPane.showOptionDialog(screen, "An Appearance of this Level already exists. Overwrite?",
                                             "Add New Appearance", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
                                             null, null, null);
            if (result == JOptionPane.NO_OPTION)
                confirmation = false;
        }
        return confirmation;
    }
    
    private void getLevel() {
        if (selectedMode == CHARACTER_MODE)
            selectedLvl = (int) ((CharAppearanceDialog) screen).spnLevel.getValue();
        else
            selectedLvl = (int) ((WeaponAppearanceDialog) screen).spnLevel.getValue();
    }
    
    private void getPaths_Char() {
        CharAppearanceDialog dialog  = (CharAppearanceDialog) this.screen;
               
        imgPaths = new ArrayList<>();
        imgPaths.add(dialog.lblDefaultPath.getText());
        imgPaths.add(dialog.lblAttackPath.getText());
        imgPaths.add(dialog.lblDefendPath.getText());
        imgPaths.add(dialog.lblWalkPath.getText());
        imgPaths.add(dialog.lblLowHealthPath.getText());
        imgPaths.add(dialog.lblHurtPath.getText());
    }
    
    private void getPaths_Weapon() {
        WeaponAppearanceDialog dialog = (WeaponAppearanceDialog) this.screen;
        
        selectedLvl = (int) dialog.spnLevel.getValue();
        
        imgPaths = new ArrayList<>();
        imgPaths.add(dialog.lblDefaultPath.getText());
    }
}