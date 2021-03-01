package com.example.project_1_suny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create button, connect to convertBtn
        Button convertBtn = (Button) findViewById(R.id.convertBtn);

        //set the listener, waits for the click
        convertBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Textboxes created and linked
                EditText decimal = (EditText) findViewById(R.id.editTextOne);
                TextView binary = (TextView) findViewById(R.id.textViewOne);

                //parse string to int, then convert to binary with toBinaryString(int)
                int num =Integer.parseInt(decimal.getText().toString());
                String num2 = Integer.toBinaryString(num);

                //link output textbox to converted variable
                binary.setText(num2);



            }
        });
    }
}
