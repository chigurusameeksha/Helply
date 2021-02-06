package com.example.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Complaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        Intent i=getIntent();
        String x=i.getStringExtra("Location");
        TextView t1=findViewById(R.id.Loc_textview);
        t1.setText(x);
    }
    public void OnClickSubmit(View v){
        Toast.makeText(Complaint.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Complaint.this,SOS.class));

    }
}
