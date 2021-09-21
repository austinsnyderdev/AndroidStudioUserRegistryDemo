package com.example.helloworld;

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

    public void onRegisterButtonClick(View view) {
        registerBackend(R.id.textFirstName, R.id.inputFirstName);
        registerBackend(R.id.textLastName, R.id.inputLastName);
        registerBackend(R.id.textEmail, R.id.inputEmail);
    }

    public void registerBackend(int idView, int idText) {
        TextView view = findViewById(idView);
        EditText edit = findViewById(idText);

        String inputString = edit.getText().toString();
        view.setText(inputString);
    }
}