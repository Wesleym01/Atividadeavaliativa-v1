package br.com.wesleymenezes.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSendData = findViewById(R.id.button_send_data);
        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                // Enviando diferentes tipos de dados
                intent.putExtra("STRING_KEY", "Olá, Mundo!");
                intent.putExtra("DOUBLE_KEY", 3.14159);
                intent.putExtra("INT_KEY", 42);

                startActivity(intent);
            }
        });
    }
}