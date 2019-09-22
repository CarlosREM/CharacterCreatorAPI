/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author carlo
 */
public class CharAppearanceDialog extends javax.swing.JDialog {
    
    /**
     * Creates new form CharAppearanceDialog
     */
    public CharAppearanceDialog(java.awt.Frame parent) {
        super(parent, true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInstruction1 = new javax.swing.JLabel();
        btnDefault = new javax.swing.JButton();
        btnAttack = new javax.swing.JButton();
        btnDefend = new javax.swing.JButton();
        btnWalk = new javax.swing.JButton();
        btnLowHealth = new javax.swing.JButton();
        btnHurt = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        lblDefaultPath = new javax.swing.JLabel();
        lblAttackPath = new javax.swing.JLabel();
        lblDefendPath = new javax.swing.JLabel();
        lblWalkPath = new javax.swing.JLabel();
        lblLowHealthPath = new javax.swing.JLabel();
        lblHurtPath = new javax.swing.JLabel();
        lblInstruction2 = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        spnLevel = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Character Appearance - Character Creation API Demo");
        setResizable(false);

        lblInstruction1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblInstruction1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction1.setText("Select the level of the Appearance");

        btnDefault.setText("DEFAULT");

        btnAttack.setText("ATTACK");

        btnDefend.setText("DEFEND");

        btnWalk.setText("WALK");

        btnLowHealth.setText("LOWHEALTH");

        btnHurt.setText("HURT");

        btnCancel.setText("Cancel");

        btnOk.setText("OK");

        lblDefaultPath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblDefaultPath.setText("Not Selected");

        lblAttackPath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblAttackPath.setText("Not Selected");

        lblDefendPath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblDefendPath.setText("Not Selected");

        lblWalkPath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblWalkPath.setText("Not Selected");

        lblLowHealthPath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblLowHealthPath.setText("Not Selected");

        lblHurtPath.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblHurtPath.setText("Not Selected");

        lblInstruction2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblInstruction2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction2.setText("Select every image to use on the specified Appearance");

        lblLevel.setText("Level:");

        spnLevel.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInstruction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAttack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDefend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHurt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWalk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLowHealth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDefaultPath, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAttackPath, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDefendPath, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWalkPath, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLowHealthPath, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHurtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInstruction2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruction1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(spnLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInstruction2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDefault)
                    .addComponent(lblDefaultPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAttack)
                    .addComponent(lblAttackPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDefend)
                    .addComponent(lblDefendPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWalk)
                    .addComponent(lblWalkPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLowHealth)
                    .addComponent(lblLowHealthPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHurt)
                    .addComponent(lblHurtPath))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnAttack;
    protected javax.swing.JButton btnCancel;
    protected javax.swing.JButton btnDefault;
    protected javax.swing.JButton btnDefend;
    protected javax.swing.JButton btnHurt;
    protected javax.swing.JButton btnLowHealth;
    protected javax.swing.JButton btnOk;
    protected javax.swing.JButton btnWalk;
    protected javax.swing.JLabel lblAttackPath;
    protected javax.swing.JLabel lblDefaultPath;
    protected javax.swing.JLabel lblDefendPath;
    protected javax.swing.JLabel lblHurtPath;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblLevel;
    protected javax.swing.JLabel lblLowHealthPath;
    protected javax.swing.JLabel lblWalkPath;
    protected javax.swing.JSpinner spnLevel;
    // End of variables declaration//GEN-END:variables
}
