package com.sliit.checking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox check1,check2,check3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }

    //if not click any button and if click check box show the message check box is selected
    public void addListnerToCheckBox(){
        check1 = (CheckBox)findViewById(R.id.cb_dog);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(MainActivity.this,
                                    "Dog is selected", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                );
    }

    public void addListnerOnButton(){
        check1 = (CheckBox)findViewById(R.id.cb_dog);
        check2 = (CheckBox)findViewById(R.id.cb_cat);
        check3 = (CheckBox)findViewById(R.id.cb_cow);
        button = (Button)findViewById(R.id.select);

        //display the message click the checks box and after click the button
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Dog:").append(check1.isChecked());
                result.append("\nCat:").append(check2.isChecked());
                result.append("\nCow:").append(check3.isChecked());

                Toast.makeText(MainActivity.this,result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });

    }
}
