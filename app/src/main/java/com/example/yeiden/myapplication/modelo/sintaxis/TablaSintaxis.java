package com.example.yeiden.myapplication.modelo.sintaxis;

/**
 * Created by yeiden on 5/12/17.
 */

public class TablaSintaxis {
    private int[][] tabla;
    private String[] estados;
    private String[] trancisiones;
    private int [] estadoInicial;
    private int[] estadosFinales;

    public TablaSintaxis(){
        estados = new String[15];
        estados[0]="q0";
        estados[1]="q1";
        estados[2]="q2";
        estados[3]="q3";
        estados[4]="q4";
        estados[5]="q5";
        estados[6]="q6";
        estados[7]="q7";
        estados[8]="q8";
        estados[9]="q9";
        estados[10]="10";
        estados[11]="q11";
        estados[12]="q12";
        estados[13]="q13";
        estados[14]="q14";


        trancisiones = new String[9];
        trancisiones[0]="cerrar";
        trancisiones[1]="abrir";
        trancisiones[2]="pedido";
        trancisiones[3]="mesa";
        trancisiones[4]="#";
        trancisiones[5]="elemento";
        trancisiones[6]="sin";
        trancisiones[7]="con";
        trancisiones[8]="componente";


        estadoInicial=new int[1];
        estadoInicial[0] = 0;

        estadosFinales = new int[3];
        estadosFinales[0] = 3;
        estadosFinales[1] = 6;
        estadosFinales[2] = 13;

        tabla =new int[15][9];

        tabla[0][0]=1;
        tabla[0][1]=4;
        tabla[0][2]=7;
        tabla[0][3]=-1;
        tabla[0][4]=-1;
        tabla[0][5]=-1;
        tabla[0][6]=-1;
        tabla[0][7]=-1;
        tabla[0][8]=-1;


        tabla[1][0]=-1;
        tabla[1][1]=-1;
        tabla[1][2]=-1;
        tabla[1][3]=2;
        tabla[1][4]=-1;
        tabla[1][5]=-1;
        tabla[1][6]=-1;
        tabla[1][7]=-1;
        tabla[1][8]=-1;


        tabla[2][0]=-1;
        tabla[2][1]=-1;
        tabla[2][2]=-1;
        tabla[2][3]=-1;
        tabla[2][4]=3;
        tabla[2][5]=-1;
        tabla[2][6]=-1;
        tabla[2][7]=-1;
        tabla[2][8]=-1;


        tabla[3][0]=-1;
        tabla[3][1]=-1;
        tabla[3][2]=-1;
        tabla[3][3]=-1;
        tabla[3][4]=-1;
        tabla[3][5]=-1;
        tabla[3][6]=-1;
        tabla[3][7]=-1;
        tabla[3][8]=-1;


        tabla[4][0]=-1;
        tabla[4][1]=-1;
        tabla[4][2]=-1;
        tabla[4][3]=5;
        tabla[4][4]=-1;
        tabla[4][5]=-1;
        tabla[4][6]=-1;
        tabla[4][7]=-1;
        tabla[4][8]=-1;


        tabla[5][0]=-1;
        tabla[5][1]=-1;
        tabla[5][2]=-1;
        tabla[5][3]=-1;
        tabla[5][4]=6;
        tabla[5][5]=-1;
        tabla[5][6]=-1;
        tabla[5][7]=-1;
        tabla[5][8]=-1;


        tabla[6][0]=-1;
        tabla[6][1]=-1;
        tabla[6][2]=-1;
        tabla[6][3]=-1;
        tabla[6][4]=-1;
        tabla[6][5]=-1;
        tabla[6][6]=-1;
        tabla[6][7]=-1;
        tabla[6][8]=-1;


        tabla[7][0]=-1;
        tabla[7][1]=-1;
        tabla[7][2]=-1;
        tabla[7][3]=8;
        tabla[7][4]=-1;
        tabla[7][5]=-1;
        tabla[7][6]=-1;
        tabla[7][7]=-1;
        tabla[7][8]=-1;


        tabla[8][0]=-1;
        tabla[8][1]=-1;
        tabla[8][2]=-1;
        tabla[8][3]=-1;
        tabla[8][4]=9;
        tabla[8][5]=-1;
        tabla[8][6]=-1;
        tabla[8][7]=-1;
        tabla[8][8]=-1;


        tabla[9][0]=-1;
        tabla[9][1]=-1;
        tabla[9][2]=-1;
        tabla[9][3]=-1;
        tabla[9][4]=-1;
        tabla[9][5]=10;
        tabla[9][6]=-1;
        tabla[9][7]=-1;
        tabla[9][8]=-1;


        tabla[10][0]=-1;
        tabla[10][1]=-1;
        tabla[10][2]=-1;
        tabla[10][3]=-1;
        tabla[10][4]=-1;
        tabla[10][5]=-1;
        tabla[10][6]=11;
        tabla[10][7]=14;
        tabla[10][8]=-1;


        tabla[11][0]=-1;
        tabla[11][1]=-1;
        tabla[11][2]=-1;
        tabla[11][3]=-1;
        tabla[11][4]=-1;
        tabla[11][5]=-1;
        tabla[11][6]=-1;
        tabla[11][7]=-1;
        tabla[11][8]=12;


        tabla[12][0]=-1;
        tabla[12][1]=-1;
        tabla[12][2]=-1;
        tabla[12][3]=-1;
        tabla[12][4]=-13;
        tabla[12][5]=-1;
        tabla[12][6]=-1;
        tabla[12][7]=-1;
        tabla[12][8]=-1;


        tabla[14][0]=-1;
        tabla[14][1]=-1;
        tabla[14][2]=-1;
        tabla[14][3]=-1;
        tabla[14][4]=-1;
        tabla[14][5]=-1;
        tabla[14][6]=-1;
        tabla[14][7]=-1;
        tabla[14][8]=12;


    }

    public int moverMatriz(int estadoInicial, int trancision){
        return tabla [estadoInicial][trancision];

    }

    public int getEstado(String estado){
        int indice = -1;
        for (int i=0; i<=estados.length;i++){
            if (estado == estados[i]){
                indice = i;
            }
        }
        return indice;

    }

    public int getTrancision(String trancision){
        int indice = -1;
        for (int i=0; i<=trancisiones.length;i++){
            if (trancision == trancisiones[i]){
                indice = i;
            }
        }
        return indice;

    }

}
