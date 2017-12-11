package com.example.david.radiobuttons;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // a radiogroup hosts radio buttons, and only allows selection of one button per group.

    private RadioGroup radGroup;
    private RadioButton radButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        radGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            // checkedId contains Id for each radio button in radioGroup.
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                radButton = (RadioButton) findViewById(checkedId);
                switch (radButton.getId()) {
                    case R.id.yesRadioId: {
//                         Confidence check to prevent errors
//                        if (radButton.isChecked()) {
//                            Log.d("RD", "YES!");
//                        }
                        Log.d("RD", "YES!");
                    } // case yes
                    break;
                    case R.id.noRadioId: {
                        Log.d("RD", "NOPE!");
                    } // case no
                    break;
                    case R.id.maybeRadioId: {
                        Log.d("RD", "MAYBE!");
                    } // case maybe
                    break;
                } // switch
            }
        }); // RadioGroup onCheckedChangeListener

    }
}
