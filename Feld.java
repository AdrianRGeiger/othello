package othelloGUI;

import javafx.stage.Stage;

public class Feld {
    public char[][] Spielfeld; //das Spielfeld

    //Konstruktor der die Anfangssituation des Spielfdelds setzt
    //w = weiß = Spieler 2 und s = schwarz = Spieler 1
    public Feld() {
        this.Spielfeld[3][3] = 'w';
        this.Spielfeld[4][4] = 'w';
        this.Spielfeld[3][4] = 's';
        this.Spielfeld[4][3] = 's';
    }

    //nimmt den Spielzug an, setzt ihn um und ruft Methode auf die Spielsteine entsprechend umdreht
    //i = 0 für spieler und i = 1 für AI
    public void setMove(Move oj, int i) {
        if (i == 0) {
            Spielfeld[oj.x][oj.y] = 's';
        } else Spielfeld[oj.x][oj.y] = 'w';

        umdrehen(oj, i);
    }

    //dreht die Spielsteine dess Gegners um
    public void umdrehen(Move oj, int i) {

    }

    //erstellt ein char array das für jedes Feld ein X (kein Zug) oder O (möglicher Zug)enthält
    //i = 0 für spieler und i = 1 für AI
    public char[][] züge(int i) {

        return null;
    }

    //wird aufgerufen wenn entweder zweimal nacheinander gepasst wurde oder das Spielfeld voll ist
    //zählt die Anzahl der Spielsteine die jeder Spieler auf dem Feld hat
    //Gibt das Fenster aus mit dem Gewinner und der Option zum Beenden oder Neustarten
    public void sieg(Stage primaryStage) {

    }
}
