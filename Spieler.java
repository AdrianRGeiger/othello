package othelloGUI;

import javafx.animation.PauseTransition;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;


public class Spieler {
    static Stage primaryStage; //um im Button auf die Stage zugreifen zu können
    static boolean test; //um das schließen des Fensters zu regulieren
    int order; //die Reihenfolge
    Random rnd; //Zufallszahlengenerator


    //initialisiert alle Variablen des Spielerobjekts
    public void initiator(int order,Random rnd) {
        this.order = order;
        this.rnd = rnd;
    }


    //gibt das Fenster aus, das den Spieler seine Eignabe tätigen lässt und wendet diese auch gleich auf das interne Spielfeld an
    public void spielenSpieler(Stage primaryStage) {
        test = true;

        GridPane root = gridersteller();

        //Szene implementieren

        //Beispielbutton der dem GridPane zugewiesen wird
        Button b = new Button("+");
        b.setOnMousePressed(
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent event) {
                        test = false;
                        //setzen der Koordinaten des angegeben Button in Move-Obekt und dieses letztermv von Main zuweisen
                        //dann Main.einfach.setMove(letztermv, 0);
                        Main.passzähler = 0;
                        Main.verwaltung(primaryStage);
                    }
                }
        );

        //Button zum Neustarten
        Button neustart = new Button("Neustarten");
        neustart.setOnMousePressed(
                new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent event) {
                        test = false;
                        Main.begrüßung(primaryStage);
                    }
                }
        );


        Spieler.primaryStage.show();
    }


    //erstellt ein Gridpane mit den gesetzten Spielsteinen und den möglichen Feldern
    //bedient sich der Züge Methode aus Feld
    public GridPane gridersteller() {
        char[][] züge = Main.einfach.züge(0);


        return new GridPane();
    }

}
