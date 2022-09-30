package mx.edu.tesoem.itics.p67s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivisionActivity extends AppCompatActivity {
    EditText txtn7, txtn8;
    Button btncalcular4, btnregresa4;
    TextView lblresult4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        txtn7 =findViewById(R.id.txtn7);
        txtn8 =findViewById(R.id.txtn8);
        lblresult4 =findViewById(R.id.lblresult4);
        btncalcular4 =findViewById(R.id.btncalcula4);
        btncalcular4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtn7.getText().toString());
                int num2 = Integer.parseInt(txtn8.getText().toString());
                lblresult4.setText(String.valueOf(num1/num2));
            }
        });
        btnregresa4 = findViewById(R.id.btnregresa4);
        btnregresa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}