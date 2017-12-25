package com.example.yeiden.myapplication;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit_message;
    Button button_escuchar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_message = (EditText) findViewById(R.id.edit_message);
        button_escuchar = (Button) findViewById(R.id.button_escuchar);

        escuchar();

    }

    //Método para activar el boton

    public void escuchar() {
        button_escuchar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Aquí va el codigo
                        String [] palabras = edit_message.getText().toString().split(" ");


                        if (palabras[0].equals("cerrar") && palabras[1].equals("mesa") && isNumeric(palabras[2]))
                        {
                            Toast.makeText(getApplicationContext(), "Opcion CERRAR correcta!!\n Estado: q3",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else if (palabras[0].equals("abrir") && palabras[1].equals("mesa") && isNumeric(palabras[2]))
                        {
                            Toast.makeText(getApplicationContext(), "Opcion ABRIR correcta!!\n Estado: q6",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else if (palabras[0].equals("pedido") && palabras[1].equals("mesa") && isNumeric(palabras[2]))
                        {
                            Toast.makeText(getApplicationContext(), "Te faltó completar la frase para hacer un pedido!!\n Estado: q9",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else if (palabras[0].equals("pedido") && palabras[1].equals("mesa") && isNumeric(palabras[2]) && palabras[4].equals("sin") && isNumeric(palabras[6]))
                        {
                            Toast.makeText(getApplicationContext(), "Opcion ORDEN SIN correcta!!\n Estado: q13",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else if (palabras[0].equals("pedido") && palabras[1].equals("mesa") && isNumeric(palabras[2]) && palabras[4].equals("con") && isNumeric(palabras[6]))
                        {
                            Toast.makeText(getApplicationContext(), "Opcion ORDEN CON correcta!!\n Estado: q13",
                                    Toast.LENGTH_SHORT).show();
                        }

                        else {
                            Toast.makeText(getApplicationContext(), "Error \n Estado: -1",
                                    Toast.LENGTH_SHORT).show();
                        }



                        /*if (isNumeric(palabras[2]) == true)
                        {
                            Toast.makeText(getApplicationContext(), "En la pocisión tres SI hay un numero"+palabras[2],
                                    Toast.LENGTH_SHORT).show();
                        }
                                */

                    }
                }
        );
    }

    //VALIDAR SI EL COSTO ES NÚMERICO
    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");

    }


}
