package mx.edu.tesoem.itics.p67s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {
    EditText txtn3, txtn4;
    Button btncalcular2, btnregresa2;
    TextView lblresult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        txtn3 =findViewById(R.id.txtn3);
        txtn4 =findViewById(R.id.txtn4);
        lblresult2 =findViewById(R.id.lblresult2);
        btncalcular2=findViewById(R.id.btncalcular2);
        btncalcular2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtn3.getText().toString());
                int num2 = Integer.parseInt(txtn4.getText().toString());
                lblresult2.setText(String.valueOf(num1-num2));
            }
        });
        btnregresa2=findViewById(R.id.btnregresa2);
        btnregresa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}