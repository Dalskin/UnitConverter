package com.djs0039.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import java.util.Date;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKm, txtMi, txtKg, txtLb, txtL, txtGal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKm = findViewById(R.id.txtKm);
        txtMi = findViewById(R.id.txtMi);
        txtKg = findViewById(R.id.txtKg);
        txtLb = findViewById(R.id.txtLb);
        txtL = findViewById(R.id.txtL);
        txtGal = findViewById(R.id.txtGal);


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF + "\n" + dateFormat);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC + "\n" + dateFormat);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strKm = s.toString();
                Log.i("UnitConverter", "Value in txtKm = " + strKm + "\n" + dateFormat);

                if (!txtKm.isFocused()) return;
                if (strKm.length() == 0) return;

                try {
                    double valKm = Double.parseDouble(strKm);
                    double valMi = valKm * 0.6214;
                    String strMi = Double.toString(valMi);
                    Log.i("UnitConverter", "Value in txtMi = " + strMi);

                    MainActivity.this.txtMi.setText(strMi);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMi.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strMi = s.toString();
                Log.i("UnitConverter", "Value in txtMi = " + strMi + "\n" + dateFormat);

                if (!txtMi.isFocused()) return;
                if (strMi.length() == 0) return;

                try {
                    double valMi = Double.parseDouble(strMi);
                    double valKm = valMi * 1.6093;
                    String strKm = Double.toString(valKm);
                    Log.i("UnitConverter", "Value in txtKm = " + strKm);

                    MainActivity.this.txtKm.setText(strKm);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strKg = s.toString();
                Log.i("UnitConverter", "Value in txtKg = " + strKg + "\n" + dateFormat);

                if (!txtKg.isFocused()) return;
                if (strKg.length() == 0) return;

                try {
                    double valKg = Double.parseDouble(strKg);
                    double valLb = valKg * 2.2046;
                    String strLb = Double.toString(valLb);
                    Log.i("UnitConverter", "Value in txtLb = " + strLb);

                    MainActivity.this.txtLb.setText(strLb);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strLb = s.toString();
                Log.i("UnitConverter", "Value in txtLb = " + strLb + "\n" + dateFormat);

                if (!txtLb.isFocused()) return;
                if (strLb.length() == 0) return;

                try {
                    double valLb = Double.parseDouble(strLb);
                    double valKg = valLb * 0.4536;
                    String strKg = Double.toString(valKg);
                    Log.i("UnitConverter", "Value in txtKg = " + strKg);

                    MainActivity.this.txtKg.setText(strKg);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtL.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strL = s.toString();
                Log.i("UnitConverter", "Value in txtL = " + strL + "\n" + dateFormat);

                if (!txtL.isFocused()) return;
                if (strL.length() == 0) return;


                try {
                    double valL = Double.parseDouble(strL);
                    double valGal = valL * 0.2642;
                    String strGal = Double.toString(valGal);
                    Log.i("UnitConverter", "Value in txtGal = " + strGal);

                    MainActivity.this.txtGal.setText(strGal);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtGal.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy-hh:mm:ss");
                String dateFormat = date.format(new Date());
                String strGal = s.toString();
                Log.i("UnitConverter", "Value in txtGal = " + strGal + "\n" + dateFormat);

                if (!txtGal.isFocused()) return;
                if (strGal.length() == 0) return;


                try {
                    double valGal = Double.parseDouble(strGal);
                    double valL = (valGal * 3.7854);
                    String strL = Double.toString(valL);
                    Log.i("UnitConverter", "Value in txtL = " + strL);

                    MainActivity.this.txtL.setText(strL);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );


    }
}
