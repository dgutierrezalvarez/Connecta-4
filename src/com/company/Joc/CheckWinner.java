package com.company.Joc;

public class CheckWinner {

    public static String checkWinnerX(String[][] tauler) {

        //Combinaciones

        String ganadorX;
        if (tauler[0][0].equals("X" + "|") && tauler[0][1].equals("X" + "|") && tauler[0][2].equals("X" + "|") && tauler[0][3].equals("X")) {
            ganadorX = "haganado X";
            return ganadorX;
        } else if (tauler[1][0].equals("X" + "|") && tauler[1][1].equals("X" + "|") && tauler[1][2].equals("X" + "|") && tauler[1][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[2][0].equals("X" + "|") && tauler[2][1].equals("X" + "|") && tauler[2][2].equals("X" + "|") && tauler[2][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[3][0].equals("X" + "|") && tauler[3][1].equals("X" + "|") && tauler[3][2].equals("X" + "|") && tauler[3][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[4][0].equals("X" + "|") && tauler[4][1].equals("X" + "|") && tauler[4][2].equals("X" + "|") && tauler[4][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[0][1].equals("X" + "|") && tauler[0][2].equals("X" + "|") && tauler[0][3].equals("X" + "|") && tauler[0][4].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }


        else if (tauler[0][0].equals("X" + "|") && tauler[1][0].equals("X" + "|") && tauler[2][0].equals("X" + "|") && tauler[3][0].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[0][1].equals("X" + "|") && tauler[1][1].equals("X" + "|") && tauler[2][1].equals("X" + "|") && tauler[3][1].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[0][2].equals("X" + "|") && tauler[1][2].equals("X" + "|") && tauler[2][2].equals("X" + "|") && tauler[3][2].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[0][3].equals("X" + "|") && tauler[1][3].equals("X" + "|") && tauler[2][3].equals("X" + "|") && tauler[3][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        }else if (tauler[0][4].equals("X" + "|") && tauler[1][4].equals("X" + "|") && tauler[2][4].equals("X" + "|") && tauler[3][4].equals("X" + "|") ) {

        }


        else if (tauler[0][0].equals("X" + "|") && tauler[1][1].equals("X" + "|") && tauler[2][2].equals("X" + "|") && tauler[3][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        } else if (tauler[0][1].equals("X" + "|") && tauler[1][2].equals("X" + "|") && tauler[2][3].equals("X" + "|") && tauler[3][4].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        } else if (tauler[1][0].equals("X" + "|") && tauler[2][1].equals("X" + "|") && tauler[3][2].equals("X" + "|") && tauler[4][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        } else if (tauler[4][0].equals("X" + "|") && tauler[3][1].equals("X" + "|") && tauler[2][2].equals("X" + "|") && tauler[1][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        } else if (tauler[3][0].equals("X" + "|") && tauler[2][1].equals("X" + "|") && tauler[1][2].equals("X" + "|") && tauler[0][3].equals("X" + "|") ) {
            ganadorX = "haganado X";
            return ganadorX;
        } else if (tauler[4][1].equals("X" + "|") && tauler[3][2].equals("X" + "|") && tauler[2][3].equals("X" + "|") && tauler[1][4].equals("X" + "|") ) {

        }
        return "null";
    }

    public static String checkWinnerO(String[][] tauler) {

        //Combinaciones

        String ganadorO;
        if (tauler[0][0].equals("O" + "|") && tauler[0][1].equals("O" + "|") && tauler[0][2].equals("O" + "|") && tauler[0][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        } else if (tauler[1][0].equals("O" + "|") && tauler[1][1].equals("O" + "|") && tauler[1][2].equals("O" + "|") && tauler[1][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }else if (tauler[2][0].equals("O" + "|") && tauler[2][1].equals("O" + "|") && tauler[2][2].equals("O" + "|") && tauler[2][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }else if (tauler[3][0].equals("O" + "|") && tauler[3][1].equals("O" + "|") && tauler[3][2].equals("O" + "|") && tauler[3][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }else if (tauler[4][0].equals("O" + "|") && tauler[4][1].equals("O" + "|") && tauler[4][2].equals("X" + "|") && tauler[4][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }else if (tauler[0][1].equals("O" + "|") && tauler[0][2].equals("O" + "|") && tauler[0][3].equals("O" + "|") && tauler[0][4].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }


        else if (tauler[0][0].equals("O" + "|") && tauler[1][0].equals("O" + "|") && tauler[2][0].equals("O" + "|") && tauler[3][0].equals("O" + "|") ) {
            System.out.println("Winner O");
        }else if (tauler[0][1].equals("O" + "|") && tauler[1][1].equals("O" + "|") && tauler[2][1].equals("O" + "|") && tauler[3][1].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }else if (tauler[0][2].equals("O" + "|") && tauler[1][2].equals("O" + "|") && tauler[2][2].equals("O" + "|") && tauler[3][2].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }else if (tauler[0][3].equals("O" + "|") && tauler[1][3].equals("O" + "|") && tauler[2][3].equals("O" + "|") && tauler[3][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }
        else if (tauler[0][4].equals("O" + "|") && tauler[1][4].equals("O" + "|") && tauler[2][4].equals("O" + "|") && tauler[3][4].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }


        else if (tauler[0][0].equals("O" + "|") && tauler[1][1].equals("O" + "|") && tauler[2][2].equals("O" + "|") && tauler[3][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        } else if (tauler[0][1].equals("O" + "|") && tauler[1][2].equals("O" + "|") && tauler[2][3].equals("O" + "|") && tauler[3][4].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        } else if (tauler[1][0].equals("O" + "|") && tauler[2][1].equals("O" + "|") && tauler[3][2].equals("O" + "|") && tauler[4][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        } else if (tauler[4][0].equals("O" + "|") && tauler[3][1].equals("O" + "|") && tauler[2][2].equals("O" + "|") && tauler[1][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        } else if (tauler[3][0].equals("O" + "|") && tauler[2][1].equals("O" + "|") && tauler[1][2].equals("O" + "|") && tauler[0][3].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        } else if (tauler[4][1].equals("O" + "|") && tauler[3][2].equals("O" + "|") && tauler[2][3].equals("O" + "|") && tauler[1][4].equals("O" + "|") ) {
            ganadorO = "haganado O";
            return ganadorO;
        }

        return "null";

    }
}