package com.example.david.seekbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView resultText;
    private TextView resultText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = (TextView) findViewById(R.id.resultId);
        resultText2 = (TextView) findViewById(R.id.resultId2);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        resultText.setText("Attractive Level: " + seekBar.getProgress() + "/"
                + seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // Log.d("SB", "PROGRESS!");

                resultText.setText("Attractive Level: " + seekBar.getProgress() + "/"
                 + seekBar.getMax());

                if (seekBar.getProgress() == 8) {
                    resultText2.setText("Kit Harington...? Is that you?");
                }
                else if (seekBar.getProgress() == 9) {
                    resultText2.setText("This is too good to be true.");
                }
                else if (seekBar.getProgress() == 10) {
                    resultText2.setText("...you're only fooling yourself.");
                } else {
                    resultText2.setText("");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Log.d("SB", "TOUCH!");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Log.d("SB", "STOP!");
                if (seekBar.getProgress() >= 7) {
                    resultText.setTextColor(Color.RED);
                } else {
                    resultText.setTextColor(Color.DKGRAY);
                }
            }
        });

    }
}
