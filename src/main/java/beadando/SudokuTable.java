package beadando;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.slf4j.LoggerFactory;

/**
 * A játéktér grafikus táblájának a megjelenítése, és a játék menetének
 * programablaka.
 *
 * @author Boruzs Tibor
 */
public class SudokuTable extends javax.swing.JFrame {

    /**
     * Naplózási objektum deklarálása, és inicializálása.
     */
    protected static org.slf4j.Logger logger = LoggerFactory.getLogger(SudokuTable.class);
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Eredeti játékállás.
     */
    int[] mentes = new int[83];
    /**
     * Jelenlegi játékállás.
     */
    int[] jatek = new int[83];

    /**
     * Kezdeti játéktér betöltése ajatek tömbbe.
     *
     * @param modify Az xml fájlból beolvasott karaktersorozat int tömbbé
     * transzformálva.
     */
    public SudokuTable(int[] modify) {
        initComponents();
        jatek = modify;
    }
    /**
     * Az aktuális játék azonosítója.
     */
    int azonosito;

    /**
     * Másik konstruktor ablak inicializálásra, változó inicializálás nélkül.
     */
    public SudokuTable() {
        initComponents();
    }

    /**
     * Alap játékállás másolása, hogy ellenőrizhető legyen az alap nemnulla
     * számok felülírhatatlansága.
     *
     * @param szamok Az aktuális játéktér.
     */
    void kopiz(int[] szamok) {
        System.arraycopy(szamok, 0, mentes, 0, szamok.length);

    }

