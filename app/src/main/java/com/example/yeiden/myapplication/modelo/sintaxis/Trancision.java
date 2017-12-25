package com.example.yeiden.myapplication.modelo.sintaxis;

/**
 * Created by yeiden on 5/12/17.
 */

public class Trancision {

    public String validarTrancision(String token) {
        token = token.toUpperCase();
        String trancision = null;
        switch (token) {
            case "CERRAR":
                trancision = "cerrar";
                break;
            case "ABRIR":
                trancision = "abrir";
                break;
            case "PEDIDO":
                trancision = "pedido";
                break;
            case "MESA":
                trancision = "mesa";
                break;
            case "SIN":
                trancision = "sin";
                break;
            case "CON":
                trancision = "con";
                break;

        }
        return token;

      /*  if (trancision == null && StringUtils.isNumeric()){
            try {
                int i=Integer.parseInt(token);
                trancision = "#";
            }
            catch (Exception){

            }

        }*/
    }
}
