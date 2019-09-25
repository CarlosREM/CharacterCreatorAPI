/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;

/**
 *
 * @author Carlos Esquivel
 */
public class SimulationTab extends javax.swing.JPanel {

    /**
     * Creates new form Simulation
     */
    public SimulationTab() {
        initComponents();
        this.setBackground(Color.DARK_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlayerAttack = new javax.swing.JButton();
        txtPlayerHP = new javax.swing.JTextField();
        javax.swing.JPanel pnlPlayerWeapon = new javax.swing.JPanel();
        lblPlayerWeapon = new javax.swing.JLabel();
        javax.swing.JPanel pnlComputerImage = new javax.swing.JPanel();
        lblComputerImage = new javax.swing.JLabel();
        javax.swing.JLabel lblPlayerChar = new javax.swing.JLabel();
        cmBxPlayerChar = new javax.swing.JComboBox<>();
        cmBxComChar = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblComChar = new javax.swing.JLabel();
        javax.swing.JPanel pnlPlayerImage = new javax.swing.JPanel();
        lblPlayerImage = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        cmBxComWeapon = new javax.swing.JComboBox<>();
        btnStop = new javax.swing.JButton();
        javax.swing.JPanel pnlComWeapon = new javax.swing.JPanel();
        lblComWeapon = new javax.swing.JLabel();
        javax.swing.JScrollPane scrollCombatLog = new javax.swing.JScrollPane();
        txtCombatLog = new javax.swing.JTextArea();
        javax.swing.JLabel lblComHP = new javax.swing.JLabel();
        txtComHP = new javax.swing.JTextField();
        javax.swing.JLabel lblPlayerHP = new javax.swing.JLabel();
        cmBxPlayerWeapon = new javax.swing.JComboBox<>();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTextPane txtInstruction = new javax.swing.JTextPane();

        btnPlayerAttack.setBackground(new java.awt.Color(51, 51, 51));
        btnPlayerAttack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPlayerAttack.setForeground(new java.awt.Color(205, 205, 205));
        btnPlayerAttack.setText("Attack");
        btnPlayerAttack.setEnabled(false);

        txtPlayerHP.setEditable(false);
        txtPlayerHP.setBackground(new java.awt.Color(51, 51, 51));
        txtPlayerHP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPlayerHP.setForeground(new java.awt.Color(204, 204, 204));
        txtPlayerHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayerHPActionPerformed(evt);
            }
        });

        pnlPlayerWeapon.setBackground(new java.awt.Color(51, 51, 51));
        pnlPlayerWeapon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Weapon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        pnlPlayerWeapon.setForeground(new java.awt.Color(204, 204, 204));
        pnlPlayerWeapon.setLayout(new java.awt.BorderLayout());

        lblPlayerWeapon.setForeground(new java.awt.Color(205, 205, 205));
        lblPlayerWeapon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlPlayerWeapon.add(lblPlayerWeapon, java.awt.BorderLayout.CENTER);

        pnlComputerImage.setBackground(new java.awt.Color(51, 51, 51));
        pnlComputerImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Computer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        pnlComputerImage.setForeground(new java.awt.Color(204, 204, 204));
        pnlComputerImage.setMaximumSize(new java.awt.Dimension(250, 250));
        pnlComputerImage.setPreferredSize(new java.awt.Dimension(250, 250));
        pnlComputerImage.setLayout(new java.awt.BorderLayout());

        lblComputerImage.setForeground(new java.awt.Color(205, 205, 205));
        lblComputerImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlComputerImage.add(lblComputerImage, java.awt.BorderLayout.CENTER);

        lblPlayerChar.setForeground(new java.awt.Color(204, 204, 204));
        lblPlayerChar.setText("Player character:");

        lblComChar.setForeground(new java.awt.Color(204, 204, 204));
        lblComChar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblComChar.setText("Com. character:");

        pnlPlayerImage.setBackground(new java.awt.Color(51, 51, 51));
        pnlPlayerImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        pnlPlayerImage.setForeground(new java.awt.Color(204, 204, 204));
        pnlPlayerImage.setMaximumSize(new java.awt.Dimension(250, 250));
        pnlPlayerImage.setPreferredSize(new java.awt.Dimension(250, 250));
        pnlPlayerImage.setLayout(new java.awt.BorderLayout());

        lblPlayerImage.setForeground(new java.awt.Color(205, 205, 205));
        lblPlayerImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlPlayerImage.add(lblPlayerImage, java.awt.BorderLayout.CENTER);

        btnStart.setBackground(new java.awt.Color(51, 51, 51));
        btnStart.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(204, 204, 204));
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        cmBxComWeapon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmBxComWeapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBxComWeaponActionPerformed(evt);
            }
        });

        btnStop.setBackground(new java.awt.Color(51, 51, 51));
        btnStop.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnStop.setForeground(new java.awt.Color(204, 204, 204));
        btnStop.setText("STOP");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        pnlComWeapon.setBackground(new java.awt.Color(51, 51, 51));
        pnlComWeapon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Weapon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        pnlComWeapon.setForeground(new java.awt.Color(204, 204, 204));
        pnlComWeapon.setLayout(new java.awt.BorderLayout());

        lblComWeapon.setForeground(new java.awt.Color(205, 205, 205));
        lblComWeapon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlComWeapon.add(lblComWeapon, java.awt.BorderLayout.CENTER);

        txtCombatLog.setEditable(false);
        txtCombatLog.setColumns(20);
        txtCombatLog.setRows(5);
        txtCombatLog.setWrapStyleWord(true);
        scrollCombatLog.setViewportView(txtCombatLog);

        lblComHP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblComHP.setForeground(new java.awt.Color(204, 204, 204));
        lblComHP.setText("HP");

        txtComHP.setEditable(false);
        txtComHP.setBackground(new java.awt.Color(51, 51, 51));
        txtComHP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtComHP.setForeground(new java.awt.Color(204, 204, 204));
        txtComHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComHPActionPerformed(evt);
            }
        });

        lblPlayerHP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPlayerHP.setForeground(new java.awt.Color(204, 204, 204));
        lblPlayerHP.setText("HP");

        cmBxPlayerWeapon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmBxPlayerWeapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBxPlayerWeaponActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        txtInstruction.setEditable(false);
        txtInstruction.setBackground(java.awt.Color.darkGray);
        txtInstruction.setBorder(null);
        txtInstruction.setForeground(new java.awt.Color(204, 204, 204));
        txtInstruction.setText("Select computer weapon\nbefore starting simulation");
        jScrollPane2.setViewportView(txtInstruction);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlPlayerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPlayerHP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlayerHP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPlayerAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPlayerChar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(cmBxPlayerChar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmBxComChar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblComChar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblComHP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComHP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126))
                            .addComponent(pnlComputerImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlPlayerWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(cmBxPlayerWeapon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollCombatLog)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmBxComWeapon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlComWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlComputerImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComHP)
                            .addComponent(txtComHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlPlayerImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblComChar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmBxComChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlayerChar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmBxPlayerChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlayerHP)
                            .addComponent(txtPlayerHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlayerAttack))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPlayerWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmBxPlayerWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlComWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmBxComWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addComponent(scrollCombatLog))
                        .addGap(24, 24, 24))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlayerHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayerHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayerHPActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartActionPerformed

    private void cmBxComWeaponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBxComWeaponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmBxComWeaponActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopActionPerformed

    private void txtComHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComHPActionPerformed

    private void cmBxPlayerWeaponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBxPlayerWeaponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmBxPlayerWeaponActionPerformed

    public void writeCombatLog(String text) {
        String previousText = txtCombatLog.getText();
        txtCombatLog.setText(previousText + "> " + text + "\n");
    }
    public void clearCombatLog() {
        txtCombatLog.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPlayerAttack;
    public javax.swing.JButton btnStart;
    public javax.swing.JButton btnStop;
    public javax.swing.JComboBox<String> cmBxComChar;
    public javax.swing.JComboBox<String> cmBxComWeapon;
    public javax.swing.JComboBox<String> cmBxPlayerChar;
    public javax.swing.JComboBox<String> cmBxPlayerWeapon;
    public javax.swing.JLabel lblComWeapon;
    public javax.swing.JLabel lblComputerImage;
    public javax.swing.JLabel lblPlayerImage;
    public javax.swing.JLabel lblPlayerWeapon;
    public javax.swing.JTextField txtComHP;
    public javax.swing.JTextArea txtCombatLog;
    public javax.swing.JTextField txtPlayerHP;
    // End of variables declaration//GEN-END:variables
}
