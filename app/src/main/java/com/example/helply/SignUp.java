package com.example.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView signIn_text = findViewById(R.id.signIn_text);
        signIn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, MainActivity.class));
                finish();
            }
        });
    }

    public void SignupMeth(View v){
        EditText eu=findViewById(R.id.username_s);
        EditText em=findViewById(R.id.email_s);
        EditText ep=findViewById(R.id.password_s);
        String usern=eu.getText().toString();
        String email=em.getText().toString();
        String passw=ep.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "Fill all the fields";
        int duration = Toast.LENGTH_SHORT;
        if(usern.length()<3 || email.length()==0){
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else if(usern.equals("Amogha") && passw.equals("123")) {
            text = "Already Exists";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else{
            Intent i = new Intent(this, Contacts.class);
            startActivity(i);
        }
    }
}
