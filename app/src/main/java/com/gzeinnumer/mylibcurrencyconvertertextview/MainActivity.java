package com.gzeinnumer.mylibcurrencyconvertertextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        textView.setText(CurrencyTextView.changePattern("Rp ","10000"));
        textView2.setText(CurrencyTextView.trimCommaOfString("Rp ",textView.getText().toString()));
    }
}