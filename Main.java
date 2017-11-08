package othelloGUI;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Random;


public class Main extends Application {
    static int passzähler;
    static int runde;
    static Move letztermv;
    static Feld einfach;
    static AI ki;
    static Spieler sp;
    static Stage primaryStage;

    //ruft die Begrüßung auf und setzt alle Variablen auf ihren Standard zurück
    public static void begrüßung(Stage primaryStage) {
        Main.primaryStage = primaryStage;
        letztermv = null;
        runde = 0;
        passzähler = 0;
        einfach = new Feld();
        sp.initiator(0, new Random());
        ki.init(1, 8, new Random());
        Spieler.primaryStage = primaryStage;

        //Begrüßungszene implementieren

        primaryStage.show();
        verwaltung(primaryStage);
    }


    //verwaltet das aufrufen des Fensters für den Spieler, die Zugberechnung der AI und überrüft ob ein Gewinner feststeht
    public static void verwaltung(Stage primaryStage) {
        runde++;
        if (passzähler == 2 || runde == 61) {
            einfach.sieg(primaryStage);
        }
        if (runde % 2 == 0) {
            letztermv = ki.nextMove(letztermv, sp.order, ki.order);
            einfach.setMove(letztermv, 1);
            verwaltung(primaryStage);
        } else {
            sp.spielenSpieler(primaryStage);
        }
    }



    @Override
    public void start(Stage primaryStage) throws Exception {

        //stage bearbeiten

        begrüßung(primaryStage);


    }



    public static void main(String[] args) {
        launch(args);
    }


}
