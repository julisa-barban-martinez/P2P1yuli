package jbm.example.p2p1yuli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button suma, resta, multiplicacion, division;
    RadioButton rmasculino, rfemenino;
    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenino = (RadioButton) findViewById(R.id.rfemenino);

        num1 =  findViewById(R.id.editText);
        num2 =  findViewById(R.id.editText2);

        suma = findViewById(R.id.sumar);
        resta = findViewById(R.id.restar);
        multiplicacion =  findViewById(R.id.multiplicar);
        division = findViewById(R.id.dividir);

        Resultado= findViewById(R.id.Resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);

        int rta=0;

        switch (v.getId()){
            case R.id.sumar:
                rta=entero1+entero2;
                break;
            case R.id.restar:
                rta=entero1-entero2;
                break;
            case R.id.multiplicar:
                rta=entero1*entero2;
                break;
            case R.id.dividir:
                rta=entero1/entero2;
                break;

        }

        Resultado.setText(""+rta);

    }
    public void invocamensaje(View view){
        if(rmasculino.isChecked()){
            Toast.makeText(this,"selecciono masculino",Toast.LENGTH_LONG).show();
        }
        if(rfemenino.isChecked()){
            Toast.makeText(this, "selecciono femenino", Toast.LENGTH_SHORT).show();
        }
    }
}
