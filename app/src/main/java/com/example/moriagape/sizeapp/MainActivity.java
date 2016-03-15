package com.example.moriagape.sizeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText Input;
    private Button Convert;
    private Button us;
    private Button uk;
    private Button euro;
    private Button cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

            Input = (EditText) findViewById(R.id.input);
            Convert = (Button) findViewById(R.id.convert);
            uk = (Button) findViewById(R.id.uktext);
            us = (Button) findViewById(R.id.ustext);
            euro = (Button) findViewById(R.id.eutext);
            cm = (Button) findViewById(R.id.cmtext);


        final HashMap <String, Double> sizes = new HashMap<>();



            sizes.put("UK0",4.0);
            sizes.put("US0",3.0);
            sizes.put("EU0",36.0);
            sizes.put("CM0",22.5);
        sizes.put("UK1",4.5);
        sizes.put("US1",3.5);
        sizes.put("EU1",37.0);
        sizes.put("CM1",23.0);

        sizes.put("UK2",5.0);
        sizes.put("US2",4.0);
        sizes.put("EU2",37.5);
        sizes.put("CM2",23.5);

        sizes.put("UK3",5.5);
        sizes.put("US3",4.5);
        sizes.put("EU3",38.0);
        sizes.put("CM3",24.0);

        sizes.put("UK4",6.0);
        sizes.put("US4",5.0);
        sizes.put("EU4",39.0);
        sizes.put("CM4",24.5);

        sizes.put("UK5",6.5);
        sizes.put("US5",5.5);
        sizes.put("EU5",39.5);
        sizes.put("CM5",25.0);


            Convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            if ((Input.getText().toString().length() > 0) ) {
                                Integer A = Integer.parseInt(Input.getText().toString());
                                if (A > 0) {
                                    us.setText(Double.toString(sizes.get("UK0")));
                                    uk.setText(Double.toString(sizes.get("US0")));
                                    euro.setText(Double.toString(sizes.get("EU0")));
                                    cm.setText(Double.toString(sizes.get("CM0")));
                                    //cm.setText(Double.toString(sizes[0][0]));
                                } else
                                    Toast.makeText(MainActivity.this, "text field empty", Toast.LENGTH_LONG).show();
                            }else
                                Toast.makeText(MainActivity.this, "text field empty", Toast.LENGTH_LONG).show();

                        }
                    }

                        try  {
                            InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                        } catch (Exception e) {


                    }

                }


            });


        }
    }


