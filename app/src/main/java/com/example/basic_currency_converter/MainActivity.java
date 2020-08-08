package com.example.basic_currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnConvert(View view) {
        EditText editTextCurrencyAmount = (EditText) findViewById(R.id.editTextCurrencyAmount);
        double  gbpConversion = 0.8;
        Editable amount = editTextCurrencyAmount.getText();

        double total = (Integer.parseInt(String.valueOf(amount)) * gbpConversion);
        Toast.makeText( this, "Total: " + total, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}