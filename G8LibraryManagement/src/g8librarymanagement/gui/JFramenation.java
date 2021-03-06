/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.gui;
import g8librarymanagement.dao.nationDAO;
import g8librarymanagement.model.nation;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class JFramenation extends javax.swing.JFrame {
    public DefaultTableModel tableModel;
    public boolean typeAction;
    /**
     * Creates new form nation management
     */
    public JFramenation() {
        initComponents();
        loadData(); // load data khi mo window
        updateStatus(true);
        txt_nation_id.setEnabled(false);
        this.setMinimumSize(new Dimension(660, 530));
    }
    
    public void updateStatus(boolean value) {
        but_addnew.setEnabled(value);
        but_update.setEnabled(value);
        but_delete.setEnabled(value);
        but_save.setEnabled(!value);
        but_cancel.setEnabled(!value);
    }
    
    public void loadData() {
        tableModel = (DefaultTableModel) jTablenation.getModel();
        int numRow=tableModel.getRowCount();
        if (numRow>0) {
            for (int index=0; index<numRow; index++) {
                tableModel.removeRow(0);
            }
        }
        nationDAO naDAO=new nationDAO();       
        ArrayList<nation> list=naDAO.findAll();
        int i=1;
        for (nation na : list) {
            tableModel.addRow(new Object[]{i++,na.getNation_id(),na.getNation_name()});
        }
    }
    
    public void loadResult(ArrayList<nation> list) {
        tableModel = (DefaultTableModel) jTablenation.getModel();
        int numRow=tableModel.getRowCount();
        if (numRow>0) {
            for (int index=0; index<numRow; index++) {
                tableModel.removeRow(0);
            }
        }
        int i=1;
        for (nation na : list) {
            tableModel.addRow(new Object[]{i++,na.getNation_id(),na.getNation_name()});
        }
    }
    
    public int checkEmpty(String input){
        int check = -1;
        if(input.isEmpty() || input.isBlank()){          
            check = 1;
        }
        return check;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb_searchid = new javax.swing.JRadioButton();
        rb_searchname = new javax.swing.JRadioButton();
        txt_searchid = new javax.swing.JTextField();
        txt_searchname = new javax.swing.JTextField();
        but_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablenation = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nation_name = new javax.swing.JTextField();
        but_addnew = new javax.swing.JButton();
        but_update = new javax.swing.JButton();
        but_delete = new javax.swing.JButton();
        but_save = new javax.swing.JButton();
        but_cancel = new javax.swing.JButton();
        but_exit = new javax.swing.JButton();
        txt_nation_id = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 149, 93));
        jLabel1.setText("Nation Management");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 420, 57);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Searching:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        rb_searchid.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(rb_searchid);
        rb_searchid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_searchid.setText("by ID:");

        rb_searchname.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(rb_searchname);
        rb_searchname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_searchname.setText("by Name:");

        txt_searchid.setBackground(new java.awt.Color(255, 255, 204));

        txt_searchname.setBackground(new java.awt.Color(255, 255, 204));

        but_search.setBackground(new java.awt.Color(187, 149, 93));
        but_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_search.setText("Search");
        but_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        jTablenation.setBackground(new java.awt.Color(255, 255, 204));
        jTablenation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nation ID", "Nation name"
            }
        ));
        jTablenation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablenationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablenation);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_searchname)
                    .addComponent(rb_searchid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_searchid, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txt_searchname))
                .addGap(61, 61, 61)
                .addComponent(but_search, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_searchid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txt_searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rb_searchid)
                        .addGap(18, 18, 18)
                        .addComponent(rb_searchname))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(but_search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 220, 620, 260);

        jPanel2.setBackground(new java.awt.Color(255, 253, 232));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nation name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nation ID:");

        txt_nation_name.setBackground(new java.awt.Color(217, 217, 217));

        but_addnew.setBackground(new java.awt.Color(187, 149, 93));
        but_addnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_addnew.setText("Add new");
        but_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_addnewActionPerformed(evt);
            }
        });

        but_update.setBackground(new java.awt.Color(187, 149, 93));
        but_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_update.setText("Update");
        but_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_updateActionPerformed(evt);
            }
        });

        but_delete.setBackground(new java.awt.Color(187, 149, 93));
        but_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_delete.setText("Delete");
        but_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_deleteActionPerformed(evt);
            }
        });

        but_save.setBackground(new java.awt.Color(187, 149, 93));
        but_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_save.setText("Save");
        but_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_saveActionPerformed(evt);
            }
        });

        but_cancel.setBackground(new java.awt.Color(187, 149, 93));
        but_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_cancel.setText("Cancel");
        but_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_cancelActionPerformed(evt);
            }
        });

        but_exit.setBackground(new java.awt.Color(187, 149, 93));
        but_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_exit.setText("Exit");
        but_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_exitActionPerformed(evt);
            }
        });

        txt_nation_id.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(but_addnew)
                        .addGap(13, 13, 13)
                        .addComponent(but_update)
                        .addGap(18, 18, 18)
                        .addComponent(but_delete)
                        .addGap(18, 18, 18)
                        .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but_cancel)
                        .addGap(18, 18, 18)
                        .addComponent(but_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(txt_nation_id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nation_name)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nation_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nation_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_addnew)
                    .addComponent(but_update)
                    .addComponent(but_delete)
                    .addComponent(but_save)
                    .addComponent(but_cancel)
                    .addComponent(but_exit))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 620, 140);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 650, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_addnewActionPerformed
        // TODO add your handling code here:
        updateStatus(false);
        typeAction=true;
    }//GEN-LAST:event_but_addnewActionPerformed

    private void but_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_updateActionPerformed
        // TODO add your handling code here:
        typeAction=false;
        updateStatus(false);
    }//GEN-LAST:event_but_updateActionPerformed

    private void but_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_deleteActionPerformed
        // TODO add your handling code here:
        int choose=JOptionPane.showConfirmDialog(null, "Do you want to delete?", "WARNING", JOptionPane.YES_NO_OPTION);
        if(choose==JOptionPane.YES_OPTION) {
            nationDAO naDAO=new nationDAO();
            ArrayList<nation> list=naDAO.findAll();
            int index=jTablenation.getSelectedRow();
            naDAO.delete(list.get(index));
            loadData();
        }
    }//GEN-LAST:event_but_deleteActionPerformed

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed
        // TODO add your handling code here:
        if(typeAction) {
        // add new   
        nation na=new nation(); 
        na.setNation_name(txt_nation_name.getText());
        if(checkEmpty(txt_nation_name.getText())==1){
            JOptionPane.showMessageDialog(null, "Please input nation name!");}
        else {
        nationDAO naDAO=new nationDAO();
        naDAO.addNew(na);
        loadData();
            }
        }
        
        else {
        // update    
        nation na=new nation();
        na.setNation_id(Integer.valueOf(txt_nation_id.getText())); 
        na.setNation_name(txt_nation_name.getText());
        if(checkEmpty(txt_nation_name.getText())==1){
            JOptionPane.showMessageDialog(null, "Please input nation name!");}
        else {
        nationDAO naDAO=new nationDAO();
        naDAO.update(na);
        loadData();
            }
        }
        updateStatus(true);
    }//GEN-LAST:event_but_saveActionPerformed

    private void but_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_cancelActionPerformed
        // TODO add your handling code here:
        updateStatus(true);
        loadData();
    }//GEN-LAST:event_but_cancelActionPerformed

    private void but_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_but_exitActionPerformed

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed
        // TODO add your handling code here:
        if(rb_searchid.isSelected()) {
            int id=Integer.parseInt(txt_searchid.getText());
                nationDAO naDAO=new nationDAO();
                nation rs=naDAO.findByID(id);
                if (rs==null) {
                    JOptionPane.showMessageDialog(null, "No result!!");
                } else {
                    ArrayList<nation> list=new ArrayList<nation>();
                    list.add(rs);
                    loadResult(list);
                }
        } else if(rb_searchname.isSelected()) {
            String name=txt_searchname.getText();
            nationDAO emDAO=new nationDAO();
            nation rs=emDAO.findByName(name);
            if (rs==null) {
                    JOptionPane.showMessageDialog(null, "No result!!");
                } else {
                    ArrayList<nation> list=new ArrayList<nation>();
                    list.add(rs);
                    loadResult(list);
                }
        } else {
            JOptionPane.showMessageDialog(null, "Please choose the method!!");
        }
        updateStatus(false);
    }//GEN-LAST:event_but_searchActionPerformed

    private void jTablenationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablenationMouseClicked
        // TODO add your handling code here:
        updateStatus(true);
        int index=jTablenation.getSelectedRow();
        nationDAO emDAO=new nationDAO();
        ArrayList<nation> list=emDAO.findAll();
        txt_nation_id.setText(String.valueOf(list.get(index).getNation_id()));
        txt_nation_name.setText(list.get(index).getNation_name());
    }//GEN-LAST:event_jTablenationMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramenation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramenation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramenation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramenation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramenation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_addnew;
    private javax.swing.JButton but_cancel;
    private javax.swing.JButton but_delete;
    private javax.swing.JButton but_exit;
    private javax.swing.JButton but_save;
    private javax.swing.JButton but_search;
    private javax.swing.JButton but_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablenation;
    private javax.swing.JRadioButton rb_searchid;
    private javax.swing.JRadioButton rb_searchname;
    private javax.swing.JTextField txt_nation_id;
    private javax.swing.JTextField txt_nation_name;
    private javax.swing.JTextField txt_searchid;
    private javax.swing.JTextField txt_searchname;
    // End of variables declaration//GEN-END:variables
}
