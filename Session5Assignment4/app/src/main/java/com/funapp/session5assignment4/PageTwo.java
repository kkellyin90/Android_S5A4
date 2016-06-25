package com.funapp.session5assignment4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        Bundle receivedInfo = getIntent().getExtras();

        if (receivedInfo == null) {
            return;
        }
        String receive = receivedInfo.getString("Username");
        TextView text = (TextView)findViewById(R.id.textView);
        text.setText("Welcome "+receive);
    }

}
