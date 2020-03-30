package com.example.cloudmessaging;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private String m_FCM_tocken;
    private Button log;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_FCM_tocken = FirebaseInstanceId.getInstance().getToken();

        log = (Button)findViewById(R.id.log);
        tv = (TextView)findViewById(R.id.tvMsg);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("FCM_DEBUG",  "FCM Tocken: " + m_FCM_tocken + "\n");
            }
        });

    }

}
