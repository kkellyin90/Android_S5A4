package com.funapp.session5assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mainlogin extends AppCompatActivity {
EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

        Button loginbtn = (Button)findViewById(R.id.buttonLogin);
        email = (EditText)findViewById(R.id.editLogin);
        password = (EditText)findViewById(R.id.editPassword);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page2 = new Intent(Mainlogin.this,PageTwo.class);
                page2.putExtra("Username",email.getText().toString());
                startActivity(page2);
            }
        });

    }
}
