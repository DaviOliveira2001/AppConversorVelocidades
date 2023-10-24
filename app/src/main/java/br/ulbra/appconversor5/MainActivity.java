package br.ulbra.appconversor5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtQuil, edtMil;

    Button btnConverter;

    TextView txtResultado;

    double v1, v2, calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMil = (EditText) findViewById(R.id.edtM);
        edtQuil = (EditText) findViewById(R.id.edtQ);
        btnConverter = (Button) findViewById(R.id.btnConv);
        txtResultado = (TextView) findViewById(R.id.txtResposta);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtQuil.getText().toString().equals("")){
                    v2 = Double.parseDouble(edtMil.getText().toString());
                    calculo = v2 / 0.621371;
                    txtResultado.setText(v2+" milhas em quilômetros é "+calculo);
                }else{
                    v1 = Double.parseDouble(edtQuil.getText().toString());
                    calculo = v1 * 0.621371;
                    txtResultado.setText(v1+" quilômetros em milhas é "+calculo);
                }
            }
        });
    }
}