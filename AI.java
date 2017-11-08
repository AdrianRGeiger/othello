package othelloGUI;

import java.util.Random;

public class AI implements Player {
    int order;
    long time;
    Random rnd;

    @Override
    public void init(int order, long t, Random rnd) {
        this.order = order;
        this.time = t;
        this.rnd = rnd;
    }

    @Override
    public Move nextMove(Move prevMove, long tOpponent, long t) {
        char[][] züge = Main.einfach.züge(1);
        int leer = 0;
        for (int i = 0; i < züge.length; i++) {
            for (int j = 0; j < züge.length; j++) {
                if (züge[i][j] == 'O') leer++;
            }
        }
        if (leer == 0) {
            Main.passzähler++;
            return null;
        }

        Main.passzähler = 0;
        //mit rnd Zufallszug auswählen aus züge und als Move Objekt ausgeben
        return null;
    }

    public void spielenAI() {

    }
}
