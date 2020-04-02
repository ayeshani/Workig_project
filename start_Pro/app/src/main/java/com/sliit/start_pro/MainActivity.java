package com.sliit.start_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText e1 =(EditText)findViewById(R.id.num1);
        EditText e2 =(EditText)findViewById(R.id.num2);
        TextView t1 =(TextView)findViewById(R.id.result);
        int Num1 = Integer.parseInt(e1.getText().toString());
        int Num2 = Integer.parseInt(e2.getText().toString());

        int sum = Num1+Num2;
        t1.setText(Integer.toString(sum));

    }


}
