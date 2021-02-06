package com.example.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView signUp_text = findViewById(R.id.signUp_text);
        signUp_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUp.class));
                finish();
            }
        });
    }
    public void SigninMeth(View v){
        EditText eu=findViewById(R.id.username);
        EditText ep=findViewById(R.id.password);
        String usern=eu.getText().toString();
        String passw=ep.getText().toString();

        if(usern.equals("Amogha") && passw.equals("123")) {
            Intent i = new Intent(this, SOS.class);
            startActivity(i);
        }
        else{
            Context context = getApplicationContext();
            CharSequence text = "Invalid Credentials";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
