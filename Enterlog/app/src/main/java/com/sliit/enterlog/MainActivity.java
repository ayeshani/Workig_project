package com.sliit.enterlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText pass_word;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListnerOnButton(){
        pass_word = (EditText)findViewById(R.id.txtPW);
        btn_submit=(Button)findViewById(R.id.btnEnter);

        btn_submit.setOnClickListener(
                new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,pass_word.getText(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
