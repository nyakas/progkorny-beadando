package beadando;

import java.io.IOException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Az új játéktér létrehozásához használt osztály.
 *
 * @author Boruzs Tibor
 *
 */
public class CreateGame {

    /**
     * Naplózási objektum deklarálása, és inicializálása.
     */

    protected static Logger logger = LoggerFactory.getLogger(CreateGame.class);
    /**
     * Ideiglenes tároló a játéktér alapállásához, új játék létrehozásához.
     */
    String temp;
    /**
     * A játéktereket tartalmazó xml állomány elérési útjának meghatározása az
     * osztálybetöltő segítségével.
     */
    private URL url = getClass().getClassLoader().getResource("game.xml");
    /**
     * Az elérési út szöveggé alakítása.
     */
    private String utvonal = url.toString();
    /**
     * Az elérési út felhasználható állapotba hozása.
     */
    String utvonal2 = utvonal.replace("file:", "");
    /**
     * XML feldolgozóhoz egy dokumentum változó létrehozása.
     */
    private Document doc;

    /**
     * Konstruktor, melyben a doc nevű változó kerül inicializálásra dom
     * feldolgozó által.<br>
     * a doc változó inicializálásánál használt utvonal2 változó értéke: <br>
     * {@code private URL url = getClass().getClassLoader().getResource("game.xml");}
     * <br> {@code private String utvonal = url.toString();} <br>
     * {@code String utvonal2 = utvonal.replace("file:", "");} <br>
     *
     * @throws ParserConfigurationException Beolvasás során kialakuló esetleges
     * elemző kivétel.
     * @throws SAXException Beolvasás során kialakuló esetleges SAX feldolgozó
     * kivétel.
     * @throws IOException Input output kivétel.
     */
    public CreateGame() throws ParserConfigurationException, SAXException, IOException {
        doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(utvonal2);
        logger.info("Loading game.xml...");
    }

    /**
     * A konstruktorban deklarált XML dokumentumból olvas ki egy karaktersort az
     * azonosító alapján és tér vissza vele.
     *
     * @param jatekszam A játékterek azonosítója az xml állományban.
     * @return A kiválasztott játékazonosító kiindulási állopa egy string
     * változóban.
     */
    public String Gamecreator(int jatekszam) {
        logger.info("Creating new game...");
        NodeList nl = doc.getElementsByTagName("game");
        for (int i = 0; i < nl.getLength(); i++) {
            Element GameElement = (Element) nl.item(i);
            if (GameElement.getAttribute("id")
                    .equals(String.valueOf(jatekszam))) {
                temp = GameElement.getTextContent();
            }
        }
        logger.info("New Game created.");
        return temp;
    }
}
