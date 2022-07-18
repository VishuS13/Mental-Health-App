package com.example.chromedino;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dashboard extends AppCompatActivity {
    EditText user_name1;
    Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        user_name1=findViewById(R.id.user_name);
        move=findViewById(R.id.movefor);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String User=user_name1.getText().toString();
                Intent intent=new Intent(Dashboard.this,MainActivity3.class);
              intent.putExtra("keyname",User);
                startActivity(intent);

            }
        });


    }
}