    /**
     * A kezdeti játékállás létrehozása a gombok feliratának beállításával, és a
     * játékazonosító kiírásával a programablakban.
     *
     * @param szamok A kezdeti játéktér.
     * @param jatekazon Az aktuális játék azonosítója, sorszáma.
     */
    void elokeszit(int[] szamok, int jatekazon) {
        logger.info("Preparing the game table...");
        azonosito = jatekazon;

        jButton1.setText(String.valueOf(szamok[1]));
        jButton2.setText(String.valueOf(szamok[2]));
        jButton3.setText(String.valueOf(szamok[3]));
        jButton4.setText(String.valueOf(szamok[4]));
        jButton5.setText(String.valueOf(szamok[5]));
        jButton6.setText(String.valueOf(szamok[6]));
        jButton7.setText(String.valueOf(szamok[7]));
        jButton8.setText(String.valueOf(szamok[8]));
        jButton9.setText(String.valueOf(szamok[9]));
        jButton10.setText(String.valueOf(szamok[10]));
        jButton11.setText(String.valueOf(szamok[11]));
        jButton12.setText(String.valueOf(szamok[12]));
        jButton13.setText(String.valueOf(szamok[13]));
        jButton14.setText(String.valueOf(szamok[14]));
        jButton15.setText(String.valueOf(szamok[15]));
        jButton16.setText(String.valueOf(szamok[16]));
        jButton17.setText(String.valueOf(szamok[17]));
        jButton18.setText(String.valueOf(szamok[18]));
        jButton19.setText(String.valueOf(szamok[19]));
        jButton20.setText(String.valueOf(szamok[20]));
        jButton21.setText(String.valueOf(szamok[21]));
        jButton22.setText(String.valueOf(szamok[22]));
        jButton23.setText(String.valueOf(szamok[23]));
        jButton24.setText(String.valueOf(szamok[24]));
        jButton25.setText(String.valueOf(szamok[25]));
        jButton26.setText(String.valueOf(szamok[26]));
        jButton27.setText(String.valueOf(szamok[27]));
        jButton28.setText(String.valueOf(szamok[28]));
        jButton29.setText(String.valueOf(szamok[29]));
        jButton30.setText(String.valueOf(szamok[30]));
        jButton31.setText(String.valueOf(szamok[31]));
        jButton32.setText(String.valueOf(szamok[32]));
        jButton33.setText(String.valueOf(szamok[33]));
        jButton34.setText(String.valueOf(szamok[34]));
        jButton35.setText(String.valueOf(szamok[35]));
        jButton36.setText(String.valueOf(szamok[36]));
        jButton37.setText(String.valueOf(szamok[37]));
        jButton38.setText(String.valueOf(szamok[38]));
        jButton39.setText(String.valueOf(szamok[39]));
        jButton40.setText(String.valueOf(szamok[40]));
        jButton41.setText(String.valueOf(szamok[41]));
        jButton42.setText(String.valueOf(szamok[42]));
        jButton43.setText(String.valueOf(szamok[43]));
        jButton44.setText(String.valueOf(szamok[44]));
        jButton45.setText(String.valueOf(szamok[45]));
        jButton46.setText(String.valueOf(szamok[46]));
        jButton47.setText(String.valueOf(szamok[47]));
        jButton48.setText(String.valueOf(szamok[48]));
        jButton49.setText(String.valueOf(szamok[49]));
        jButton50.setText(String.valueOf(szamok[50]));
        jButton51.setText(String.valueOf(szamok[51]));
        jButton52.setText(String.valueOf(szamok[52]));
        jButton53.setText(String.valueOf(szamok[53]));
        jButton54.setText(String.valueOf(szamok[54]));
        jButton55.setText(String.valueOf(szamok[55]));
        jButton56.setText(String.valueOf(szamok[56]));
        jButton57.setText(String.valueOf(szamok[57]));
        jButton58.setText(String.valueOf(szamok[58]));
        jButton59.setText(String.valueOf(szamok[59]));
        jButton60.setText(String.valueOf(szamok[60]));
        jButton61.setText(String.valueOf(szamok[61]));
        jButton62.setText(String.valueOf(szamok[62]));
        jButton63.setText(String.valueOf(szamok[63]));
        jButton64.setText(String.valueOf(szamok[64]));
        jButton65.setText(String.valueOf(szamok[65]));
        jButton66.setText(String.valueOf(szamok[66]));
        jButton67.setText(String.valueOf(szamok[67]));
        jButton68.setText(String.valueOf(szamok[68]));
        jButton69.setText(String.valueOf(szamok[69]));
        jButton70.setText(String.valueOf(szamok[70]));
        jButton71.setText(String.valueOf(szamok[71]));
        jButton72.setText(String.valueOf(szamok[72]));
        jButton73.setText(String.valueOf(szamok[73]));
        jButton74.setText(String.valueOf(szamok[74]));
        jButton75.setText(String.valueOf(szamok[75]));
        jButton76.setText(String.valueOf(szamok[76]));
        jButton77.setText(String.valueOf(szamok[77]));
        jButton78.setText(String.valueOf(szamok[78]));
        jButton79.setText(String.valueOf(szamok[79]));
        jButton80.setText(String.valueOf(szamok[80]));
        jButton81.setText(String.valueOf(szamok[81]));
        jLabel1.setText("A jelenlegi játékazonosító: " + jatekazon);

    }

