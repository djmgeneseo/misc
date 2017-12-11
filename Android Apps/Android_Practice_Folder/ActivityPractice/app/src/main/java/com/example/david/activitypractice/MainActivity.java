package com.example.david.activitypractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button nextActivityButton;
    private EditText mainEditText;
    private String message;
    private final int REQUEST_CODE = 2;

    // When returning to MainActivity from SecondActivity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // resultCode = what we're expecting
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if(resultCode == RESULT_OK) {
                String result = data.getStringExtra("messageSecond");

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        }
    } // onActivityResult()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainEditText = (EditText) findViewById(R.id.mainEditText);

//        Toast.makeText(MainActivity.this, "Main: OnCreate Called", Toast.LENGTH_SHORT).show();
        nextActivityButton = (Button) findViewById(R.id.mainButtonId);
        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // An intent is an action; what needs to be done. From where to where?
//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                // OR
                // Pass additional data to next activity via intent object
                message = mainEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // key, value
                intent.putExtra("Message", message);

                // Doesn't expect a result
//                startActivity(intent);
                // Expects result
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    } // onCreate()
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Toast.makeText(MainActivity.this, "Main: OnPostResume Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(MainActivity.this, "Main: OnStart Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(MainActivity.this, "Main: OnStop Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(MainActivity.this, "Main: OnDestroy Called", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(MainActivity.this, "Main: OnPause Called", Toast.LENGTH_SHORT).show();
//    }
}
