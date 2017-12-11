package com.example.david.activitypractice;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.RED;

public class SecondActivity extends AppCompatActivity {

    private Button secondActivityButton;
    private TextView messageView;
    private String mainMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Accept variables sent from MainActivity from intent class and display it
        Bundle extras = getIntent().getExtras();

//        Toast.makeText(SecondActivity.this, "Second: OnCreate Called", Toast.LENGTH_SHORT).show();

        messageView = (TextView) findViewById(R.id.messageView);

        // check the message
        if (extras !=null) {
            messageView.setTextColor(Color.DKGRAY);
            mainMessage = extras.getString("Message");
            messageView.setText(mainMessage);

        } else {
            messageView.setTextColor(Color.RED);
            messageView.setText("Return to Main and type message!");
        }

        secondActivityButton = (Button) findViewById(R.id.secondButtonId);
        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(SecondActivity.this, MainActivity.class));
                //OR
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("messageSecond", "Come back soon!");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    } // onCreate()
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Toast.makeText(SecondActivity.this, "Second: OnPostResume Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(SecondActivity.this, "Second: OnStart Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(SecondActivity.this, "Second: OnStop Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(SecondActivity.this, "Second: OnDestroy Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(SecondActivity.this, "Second: OnPause Called", Toast.LENGTH_SHORT).show();
//    }
}