    /**
     * A gombot jelképező mező értékének megváltoztatása, vagyis a gomb
     * feliratának a lecserélése.
     *
     * @param gombnev A gomb azonosítója (jButtonXX).
     * @param sorszam A kiválasztott gomb, vagy mező sorszáma.
     */
    public void modosit(JButton gombnev, int sorszam) {
        logger.info("Trying to modify the table.");
        int atiras;
        String flag = "eles";
        JatekLogic logika = new JatekLogic(sorszam, Integer.parseInt(gombnev.getText()), mentes[sorszam], jatek, flag);
        atiras = logika.logika();
        gombnev.setText(String.valueOf(atiras));
        jatek[sorszam] = atiras;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        logger.info("Initializing the table.");
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sudoku Table");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton82.setText("Új Játék");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setText("Újrakezdés");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(37)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton64, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton65, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton66, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton67, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton68, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton69, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton70, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton71, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton72, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton55, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton56, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton57, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton58, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton59, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton60, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton61, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton62, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton63, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton46, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton47, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton48, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton49, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton50, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton51, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton52, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton53, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton54, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton37, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton38, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton39, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton40, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton41, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton42, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton43, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton44, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton45, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton28, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton29, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton30, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton31, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton32, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton33, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton34, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton35, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton36, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton26, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton27, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton73, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(jButton74, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(jButton75, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18)
                                                        .addComponent(jButton76, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(jButton77, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(jButton78, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(4)
                                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(18)
                                        .addComponent(jButton79, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton80, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(jButton81, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(118)
                                        .addComponent(jButton82)
                                        .addGap(18)
                                        .addComponent(jButton83)))
                        .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(24)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton26, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton27, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                .addComponent(jButton28, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton29, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton30, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton31, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton32, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton33, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton34, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton35, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton36, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton37, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton38, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton39, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton40, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton41, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton42, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton43, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton44, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton45, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton46, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton47, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton48, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton49, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton50, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton51, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton52, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton53, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton54, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton55, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton56, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton57, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton58, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton59, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton60, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton61, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton62, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton63, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton64, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton65, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton66, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton67, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton68, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton69, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton70, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton71, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton72, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jButton73, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton74, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton75, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton76, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton77, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton78, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton79, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton80, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton81, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addComponent(jLabel1)
                        .addGap(18)
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jButton83)
                                .addComponent(jButton82))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Az 1. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modosit(jButton1, 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Az 2. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modosit(jButton2, 2);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Az 3. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modosit(jButton3, 3);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Az 4. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modosit(jButton4, 4);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Az 5. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        modosit(jButton5, 5);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * Az 6. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modosit(jButton6, 6);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * Az 7. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        modosit(jButton7, 7);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * Az 8. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        modosit(jButton8, 8);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * Az 9. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        modosit(jButton9, 9);
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * Az 10. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        modosit(jButton10, 10);
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * Az 11. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        modosit(jButton11, 11);
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * Az 12. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        modosit(jButton12, 12);
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * Az 13. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        modosit(jButton13, 13);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * Az 14. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        modosit(jButton14, 14);
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * Az 15. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        modosit(jButton15, 15);
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * Az 16. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        modosit(jButton16, 16);
    }//GEN-LAST:event_jButton16ActionPerformed

    /**
     * Az 17. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        modosit(jButton17, 17);
    }//GEN-LAST:event_jButton17ActionPerformed

    /**
     * Az 18. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        modosit(jButton18, 18);
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * Az 19. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        modosit(jButton19, 19);
    }//GEN-LAST:event_jButton19ActionPerformed

    /**
     * Az 20. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        modosit(jButton20, 20);
    }//GEN-LAST:event_jButton20ActionPerformed

    /**
     * Az 21. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        modosit(jButton21, 21);
    }//GEN-LAST:event_jButton21ActionPerformed

    /**
     * Az 22. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        modosit(jButton22, 22);
    }//GEN-LAST:event_jButton22ActionPerformed

    /**
     * Az 23. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        modosit(jButton23, 23);
    }//GEN-LAST:event_jButton23ActionPerformed

    /**
     * Az 24. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        modosit(jButton24, 24);
    }//GEN-LAST:event_jButton24ActionPerformed

    /**
     * Az 25. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        modosit(jButton25, 25);
    }//GEN-LAST:event_jButton25ActionPerformed

    /**
     * Az 26. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        modosit(jButton26, 26);
    }//GEN-LAST:event_jButton26ActionPerformed

    /**
     * Az 27. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        modosit(jButton27, 27);
    }//GEN-LAST:event_jButton27ActionPerformed

    /**
     * Az 28. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        modosit(jButton28, 28);
    }//GEN-LAST:event_jButton28ActionPerformed

    /**
     * Az 29. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        modosit(jButton29, 29);
    }//GEN-LAST:event_jButton29ActionPerformed

    /**
     * Az 30. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        modosit(jButton30, 30);
    }//GEN-LAST:event_jButton30ActionPerformed

    /**
     * Az 31. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        modosit(jButton31, 31);
    }//GEN-LAST:event_jButton31ActionPerformed

    /**
     * Az 32. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        modosit(jButton32, 32);
    }//GEN-LAST:event_jButton32ActionPerformed

    /**
     * Az 33. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        modosit(jButton33, 33);
    }//GEN-LAST:event_jButton33ActionPerformed

    /**
     * Az 34. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        modosit(jButton34, 34);
    }//GEN-LAST:event_jButton34ActionPerformed

    /**
     * Az 35. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        modosit(jButton35, 35);
    }//GEN-LAST:event_jButton35ActionPerformed

    /**
     * Az 36. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        modosit(jButton36, 36);
    }//GEN-LAST:event_jButton36ActionPerformed

    /**
     * Az 37. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        modosit(jButton37, 37);
    }//GEN-LAST:event_jButton37ActionPerformed

    /**
     * Az 38. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        modosit(jButton38, 38);
    }//GEN-LAST:event_jButton38ActionPerformed

    /**
     * Az 39. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        modosit(jButton39, 39);
    }//GEN-LAST:event_jButton39ActionPerformed

    /**
     * Az 40. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        modosit(jButton40, 40);
    }//GEN-LAST:event_jButton40ActionPerformed

    /**
     * Az 41. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        modosit(jButton41, 41);
    }//GEN-LAST:event_jButton41ActionPerformed

    /**
     * Az 42. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        modosit(jButton42, 42);
    }//GEN-LAST:event_jButton42ActionPerformed

    /**
     * Az 43. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        modosit(jButton43, 43);
    }//GEN-LAST:event_jButton43ActionPerformed

    /**
     * Az 44. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        modosit(jButton44, 44);
    }//GEN-LAST:event_jButton44ActionPerformed

    /**
     * Az 45. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        modosit(jButton45, 45);
    }//GEN-LAST:event_jButton45ActionPerformed

    /**
     * Az 46. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        modosit(jButton46, 46);
    }//GEN-LAST:event_jButton46ActionPerformed

    /**
     * Az 47. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        modosit(jButton47, 47);
    }//GEN-LAST:event_jButton47ActionPerformed

    /**
     * Az 48. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        modosit(jButton48, 48);
    }//GEN-LAST:event_jButton48ActionPerformed

    /**
     * Az 49. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        modosit(jButton49, 49);
    }//GEN-LAST:event_jButton49ActionPerformed

    /**
     * Az 50. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        modosit(jButton50, 50);
    }//GEN-LAST:event_jButton50ActionPerformed

    /**
     * Az 51. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        modosit(jButton51, 51);
    }//GEN-LAST:event_jButton51ActionPerformed

    /**
     * Az 52. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        modosit(jButton52, 52);
    }//GEN-LAST:event_jButton52ActionPerformed

    /**
     * Az 53. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        modosit(jButton53, 53);
    }//GEN-LAST:event_jButton53ActionPerformed

    /**
     * Az 54. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        modosit(jButton54, 54);
    }//GEN-LAST:event_jButton54ActionPerformed

    /**
     * Az 55. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        modosit(jButton55, 55);
    }//GEN-LAST:event_jButton55ActionPerformed

    /**
     * Az 56. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        modosit(jButton56, 56);
    }//GEN-LAST:event_jButton56ActionPerformed

    /**
     * Az 57. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        modosit(jButton57, 57);
    }//GEN-LAST:event_jButton57ActionPerformed

    /**
     * Az 58. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        modosit(jButton58, 58);
    }//GEN-LAST:event_jButton58ActionPerformed

    /**
     * Az 59. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        modosit(jButton59, 59);
    }//GEN-LAST:event_jButton59ActionPerformed

    /**
     * Az 60. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        modosit(jButton60, 60);
    }//GEN-LAST:event_jButton60ActionPerformed

    /**
     * Az 61. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        modosit(jButton61, 61);
    }//GEN-LAST:event_jButton61ActionPerformed

    /**
     * Az 62. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        modosit(jButton62, 62);
    }//GEN-LAST:event_jButton62ActionPerformed

    /**
     * Az 63. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        modosit(jButton63, 63);
    }//GEN-LAST:event_jButton63ActionPerformed

    /**
     * Az 64. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        modosit(jButton64, 64);
    }//GEN-LAST:event_jButton64ActionPerformed

    /**
     * Az 65. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        modosit(jButton65, 65);
    }//GEN-LAST:event_jButton65ActionPerformed

    /**
     * Az 66. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        modosit(jButton66, 66);
    }//GEN-LAST:event_jButton66ActionPerformed

    /**
     * Az 67. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        modosit(jButton67, 67);
    }//GEN-LAST:event_jButton67ActionPerformed

    /**
     * Az 68. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        modosit(jButton68, 68);
    }//GEN-LAST:event_jButton68ActionPerformed

    /**
     * Az 69. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        modosit(jButton69, 69);
    }//GEN-LAST:event_jButton69ActionPerformed

    /**
     * Az 70. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        modosit(jButton70, 70);
    }//GEN-LAST:event_jButton70ActionPerformed

    /**
     * Az 71. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        modosit(jButton71, 71);
    }//GEN-LAST:event_jButton71ActionPerformed

    /**
     * Az 72. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        modosit(jButton72, 72);
    }//GEN-LAST:event_jButton72ActionPerformed

    /**
     * Az 73. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        modosit(jButton73, 73);
    }//GEN-LAST:event_jButton73ActionPerformed

    /**
     * Az 74. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        modosit(jButton74, 74);
    }//GEN-LAST:event_jButton74ActionPerformed

    /**
     * Az 75. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        modosit(jButton75, 75);
    }//GEN-LAST:event_jButton75ActionPerformed

    /**
     * Az 76. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        modosit(jButton76, 76);
    }//GEN-LAST:event_jButton76ActionPerformed

    /**
     * Az 77. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        modosit(jButton77, 77);
    }//GEN-LAST:event_jButton77ActionPerformed

    /**
     * Az 78. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        modosit(jButton78, 78);
    }//GEN-LAST:event_jButton78ActionPerformed

    /**
     * Az 79. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        modosit(jButton79, 79);
    }//GEN-LAST:event_jButton79ActionPerformed

    /**
     * Az 80. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        modosit(jButton80, 80);
    }//GEN-LAST:event_jButton80ActionPerformed

    /**
     * Az 81. mező értéket megváltoztató eseményt hívó metódus.
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        modosit(jButton81, 81);
    }//GEN-LAST:event_jButton81ActionPerformed

    /**
     *
     * @param evt Maga a kattintás eseménye.
     */
    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        int jatekszam;
        jatekszam = (int) (1 + Math.random() * 5220);
        //        String message = "A játékmenet száma: " + jatekszam + "\n" + "Under construction...";

        CreateGame cr = null;
        try {
            cr = new CreateGame();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        String message = cr.Gamecreator(jatekszam);
        int[] jatek = new int[83];
        for (int i = 7; i < 88; i++) {
            jatek[i - 6] = (int) message.charAt(i) - 48;
        }
        SudokuTable tábla = new SudokuTable(jatek);
        tábla.elokeszit(jatek, jatekszam);
        dispose();
        tábla.setVisible(true);
    }//GEN-LAST:event_jButton82ActionPerformed

    /**
     * Új játék kezdésének gomb megnyomásának eseménykezelése.
     *
     * @param evt Maga a kiváltó esemény.
     */
    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        for (int i = 0; i < mentes.length; i++) {
            jatek[i] = 0;
        }
        System.arraycopy(mentes, 0, jatek, 0, jatek.length);
        elokeszit(jatek, azonosito);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton83ActionPerformed

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
            java.util.logging.Logger.getLogger(SudokuTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuTable().setVisible(true);
                logger.info("New game is now started. Have a nice playing! :)");
            }
        });
    }
    /**
     * Az 1. mező gombja.
     */
    private javax.swing.JButton jButton1;
    /**
     * A 10. mező gombja.
     */
    private javax.swing.JButton jButton10;
    /**
     * A 11. mező gombja.
     */
    private javax.swing.JButton jButton11;
    /**
     * A 12. mező gombja.
     */
    private javax.swing.JButton jButton12;
    /**
     * A 13. mező gombja.
     */
    private javax.swing.JButton jButton13;
    /**
     * A 14. mező gombja.
     */
    private javax.swing.JButton jButton14;
    /**
     * A 15. mező gombja.
     */
    private javax.swing.JButton jButton15;
    /**
     * A 16. mező gombja.
     */
    private javax.swing.JButton jButton16;
    /**
     * A 17. mező gombja.
     */
    private javax.swing.JButton jButton17;
    /**
     * A 18. mező gombja.
     */
    private javax.swing.JButton jButton18;
    /**
     * A 19. mező gombja.
     */
    private javax.swing.JButton jButton19;
    /**
     * A 2. mező gombja.
     */
    private javax.swing.JButton jButton2;
    /**
     * A 20. mező gombja.
     */
    private javax.swing.JButton jButton20;
    /**
     * A 21. mező gombja.
     */
    private javax.swing.JButton jButton21;
    /**
     * A 22. mező gombja.
     */
    private javax.swing.JButton jButton22;
    /**
     * A 23. mező gombja.
     */
    private javax.swing.JButton jButton23;
    /**
     * A 24. mező gombja.
     */
    private javax.swing.JButton jButton24;
    /**
     * A 25. mező gombja.
     */
    private javax.swing.JButton jButton25;
    /**
     * A 26. mező gombja.
     */
    private javax.swing.JButton jButton26;
    /**
     * A 27. mező gombja.
     */
    private javax.swing.JButton jButton27;
    /**
     * A 28. mező gombja.
     */
    private javax.swing.JButton jButton28;
    /**
     * A 29. mező gombja.
     */
    private javax.swing.JButton jButton29;
    /**
     * A 3. mező gombja.
     */
    private javax.swing.JButton jButton3;
    /**
     * A 30. mező gombja.
     */
    private javax.swing.JButton jButton30;
    /**
     * A 31. mező gombja.
     */
    private javax.swing.JButton jButton31;
    /**
     * A 32. mező gombja.
     */
    private javax.swing.JButton jButton32;
    /**
     * A 33. mező gombja.
     */
    private javax.swing.JButton jButton33;
    /**
     * A 34. mező gombja.
     */
    private javax.swing.JButton jButton34;
    /**
     * A 35. mező gombja.
     */
    private javax.swing.JButton jButton35;
    /**
     * A 36. mező gombja.
     */
    private javax.swing.JButton jButton36;
    /**
     * A 37. mező gombja.
     */
    private javax.swing.JButton jButton37;
    /**
     * A 38. mező gombja.
     */
    private javax.swing.JButton jButton38;
    /**
     * A 39. mező gombja.
     */
    private javax.swing.JButton jButton39;
    /**
     * A 4. mező gombja.
     */
    private javax.swing.JButton jButton4;
    /**
     * A 40. mező gombja.
     */
    private javax.swing.JButton jButton40;
    /**
     * A 41. mező gombja.
     */
    private javax.swing.JButton jButton41;
    /**
     * A 42. mező gombja.
     */
    private javax.swing.JButton jButton42;
    /**
     * A 43. mező gombja.
     */
    private javax.swing.JButton jButton43;
    /**
     * A 44. mező gombja.
     */
    private javax.swing.JButton jButton44;
    /**
     * A 45. mező gombja.
     */
    private javax.swing.JButton jButton45;
    /**
     * A 46. mező gombja.
     */
    private javax.swing.JButton jButton46;
    /**
     * A 47. mező gombja.
     */
    private javax.swing.JButton jButton47;
    /**
     * A 48. mező gombja.
     */
    private javax.swing.JButton jButton48;
    /**
     * A 49. mező gombja.
     */
    private javax.swing.JButton jButton49;
    /**
     * Az 5. mező gombja.
     */
    private javax.swing.JButton jButton5;
    /**
     * Az 50. mező gombja.
     */
    private javax.swing.JButton jButton50;
    /**
     * Az 51. mező gombja.
     */
    private javax.swing.JButton jButton51;
    /**
     * Az 52. mező gombja.
     */
    private javax.swing.JButton jButton52;
    /**
     * Az 53. mező gombja.
     */
    private javax.swing.JButton jButton53;
    /**
     * Az 54. mező gombja.
     */
    private javax.swing.JButton jButton54;
    /**
     * Az 55. mező gombja.
     */
    private javax.swing.JButton jButton55;
    /**
     * Az 56. mező gombja.
     */
    private javax.swing.JButton jButton56;
    /**
     * Az 57. mező gombja.
     */
    private javax.swing.JButton jButton57;
    /**
     * Az 58. mező gombja.
     */
    private javax.swing.JButton jButton58;
    /**
     * Az 59. mező gombja.
     */
    private javax.swing.JButton jButton59;
    /**
     * A 6. mező gombja.
     */
    private javax.swing.JButton jButton6;
    /**
     * A 60. mező gombja.
     */
    private javax.swing.JButton jButton60;
    /**
     * A 61. mező gombja.
     */
    private javax.swing.JButton jButton61;
    /**
     * A 62. mező gombja.
     */
    private javax.swing.JButton jButton62;
    /**
     * A 63. mező gombja.
     */
    private javax.swing.JButton jButton63;
    /**
     * A 64. mező gombja.
     */
    private javax.swing.JButton jButton64;
    /**
     * A 65. mező gombja.
     */
    private javax.swing.JButton jButton65;
    /**
     * A 66. mező gombja.
     */
    private javax.swing.JButton jButton66;
    /**
     * A 67. mező gombja.
     */
    private javax.swing.JButton jButton67;
    /**
     * A 68. mező gombja.
     */
    private javax.swing.JButton jButton68;
    /**
     * A 69. mező gombja.
     */
    private javax.swing.JButton jButton69;
    /**
     * A 7. mező gombja.
     */
    private javax.swing.JButton jButton7;
    /**
     * A 70. mező gombja.
     */
    private javax.swing.JButton jButton70;
    /**
     * A 71. mező gombja.
     */
    private javax.swing.JButton jButton71;
    /**
     * A 72. mező gombja.
     */
    private javax.swing.JButton jButton72;
    /**
     * A 73. mező gombja.
     */
    private javax.swing.JButton jButton73;
    /**
     * A 74. mező gombja.
     */
    private javax.swing.JButton jButton74;
    /**
     * A 75. mező gombja.
     */
    private javax.swing.JButton jButton75;
    /**
     * A 76. mező gombja.
     */
    private javax.swing.JButton jButton76;
    /**
     * A 77. mező gombja.
     */
    private javax.swing.JButton jButton77;
    /**
     * A 78. mező gombja.
     */
    private javax.swing.JButton jButton78;
    /**
     * A 79. mező gombja.
     */
    private javax.swing.JButton jButton79;
    /**
     * A 8. mező gombja.
     */
    private javax.swing.JButton jButton8;
    /**
     * A 80. mező gombja.
     */
    private javax.swing.JButton jButton80;
    /**
     * A 81. mező gombja.
     */
    private javax.swing.JButton jButton81;
    /**
     * Az Új játék gombja.
     */
    private javax.swing.JButton jButton82;
    /**
     * Az Újrakezdés gombja.
     */
    private javax.swing.JButton jButton83;
    /**
     * A 9. mező gombja.
     */
    private javax.swing.JButton jButton9;
    /**
     * Az aktuális játékazonosító megjelenítésére szolgáló Label.
     */
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
