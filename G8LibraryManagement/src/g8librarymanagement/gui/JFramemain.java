/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.gui;

import java.awt.Dimension;

/**
 *
 * @author Admin
 */
public class JFramemain extends javax.swing.JFrame {

    /**
     * Creates new form JFramemenu
     */
    public JFramemain() {
        initComponents();
        this.setMinimumSize(new Dimension(900, 610));
    }
    
    public void setLabel() {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_systems = new javax.swing.JMenu();
        mnui_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnui_exit = new javax.swing.JMenuItem();
        menu_manage = new javax.swing.JMenu();
        mnit_employee_list = new javax.swing.JMenuItem();
        mnit_member_list = new javax.swing.JMenuItem();
        mnit_book_list = new javax.swing.JMenuItem();
        mnit_book_type = new javax.swing.JMenuItem();
        mnit_ticket = new javax.swing.JMenuItem();
        mnit_ticketdetail = new javax.swing.JMenuItem();
        mnit_nation = new javax.swing.JMenuItem();
        mnit_publisher = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 501, 58);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo-1573592371950-348a8f1d9f38.jpg"))); // NOI18N
        background.setText("jLabel2");
        background.setMinimumSize(new java.awt.Dimension(1920, 1126));
        getContentPane().add(background);
        background.setBounds(0, 0, 900, 610);

        menu_systems.setText("Systems");

        mnui_logout.setText("Log out");
        mnui_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnui_logoutActionPerformed(evt);
            }
        });
        menu_systems.add(mnui_logout);
        menu_systems.add(jSeparator1);

        mnui_exit.setText("Exit");
        mnui_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnui_exitActionPerformed(evt);
            }
        });
        menu_systems.add(mnui_exit);

        jMenuBar1.add(menu_systems);

        menu_manage.setText("Manage");

        mnit_employee_list.setText("Employee List");
        mnit_employee_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_employee_listActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_employee_list);

        mnit_member_list.setText("Member List");
        mnit_member_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_member_listActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_member_list);

        mnit_book_list.setText("Book List");
        mnit_book_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_book_listActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_book_list);

        mnit_book_type.setText("Book Type");
        mnit_book_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_book_typeActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_book_type);

        mnit_ticket.setText("Borrowed Ticket");
        mnit_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_ticketActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_ticket);

        mnit_ticketdetail.setText("Borrowed Ticket Detail");
        mnit_ticketdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_ticketdetailActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_ticketdetail);

        mnit_nation.setText("Nation");
        mnit_nation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_nationActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_nation);

        mnit_publisher.setText("Publisher");
        mnit_publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnit_publisherActionPerformed(evt);
            }
        });
        menu_manage.add(mnit_publisher);

        jMenuBar1.add(menu_manage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnit_employee_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_employee_listActionPerformed
        // TODO add your handling code here: 
        Employee jfe=new Employee();
        jfe.setVisible(true);
    }//GEN-LAST:event_mnit_employee_listActionPerformed

    private void mnit_book_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_book_listActionPerformed
        // TODO add your handling code here:
        JFramebook_list jfbl=new JFramebook_list();
        jfbl.setVisible(true);
    }//GEN-LAST:event_mnit_book_listActionPerformed

    private void mnit_book_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_book_typeActionPerformed
        // TODO add your handling code here:
        JFramebook_type jfbt=new JFramebook_type();
        jfbt.setVisible(true);
    }//GEN-LAST:event_mnit_book_typeActionPerformed

    private void mnit_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_ticketActionPerformed
        // TODO add your handling code here:
        JFrameborrowed_ticket jftik=new JFrameborrowed_ticket();
        jftik.setVisible(true);
    }//GEN-LAST:event_mnit_ticketActionPerformed

    private void mnit_ticketdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_ticketdetailActionPerformed
        // TODO add your handling code here:
        JFrameborrowed_ticket_detail jfbtd=new JFrameborrowed_ticket_detail();
        jfbtd.setVisible(true);
    }//GEN-LAST:event_mnit_ticketdetailActionPerformed

    private void mnit_member_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_member_listActionPerformed
        // TODO add your handling code here:
        JFramemember jfmem=new JFramemember();
        jfmem.setVisible(true);
    }//GEN-LAST:event_mnit_member_listActionPerformed

    private void mnit_nationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_nationActionPerformed
        // TODO add your handling code here:
        JFramenation jfn=new JFramenation();
        jfn.setVisible(true);
    }//GEN-LAST:event_mnit_nationActionPerformed

    private void mnit_publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnit_publisherActionPerformed
        // TODO add your handling code here:
        JFramepublisher jfp=new JFramepublisher();
        jfp.setVisible(true);
    }//GEN-LAST:event_mnit_publisherActionPerformed

    private void mnui_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnui_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFramelogin jfl=new JFramelogin();
        jfl.setVisible(true);
    }//GEN-LAST:event_mnui_logoutActionPerformed

    private void mnui_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnui_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnui_exitActionPerformed

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
            java.util.logging.Logger.getLogger(JFramemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramemain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu_manage;
    private javax.swing.JMenu menu_systems;
    private javax.swing.JMenuItem mnit_book_list;
    private javax.swing.JMenuItem mnit_book_type;
    private javax.swing.JMenuItem mnit_employee_list;
    private javax.swing.JMenuItem mnit_member_list;
    private javax.swing.JMenuItem mnit_nation;
    private javax.swing.JMenuItem mnit_publisher;
    private javax.swing.JMenuItem mnit_ticket;
    private javax.swing.JMenuItem mnit_ticketdetail;
    private javax.swing.JMenuItem mnui_exit;
    private javax.swing.JMenuItem mnui_logout;
    // End of variables declaration//GEN-END:variables
}
