package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editNota1;
    private EditText editNota2;
    private EditText editNota3;
    private CheckBox checkMedia1;
    private TextView textDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNota1 = findViewById(R.id.editNota1);
        editNota2 = findViewById(R.id.editNota2);
        editNota3 = findViewById(R.id.editNota3);
        checkMedia1 = findViewById(R.id.checkMedia1);
        textDivisao = findViewById(R.id.textDivisao);
    }

    public void calcula_media(View view) {

        String valorNotaUm = editNota1.getText().toString();
        String valorNotaDois = editNota2.getText().toString();
        String valorNotaTres = editNota3.getText().toString();
        double notaUm = Double.parseDouble(valorNotaUm);
        double notaDois = Double.parseDouble(valorNotaDois);
        double notaTres = Double.parseDouble(valorNotaTres);
        double media;

        if (checkMedia1.isChecked() == true){

            double a = notaUm * 1;
            double b = notaDois * 2;
            double c = notaTres * 3;
            media =(a+b+c)/6;

        }else{

            double somaNotas = notaUm + notaDois + notaTres;
            media = somaNotas/3;

        }

       /* DecimalFormat df = new DecimalFormat("#0.00");

        String formatado = "Nota: " + df.format(media);*/

        String nota = null;

        if (media >9){

            nota = "A";

        }else if (media <9 && media >8){

            nota = "B";

        }else if (media <8 && media >7){

            nota = "C";

        }else if (media <7 && media >4){

            nota = "D";

        }else if (media<4){

            nota = "F";
        }

        textDivisao.setText(nota);
    }
}
