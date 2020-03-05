package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView textView1;
    private Button btn_sumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.txt_num1);
        editText2 = (EditText) findViewById(R.id.txt_num2);
        textView1 = (TextView) findViewById(R.id.txt_resultado);
        btn_sumar = (Button) findViewById(R.id.button_suma);
        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultado = String.valueOf(sumar(Integer.parseInt(editText1.getText().toString()),Integer.parseInt(editText2.getText().toString())));

                textView1.setText(resultado);
            }
        });
    }
    public int sumar(int a, int b){




        int suma = a + b;
        return suma;


    }


}
