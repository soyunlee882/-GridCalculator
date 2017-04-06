package syl.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_add,but_bal,but_pow,but_del;
    TextView textresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_1=(Button) findViewById(R.id.but_1);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        Button butPlus = (Button) findViewById(R.id.but_add);
        Button butMinus = (Button) findViewById(R.id.but_bal);
        Button butMultiply = (Button) findViewById(R.id.but_pow);
        Button butdivision = (Button) findViewById(R.id.but_del);
        textresult = (TextView) findViewById(R.id.textresult);




        butPlus.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                int re1=Integer.parseInt(num1.getText().toString());
                int re2=Integer.parseInt(num2.getText().toString());

                textresult.setText(re1+re2);


            }
        });

        butMinus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int re1=Integer.parseInt(num1.getText().toString());
                int re2=Integer.parseInt(num2.getText().toString());

                textresult.setText(re1-re2);


            }
        });

        butMultiply.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int re1=Integer.parseInt(num1.getText().toString());
                int re2=Integer.parseInt(num2.getText().toString());

                textresult.setText(re1*re2);


            }
        });

        butdivision.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int re1=Integer.parseInt(num1.getText().toString());
                int re2=Integer.parseInt(num2.getText().toString());

                textresult.setText(re1/re2);


            }
        });



    }
}
