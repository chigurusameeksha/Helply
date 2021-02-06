package com.example.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }
    public void OnClickSave(View V){
        EditText en=findViewById(R.id.nametext);
        EditText ep=findViewById(R.id.phonetext);
        String s1=en.getText().toString();
        String s2=ep.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "Fill all the fields";
        int duration = Toast.LENGTH_SHORT;

        if(s1.length()<3 || s2.length()!=10){
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            text="Saved";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
    public void onClickAnother(View v){
        Intent i = new Intent(this, Contacts.class);
        startActivity(i);
    }
    public void onClickDone(View v) {
        EditText en = findViewById(R.id.nametext);
        EditText ep = findViewById(R.id.phonetext);
        String s1 = en.getText().toString();
        String s2 = ep.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "Fill all the fields";
        int duration = Toast.LENGTH_SHORT;

        if (s1.length() < 3 || s2.length() != 10) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            Intent i = new Intent(this, SOS.class);
            startActivity(i);
        }
    }
}
