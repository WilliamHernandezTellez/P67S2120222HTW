package mx.edu.tesoem.itics.p67s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    EditText txtn1, txtn2;
    Button btncalcular, btnregresa;
    TextView lblresult;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        txtn1=findViewById(R.id.txtn1);
        txtn2=findViewById(R.id.txtn2);
        lblresult =findViewById(R.id.lblresult);
        btncalcular=findViewById(R.id.btncalcular);
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =Integer.parseInt(txtn1.getText().toString());
                int num2 =Integer.parseInt(txtn2.getText().toString());
                lblresult.setText(String.valueOf(num1 +num2));
            }
        });
        btnregresa=findViewById(R.id.btnregresa);
        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}
