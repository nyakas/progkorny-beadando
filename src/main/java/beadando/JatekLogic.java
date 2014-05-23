package beadando;

import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Sudoku játék szabályainak működési logikáját megvalósító, implementált
 * osztály.
 *
 * @author Boruzs Tibor
 */
public class JatekLogic extends javax.swing.JFrame {

    /**
     * Naplózási objektum deklarálása, és inicializálása.
     */

    protected static Logger logger = LoggerFactory.getLogger(JatekLogic.class);
    /**
     * A frissítendő elem pozícióját tároló változó inicializálása.
     */
    public int pozicio;
    /**
     * A beillesztendő új érték.
     */
    public int ertek;
    /**
     * A már bennt lévő érték.
     */
    public int eredetiErtek;
    /**
     * A Bevitel osztályból származó,
     * {@link #kivalasztottAtad() kivalasztottAtad} metódus visszatérési
     * értékének tárolása.
     */
    int ujErtek;
    /**
     * Az aktuális állása a játéktérnek egy tömbben.
     */
    int[] tomb = new int[83];
    /**
     * Program futtatási mód jelző (teszt, vagy éles).
     */
    String flag = "";

    /**
     * Az osztály iniciálizálását elvégző konstruktor.
     *
     * @param pozicio A kiválasztott pozíció, ahova új értéket akar beszúrni a
     * felhasználó, vagy értéket akar frissíteni.
     * @param ertek A beszurandó új érték.
     * @param eredetiErtek A beszúrás, vagy frissítés előtt a kiválasztott
     * mezőben szereplő érték.
     * @param allas A Sudoku tábla aktuális állapota.
     * @param flag Jelző, hogy tesztben fut a program, vagy pedig élesen.
     */
    public JatekLogic(int pozicio, int ertek, int eredetiErtek, int[] allas, String flag) {
        this.pozicio = pozicio;
        this.ertek = ertek;
        this.eredetiErtek = eredetiErtek;
        this.tomb = allas;
        //ujErtek = 0;
        this.flag = flag;
    }

