package com.sliit.readiobuttton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static RadioGroup radio_g;
    private static RadioButton radio_b;
    private static Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListnerButton();
    }


    //Toast used for display messages
    public void onClickListnerButton(){
        radio_g = (RadioGroup)findViewById(R.id.radioGroup);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radio_g.getCheckedRadioButtonId();
                radio_b = (RadioButton)findViewById(selected_id);
                Toast.makeText(MainActivity.this,
                        radio_b.getText().toString(),
                        Toast.LENGTH_SHORT).show();


            }
            });



    }
}
