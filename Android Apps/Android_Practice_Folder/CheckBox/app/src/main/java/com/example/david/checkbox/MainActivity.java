package com.example.david.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox pika;
    private CheckBox charm;
    private CheckBox bulb;
    private CheckBox squirt;

    private TextView resultView;

    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox pika = (CheckBox) findViewById(R.id.checkBoxPika);
        final CheckBox charm = (CheckBox) findViewById(R.id.checkBoxChar);
        final CheckBox bulb = (CheckBox) findViewById(R.id.checkBoxBulb);
        final CheckBox squirt = (CheckBox) findViewById(R.id.checkBoxSquirt);

        final TextView resultView = (TextView) findViewById(R.id.resultView);

        Button showButton = (Button) findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(pika.getText().toString() + " status is: " +
                        pika.isChecked() + "\n");
                stringBuilder.append(charm.getText().toString() + " status is: " +
                        charm.isChecked() + "\n");
                stringBuilder.append(bulb.getText().toString() + " status is: " +
                        bulb.isChecked() + "\n");
                stringBuilder.append(squirt.getText().toString() + " status is: " +
                        squirt.isChecked() + "\n");

                resultView.setText(stringBuilder);
            }
        });

    }
}
