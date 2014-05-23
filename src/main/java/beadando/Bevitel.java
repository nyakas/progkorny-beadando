package beadando;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Sudoku táblába való számértékek bevitelére használható funkció
 * implementációjának az osztálya.
 *
 * @author Boruzs Tibor
 *
 */
public class Bevitel extends javax.swing.JDialog {

/**
 *  A naplózási objektum létrehozása és inicializálása.
 */
    protected static Logger logger = LoggerFactory.getLogger(Bevitel.class);

    /**
     * A Bevitel osztályhoz tartozó Swinges ablak létrehozása.
     *
     * @param parent Szülő ablak.
     * @param modal Ezt a netbeans generálta, fogalmam sincs mi akar lenni...
     */
    public Bevitel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    /**
     *
     */
    int eredeti;
    /**
     *
     */
    int kivalasztott;

    /**
     * Módosítja a Bevitel ablakban azt a szöveget hogy az aktuálisan
     * módosításra kiválasztott gombon jelenleg milyen érték van.
     *
     * @param transfer A kattintáskor a sudoku tábla mezején lévő számérték
     */
    void setlabel(int transfer) {
        eredeti = transfer;
        jLabel4.setText("A cellában lévő mostani érték: " + eredeti);
    }

    /**
     * A swing ablak felületének inicializálása.
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Válassz egy számot bevitelre, vagy töröld az értékét!");

        jButton1.setText("Bevitel/Felülírás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Törlés");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jelenleg bennt lévő érték törlése");
        /**
         * Egy legördülő lista inicializálása a választható számjegyek
         * kiválasztásához.
         */
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}));

        jLabel3.setText("Bevitel, vagy már beírt érték felülírása");

        jLabel4.setText("jLabel4");
        /**
         *
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                        .addComponent(jLabel4)
                                        .addComponent(jSeparator2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Kiválasztott elemből a beírt érték törlése, vagyis a táblaelem
     * kinullázása.
     *
     * @param evt A gomb megnyomásának az eseményazonosítója.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        kivalasztott = 0;
        //    kivalasztottAtad();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * A program átadja a kiválasztott elem értéket a játék aktuálisan
     * kiválasztott mezejének a gomb megnyomására.
     *
     * @param evt A gomb megnyomásának az eseményazonosítója.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        logger.info("Reading new value...");
        String temp;
        temp = String.valueOf(jComboBox1.getSelectedItem());
        kivalasztott = Integer.parseInt(temp);
        //  kivalasztottAtad();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * A beírásra szánt értéket adja vissza, a {@link #JatekLogic JatekLogic}
     * osztálynak.
     *
     * @return A kiválasztott érték.
     */
    public int kivalasztottAtad() {
        logger.info("New value is inserting " + kivalasztott);
        return kivalasztott;
    }

    /**
     * A Bevitel osztály főmetódusa.
     *
     * @param args Argumentumok üres tömbje.
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
            java.util.logging.Logger.getLogger(Bevitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bevitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bevitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bevitel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bevitel dialog = new Bevitel(new javax.swing.JFrame(), true);
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
     * Új szám bevitele, vagy régi frissítésének a gombja.
     */
    private javax.swing.JButton jButton1;
    /**
     * Már bevitt érték kinullázásának a gombja.
     */
    private javax.swing.JButton jButton2;
    /**
     * Választható számok 1-től 9-ig, kiválasztható listában.
     */
    private javax.swing.JComboBox jComboBox1;
    /**
     *
     */
    private javax.swing.JLabel jLabel1;
    /**
     *
     */
    private javax.swing.JLabel jLabel2;
    /**
     *
     */
    private javax.swing.JLabel jLabel3;
    /**
     *
     */

    private javax.swing.JLabel jLabel4;
    /**
     *
     */
    private javax.swing.JSeparator jSeparator1;
    /**
     *
     */
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
