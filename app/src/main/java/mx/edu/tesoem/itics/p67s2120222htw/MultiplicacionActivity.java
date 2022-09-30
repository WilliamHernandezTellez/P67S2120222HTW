package mx.edu.tesoem.itics.p67s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicacionActivity extends AppCompatActivity {
    EditText txtn5, txtn6;
    Button btncalcular3, btnregresa3;
    TextView lblresult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        txtn5 =findViewById(R.id.txtn5);
        txtn6 =findViewById(R.id.txtn6);
        lblresult3 =findViewById(R.id.lblresult3);
        btncalcular3 =findViewById(R.id.btncalcular3);
        btncalcular3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =Integer.parseInt(txtn5.getText().toString());
                int num2 =Integer.parseInt(txtn6.getText().toString());
                lblresult3.setText(String.valueOf(num1*num2));

            }
        });
        btnregresa3 = findViewById(R.id.btnregresa3);
        btnregresa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}