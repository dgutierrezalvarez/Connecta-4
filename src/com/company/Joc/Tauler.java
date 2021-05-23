package com.company.Joc;

import java.io.Serializable;

public class Tauler implements Serializable {
    public static final long serialVersionUID = 1L;
    String[][] tauler = new String[5][5];
    int player = 0;

    public Tauler(String[][] tauler) {
        this.tauler = tauler;
    }

    public Tauler() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tauler[i][j] = "-" + "|";
            }
        }
    }

    public String[][] getTauler() {
        return tauler;
    }

    public Tauler mover(Tauler t, Mesura mesura) {
        player++;
        if (player == 1) {
            t.tauler[mesura.column][mesura.row] = "O" + "|";
        } else if (player == 2) {
            t.tauler[mesura.column][mesura.row] = "X" + "|";
            player = 0;
        }
        return t;
    }

    public String checkWinner(Tauler t) {
        String result;
        if (CheckWinner.checkWinnerX(t.tauler).equals("haganado X")) {
            result = CheckWinner.checkWinnerX(t.tauler);
            return result;
        } else if (CheckWinner.checkWinnerO(t.tauler).equals("haganado O")) {
            result = CheckWinner.checkWinnerO(t.tauler);
            return result;
        }
        return "null";
    }

    public void print() {
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                System.out.print(tauler[i][j]);
            }
            System.out.println();
        }
    }
}