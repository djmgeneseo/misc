package com.example.android.buttonpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button aButton;
    private TextView aTextView;
    private EditText anEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aButton = (Button) findViewById(R.id.aButton);
        aTextView = (TextView) findViewById(R.id.aTextView);
        anEditText = (EditText) findViewById(R.id.anEditText);

        // change title of the button
        aButton.setText(R.string.show_text_button);

        // BUTTON: changes visibility of a textview, displays text from edittext
        // type aButton.setOn <-- hit enter, new OnClick <---- hit enter.
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                // set text of textview
//                aTextView.setText(R.string.show_text);

                // set text of textview to edittext entry
                String enteredText;
                enteredText = anEditText.getText().toString();
                aTextView.setText(enteredText);

                // set visibility of textview
                if (aTextView.getVisibility()==View.VISIBLE) {
                    aTextView.setVisibility(View.INVISIBLE);
                }
                else {
                    aTextView.setVisibility(View.VISIBLE);
                }
            }
        }); // OnClickListener

    }
}
