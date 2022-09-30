package mx.edu.tesoem.itics.p67s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principalActivity extends AppCompatActivity {

    Button btnsuma, btnresta, btnmult, btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnsuma =findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmult = findViewById(R.id.btnmult);
        btndiv = findViewById(R.id.btndiv);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(principalActivity.this, SumaActivity.class);
                startActivity(intent);
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(principalActivity.this, RestaActivity.class);
                startActivity(intent);
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(principalActivity.this, MultiplicacionActivity.class);
                startActivity(intent);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(principalActivity.this, DivisionActivity.class);
                startActivity(intent);
            }
        });
    }
}
