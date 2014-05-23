package beadando;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A programról jelenít meg információkat, mint verziószám, készítője, tehát egy
 * program névjegy ablak.
 *
 * @author Boruzs Tibor
 *
 */
public class AboutAblak extends javax.swing.JDialog {

    /**
     * A naplózási objektum létrehozása és inicializálása.
     */
    protected static Logger logger = LoggerFactory.getLogger(AboutAblak.class);

    /**
     * Létrehozza az AboutAblak osztályhoz tartozó swinges ablakot.
     *
     * @param parent A szülő programablak.
     * @param modal Ezt a netbeans generálta, fogalmam sincs mi akar lenni...
     */
    public AboutAblak(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Swing komponensek inicializálása kezdőértékek beállítása.
     */
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Sudoku");
        setResizable(false);

        jButton1.setText("Ok!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sudoku for Prog.Körny. V 1.0 RTD (Release To Defense) Build: 2014.05.23.");

        jLabel2.setText("Created By: Boruzs Tibor (PXKOTM)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jButton1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A jButton1 gomb megnyomására az ablak bezáródik. Ezt az eseményt ez a kód
     * biztosítja.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        logger.info("About Window closed");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * A program névjegye osztály főmetódusa.
     *
     * @param args Üres argumentumlista.
     */
    public static void main(String args[]) {
        logger.info("About window started.");
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
            java.util.logging.Logger.getLogger(AboutAblak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutAblak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutAblak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutAblak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AboutAblak dialog = new AboutAblak(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
     *
     */
    private javax.swing.JButton jButton1;
    /**
     *
     */
    private javax.swing.JLabel jLabel1;
    /**
     *
     */
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
