/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.Interface;

/**
 *
 * @author aluno
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public HomeView() {
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

        jtPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbFavoritos = new javax.swing.JButton();
        jbAdcLivro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtPesquisar.setBackground(new java.awt.Color(230, 225, 225));
        jtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        jtPesquisar.setBorder(null);
        jtPesquisar.setRequestFocusEnabled(false);
        getContentPane().add(jtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 310, 60));

        jbPesquisar.setBorder(null);
        jbPesquisar.setContentAreaFilled(false);
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 40, 40));

        jbFavoritos.setBackground(new java.awt.Color(218, 244, 227));
        jbFavoritos.setBorder(null);
        jbFavoritos.setContentAreaFilled(false);
        jbFavoritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 180, 40));

        jbAdcLivro.setBackground(new java.awt.Color(218, 244, 227));
        jbAdcLivro.setToolTipText("Adicionar um livro(pdf)");
        jbAdcLivro.setBorder(null);
        jbAdcLivro.setContentAreaFilled(false);
        jbAdcLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbAdcLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/4043232-avatar-batman-comics-hero_113278.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, -1));

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/exit_closethesession_close_6317.png"))); // NOI18N
        jbSair.setContentAreaFilled(false);
        jbSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/wireframe ProgramaTeca (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        LoginView lv = new LoginView();
        lv.fechar();
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAdcLivro;
    private javax.swing.JButton jbFavoritos;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTextField jtPesquisar;
    // End of variables declaration//GEN-END:variables
}
