package br.com.wesleymenezes.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        // Recebendo os dados enviados pela MainActivity
        String receivedString = getIntent().getStringExtra("STRING_KEY");
        double receivedDouble = getIntent().getDoubleExtra("DOUBLE_KEY", 0.0);
        int receivedInt = getIntent().getIntExtra("INT_KEY", 0);

        // Referenciando os TextViews e configurando os textos com os valores recebidos
        TextView textViewString = findViewById(R.id.text_view_string);
        TextView textViewDouble = findViewById(R.id.text_view_double);
        TextView textViewInt = findViewById(R.id.text_view_int);

        textViewString.setText("String: " + receivedString);
        textViewDouble.setText("Double: " + receivedDouble);
        textViewInt.setText("Int: " + receivedInt);
    }
}