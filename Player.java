package othelloGUI;

public interface Player {
    void init(int order, long t, java.util.Random rnd);
    //einmal am Anfang des Spiels aufgerufen, initialisiert AI
    //order: legt die Reihenfolge fest (0 = anfangen, 1 = 2ter Spieler9
    //t ist die übrige Zugzeit (8 s)
    //rnd ist ein Zufallsgenerator

    Move nextMove(Move prevMove, long tOpponent, long t);
    //returnt den Spielzug der AI
    //prevMove ist zuvorkommende Spielzug des Spielers --> null wenn Spieler passt
    //tOpponent ist die übrige Zugzeit des Spielers, der vorher gezogen hat
    //t ist die übrige Zugzeit der AI
}