    /**
     * A játék szabályait működésében követő metódus, ami biztosítja a játék
     * szabályok szerinti lefolyását, mint azonos sor oszlop, valamint kis
     * 3*3-as résztáblákba nem kerülhet kétszer ugyan az a számjegy.
     *
     * @return Visszatér az értékkel, ami vagy az újonnan beírandó, vagy pedig
     * az eredeti.
     */
    public int logika() {
        int sor = 0;
        if (eredetiErtek != 0) {
            if (flag == "eles") {
                JOptionPane.showMessageDialog(getParent(), "Nem felülírható!");
                logger.info("Can't overwrite the value: " + eredetiErtek);
            }
            ujErtek = ertek;
        } else {
            Bevitel bevitel = new Bevitel(this, rootPaneCheckingEnabled);
            if (flag == "eles") {

                bevitel.setlabel(ertek);
                bevitel.setVisible(true);
                ujErtek = bevitel.kivalasztottAtad();
                logger.info("Choose a new value...");
            }
            if (flag == "teszt") {
                ujErtek = ertek;
            }
            logger.info("Logic class is working on the value and the table...");
            sor = pozicio / 9;
            int tartalmazo = 0;
            int oszlop = pozicio % 9;

            if (ujErtek == 0) {
                return ujErtek;
            }
            for (int i = (sor * 9); i <= ((sor) * 9) + 1; i++) {
                if (tomb[i] == ujErtek) {
                    ++tartalmazo;
                    if (pozicio == i && ujErtek == ertek) {
                        --tartalmazo;
                    }
                }
            }
            for (int i = oszlop; i < 83; i = i + 9) {
                if (tomb[i] == ujErtek) {
                    ++tartalmazo;
                }
                if (pozicio == i && ujErtek == ertek) {
                    --tartalmazo;
                }
            }
            switch (pozicio) {
                case 1:
                case 2:
                case 3:
                case 10:
                case 11:
                case 12:
                case 19:
                case 20:
                case 21: {
                    if (tomb[1] == ujErtek || tomb[2] == ujErtek
                            || tomb[3] == ujErtek || tomb[10] == ujErtek
                            || tomb[11] == ujErtek || tomb[12] == ujErtek
                            || tomb[19] == ujErtek || tomb[20] == ujErtek
                            || tomb[21] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 1 && ujErtek == ertek)
                                || (pozicio == 2 && ujErtek == ertek)
                                || (pozicio == 3 && ujErtek == ertek)
                                || (pozicio == 10 && ujErtek == ertek)
                                || (pozicio == 11 && ujErtek == ertek)
                                || (pozicio == 12 && ujErtek == ertek)
                                || (pozicio == 19 && ujErtek == ertek)
                                || (pozicio == 20 && ujErtek == ertek)
                                || (pozicio == 21 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }

                case 4:
                case 5:
                case 6:
                case 13:
                case 14:
                case 15:
                case 22:
                case 23:
                case 24: {
                    if (tomb[4] == ujErtek || tomb[5] == ujErtek
                            || tomb[6] == ujErtek || tomb[13] == ujErtek
                            || tomb[14] == ujErtek || tomb[15] == ujErtek
                            || tomb[22] == ujErtek || tomb[23] == ujErtek
                            || tomb[24] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 4 && ujErtek == ertek)
                                || (pozicio == 5 && ujErtek == ertek)
                                || (pozicio == 6 && ujErtek == ertek)
                                || (pozicio == 13 && ujErtek == ertek)
                                || (pozicio == 14 && ujErtek == ertek)
                                || (pozicio == 15 && ujErtek == ertek)
                                || (pozicio == 22 && ujErtek == ertek)
                                || (pozicio == 23 && ujErtek == ertek)
                                || (pozicio == 24 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 7:
                case 8:
                case 9:
                case 16:
                case 17:
                case 18:
                case 25:
                case 26:
                case 27: {
                    if (tomb[7] == ujErtek || tomb[8] == ujErtek
                            || tomb[9] == ujErtek || tomb[16] == ujErtek
                            || tomb[17] == ujErtek || tomb[18] == ujErtek
                            || tomb[25] == ujErtek || tomb[26] == ujErtek
                            || tomb[27] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 7 && ujErtek == ertek)
                                || (pozicio == 8 && ujErtek == ertek)
                                || (pozicio == 9 && ujErtek == ertek)
                                || (pozicio == 16 && ujErtek == ertek)
                                || (pozicio == 17 && ujErtek == ertek)
                                || (pozicio == 18 && ujErtek == ertek)
                                || (pozicio == 25 && ujErtek == ertek)
                                || (pozicio == 26 && ujErtek == ertek)
                                || (pozicio == 27 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 28:
                case 29:
                case 30:
                case 37:
                case 38:
                case 39:
                case 46:
                case 47:
                case 48: {
                    if (tomb[28] == ujErtek || tomb[29] == ujErtek
                            || tomb[30] == ujErtek || tomb[37] == ujErtek
                            || tomb[38] == ujErtek || tomb[39] == ujErtek
                            || tomb[46] == ujErtek || tomb[47] == ujErtek
                            || tomb[48] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 28 && ujErtek == ertek)
                                || (pozicio == 29 && ujErtek == ertek)
                                || (pozicio == 30 && ujErtek == ertek)
                                || (pozicio == 37 && ujErtek == ertek)
                                || (pozicio == 38 && ujErtek == ertek)
                                || (pozicio == 39 && ujErtek == ertek)
                                || (pozicio == 46 && ujErtek == ertek)
                                || (pozicio == 47 && ujErtek == ertek)
                                || (pozicio == 48 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 31:
                case 32:
                case 33:
                case 40:
                case 41:
                case 42:
                case 49:
                case 50:
                case 51: {
                    if (tomb[31] == ujErtek || tomb[32] == ujErtek
                            || tomb[33] == ujErtek || tomb[40] == ujErtek
                            || tomb[41] == ujErtek || tomb[42] == ujErtek
                            || tomb[49] == ujErtek || tomb[50] == ujErtek
                            || tomb[51] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 31 && ujErtek == ertek)
                                || (pozicio == 32 && ujErtek == ertek)
                                || (pozicio == 33 && ujErtek == ertek)
                                || (pozicio == 40 && ujErtek == ertek)
                                || (pozicio == 41 && ujErtek == ertek)
                                || (pozicio == 42 && ujErtek == ertek)
                                || (pozicio == 49 && ujErtek == ertek)
                                || (pozicio == 50 && ujErtek == ertek)
                                || (pozicio == 51 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 34:
                case 35:
                case 36:
                case 43:
                case 44:
                case 45:
                case 52:
                case 53:
                case 54: {
                    if (tomb[34] == ujErtek || tomb[35] == ujErtek
                            || tomb[36] == ujErtek || tomb[43] == ujErtek
                            || tomb[44] == ujErtek || tomb[45] == ujErtek
                            || tomb[52] == ujErtek || tomb[53] == ujErtek
                            || tomb[54] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 34 && ujErtek == ertek)
                                || (pozicio == 35 && ujErtek == ertek)
                                || (pozicio == 36 && ujErtek == ertek)
                                || (pozicio == 43 && ujErtek == ertek)
                                || (pozicio == 44 && ujErtek == ertek)
                                || (pozicio == 45 && ujErtek == ertek)
                                || (pozicio == 52 && ujErtek == ertek)
                                || (pozicio == 53 && ujErtek == ertek)
                                || (pozicio == 54 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 55:
                case 56:
                case 57:
                case 64:
                case 65:
                case 66:
                case 73:
                case 74:
                case 75: {
                    if (tomb[55] == ujErtek || tomb[56] == ujErtek
                            || tomb[57] == ujErtek || tomb[64] == ujErtek
                            || tomb[65] == ujErtek || tomb[66] == ujErtek
                            || tomb[73] == ujErtek || tomb[74] == ujErtek
                            || tomb[75] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 55 && ujErtek == ertek)
                                || (pozicio == 56 && ujErtek == ertek)
                                || (pozicio == 57 && ujErtek == ertek)
                                || (pozicio == 64 && ujErtek == ertek)
                                || (pozicio == 65 && ujErtek == ertek)
                                || (pozicio == 66 && ujErtek == ertek)
                                || (pozicio == 73 && ujErtek == ertek)
                                || (pozicio == 74 && ujErtek == ertek)
                                || (pozicio == 75 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 58:
                case 59:
                case 60:
                case 67:
                case 68:
                case 69:
                case 76:
                case 77:
                case 78: {
                    if (tomb[58] == ujErtek || tomb[59] == ujErtek
                            || tomb[60] == ujErtek || tomb[67] == ujErtek
                            || tomb[68] == ujErtek || tomb[69] == ujErtek
                            || tomb[76] == ujErtek || tomb[77] == ujErtek
                            || tomb[78] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 58 && ujErtek == ertek)
                                || (pozicio == 59 && ujErtek == ertek)
                                || (pozicio == 60 && ujErtek == ertek)
                                || (pozicio == 67 && ujErtek == ertek)
                                || (pozicio == 68 && ujErtek == ertek)
                                || (pozicio == 69 && ujErtek == ertek)
                                || (pozicio == 76 && ujErtek == ertek)
                                || (pozicio == 77 && ujErtek == ertek)
                                || (pozicio == 78 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }
                case 61:
                case 62:
                case 63:
                case 70:
                case 71:
                case 72:
                case 79:
                case 80:
                case 81: {
                    if (tomb[61] == ujErtek || tomb[62] == ujErtek
                            || tomb[63] == ujErtek || tomb[70] == ujErtek
                            || tomb[71] == ujErtek || tomb[72] == ujErtek
                            || tomb[79] == ujErtek || tomb[80] == ujErtek
                            || tomb[81] == ujErtek) {
                        ++tartalmazo;
                        if ((pozicio == 61 && ujErtek == ertek)
                                || (pozicio == 62 && ujErtek == ertek)
                                || (pozicio == 63 && ujErtek == ertek)
                                || (pozicio == 70 && ujErtek == ertek)
                                || (pozicio == 71 && ujErtek == ertek)
                                || (pozicio == 72 && ujErtek == ertek)
                                || (pozicio == 79 && ujErtek == ertek)
                                || (pozicio == 80 && ujErtek == ertek)
                                || (pozicio == 81 && ujErtek == ertek)) {
                            --tartalmazo;
                        }
                    }
                    break;
                }

            }
            if (tartalmazo != 0) {
                if (flag == "eles") {
                    JOptionPane.showMessageDialog(getParent(), "Nem beírható!");
                    logger.info("Can't insert the value: " + ertek);
                }
                ujErtek = ertek;
            }

        }

        logger.info("New value acccepted: " + ujErtek);
        return ujErtek;

    }
}
